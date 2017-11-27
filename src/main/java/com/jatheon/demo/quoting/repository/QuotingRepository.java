package com.jatheon.demo.quoting.repository;

import com.jatheon.demo.quoting.model.Quoting;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface QuotingRepository extends PagingAndSortingRepository<Quoting, Long> {

    /**
     * @param destinationId
     * @return
     */
    List<Quoting> findByDestinationId(Long destinationId);

    /**
     * @param destinationId
     * @param destinationId
     * @param startDate
     * @param endDate
     * @return
     */
    List<Quoting> findByDestinationIdAndPricingDateBetween(Long destinationId, LocalDate startDate, LocalDate endDate);

}
