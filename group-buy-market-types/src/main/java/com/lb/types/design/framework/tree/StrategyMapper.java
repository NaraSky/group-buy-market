package com.lb.types.design.framework.tree;

public interface StrategyMapper<T, D, R> {

    /**
     * 获取处理器
     * @param requestParameter 请求参数
     * @param dynamicContext 动态上下文
     * @return 处理器
     * @throws Exception 异常
     */
    StrategyHandler<T, D, R> get(T requestParameter, D dynamicContext) throws Exception;
}
