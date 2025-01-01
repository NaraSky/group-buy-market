package com.lb.types.design.framework.tree;

public abstract class AbstractStrategyRouter <T, D, R> implements StrategyMapper<T, D, R> , StrategyHandler<T, D, R> {

    protected StrategyHandler<T,D, R> defaultStrategyHandler = StrategyHandler.DEFAULT;

    /**
     * 路由
     * @param requestParameter 请求参数
     * @param dynamicContext 动态上下文
     * @return 处理结果
     * @throws Exception
     */
    public R router(T requestParameter, D dynamicContext) throws Exception {
        StrategyHandler<T, D, R> tdrStrategyHandler = get(requestParameter, dynamicContext);
        if (tdrStrategyHandler != null) {
            return tdrStrategyHandler.apply(requestParameter, dynamicContext);
        }
        return defaultStrategyHandler.apply(requestParameter, dynamicContext);
    }
}
