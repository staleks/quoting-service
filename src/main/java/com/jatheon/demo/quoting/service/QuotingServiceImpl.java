package com.jatheon.demo.quoting.service;

import com.jatheon.demo.quoting.model.Quoting;
import com.jatheon.demo.quoting.model.dto.QuotingDTO;
import com.jatheon.demo.quoting.repository.QuotingRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class QuotingServiceImpl implements QuotingService {

    private QuotingRepository quotingRepository;

    public QuotingServiceImpl(QuotingRepository quotingRepository) {
        this.quotingRepository = quotingRepository;
    }

    @Override
    public List<QuotingDTO> findByDestination(final Long destinationId) {
        return mapFromList(quotingRepository.findByDestinationId(destinationId));
    }

    @Override
    public List<QuotingDTO> findByDestinationAndBetweenDates(final Long destinationId, final LocalDate startDate,
                                                             final LocalDate endDate) {
        return mapFromList(quotingRepository.findByDestinationIdAndPricingDateBetween(destinationId, startDate, endDate));
    }

    /**
     * @param quoting
     * @return
     */
    private QuotingDTO mapFromEntity(Quoting quoting) {
        return new QuotingDTO(quoting.getId(), quoting.getDestinationId(), quoting.getPricingDate(), quoting.getPrice());
    }

    private List<QuotingDTO> mapFromList(List<Quoting> quotingList) {
        List<QuotingDTO> result = new ArrayList<>();
        for (Quoting quotingItem: quotingList) {
            result.add(mapFromEntity(quotingItem));
        }
        return result;
    }


}
