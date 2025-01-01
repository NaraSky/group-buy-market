package com.lb.domain.activity.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TrialBalanceEntity {

    /**
     * goods ID
     */
    private String goodsId;

    /**
     * goods name
     */
    private String goodsName;

    /**
     * original price
     */
    private BigDecimal originalPrice;

    /**
     * discount price
     */
    private BigDecimal deductionPrice;

    /**
     * Target count for group buying
     */
    private Integer targetCount;

    /**
     * Group buying start time
     */
    private Date startTime;

    /**
     * Group buying end time
     */
    private Date endTime;

    /**
     * Is group buying visible
     */
    private Boolean isVisible;

    /**
     * Is group buying enabled
     */
    private Boolean isEnable;
}
