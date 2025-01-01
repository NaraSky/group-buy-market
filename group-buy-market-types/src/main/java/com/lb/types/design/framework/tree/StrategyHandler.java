package com.lb.types.design.framework.tree;

public interface StrategyHandler<T, D, R> {

    /**
     * 默认处理器
     */
    StrategyHandler DEFAULT = (T, D) -> null;

    /**
     * 处理器
     * @param requestParameter 请求参数
     * @param dynamicContext 动态上下文
     * @return 处理结果
     * @throws Exception 异常
     */
    R apply(T requestParameter, D dynamicContext) throws Exception;
}
