package com.jatheon.demo.quoting.service;

import com.jatheon.demo.quoting.model.dto.QuotingDTO;

import java.time.LocalDate;
import java.util.List;

public interface QuotingService {

    /**
     * @param destinationId
     * @return
     */
    List<QuotingDTO> findByDestination(Long destinationId);

    /**
     * @param destinationId
     * @param startDate
     * @param endDate
     * @return
     */
    List<QuotingDTO> findByDestinationAndBetweenDates(Long destinationId, LocalDate startDate, LocalDate endDate);

}
