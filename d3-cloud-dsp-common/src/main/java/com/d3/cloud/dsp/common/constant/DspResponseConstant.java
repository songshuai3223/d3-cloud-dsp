package com.d3.cloud.dsp.common.constant;

public class DspResponseConstant {
    /***
     * 成功
     */
    public static final int OK = 0;

    /***
     * 无效请求
     */
    public static final int INVALID_PARAMETER = 400;

    /***
     *  内部返回错误
     */
    public static final int SERVICE_RETURN_ERROR_ = 403;

    /**
     * 服务异常
     */
    public static final int SERVICE_UNAVAILABLE = 503;

    /**
     * 异常返回
     */
    public static final int EXPECTATION_FAILED = 417;

    /**
     * 请求超时
     */
    public static final int CONNECTION_TIME_OUT = 408;
}
