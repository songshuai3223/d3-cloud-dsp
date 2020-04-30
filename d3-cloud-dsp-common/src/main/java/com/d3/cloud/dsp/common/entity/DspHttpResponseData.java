package com.d3.cloud.dsp.common.entity;


import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class DspHttpResponseData {
    private List data;
    private Map metaData;
}
