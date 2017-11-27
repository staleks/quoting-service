package com.jatheon.demo.quoting.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_quoting")
public class Quoting extends AbstractPersistable<Long> {

    @Column(name = "destination_id")
    private Long destinationId;

    @Column(name = "pricing_date")
    private LocalDate pricingDate;

    @Column(name = "price")
    private BigDecimal price;


    public Quoting() {

    }

    public Long getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(final Long destinationId) {
        this.destinationId = destinationId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    public LocalDate getPricingDate() {
        return pricingDate;
    }

    public void setPricingDate(final LocalDate pricingDate) {
        this.pricingDate = pricingDate;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }

}
