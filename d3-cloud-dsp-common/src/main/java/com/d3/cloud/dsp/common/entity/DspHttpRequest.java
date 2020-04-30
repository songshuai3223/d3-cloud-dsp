package com.d3.cloud.dsp.common.entity;

import lombok.Data;

import java.util.Map;

@Data
public class DspHttpRequest {

    private String system_id;
    private String vender_id;
    private String department_id;
    private String query_timestamp;
    private String UID;
    private Map query;
    private Map data;
    private AuditInfo auditInfo;
}
