package com.lb.domain.activity.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MarketProductEntity {

    /** User ID */
    private String userId;

    /** Product ID */
    private String goodsId;

    /** Source */
    private String source;

    /** Channel */
    private String channel;
}
