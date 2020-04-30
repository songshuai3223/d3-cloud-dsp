package com.d3.cloud.dsp.common.entity;


import lombok.Data;

@Data
public class DspHttpResponse {
    private int errcode;
    private String errmsg;
    private DspHttpResponseData data;
}
