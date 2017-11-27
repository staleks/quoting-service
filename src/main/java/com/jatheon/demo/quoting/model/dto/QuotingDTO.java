package com.jatheon.demo.quoting.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.time.LocalDate;

public class QuotingDTO {

    private Long id;
    private Long destinationId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate pricingDate;
    private BigDecimal price;

    public QuotingDTO(Long id, Long destinationId, LocalDate pricingDate, BigDecimal price) {
        this.id = id;
        this.destinationId = destinationId;
        this.pricingDate = pricingDate;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public Long getDestinationId() {
        return destinationId;
    }

    public LocalDate getPricingDate() {
        return pricingDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }
}
