package com.lb.domain.activity.service.trial.node;

import com.lb.domain.activity.model.entity.MarketProductEntity;
import com.lb.domain.activity.model.entity.TrialBalanceEntity;
import com.lb.domain.activity.service.trial.AbstractGroupBuyMarketSupport;
import com.lb.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import com.lb.types.design.framework.tree.StrategyHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @description 根节点
 */
@Slf4j
@Service
public class RootNode extends AbstractGroupBuyMarketSupport<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> {

    @Override
    public TrialBalanceEntity apply(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {
        return null;
    }

    @Override
    public StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> get(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {
        return null;
    }

}
