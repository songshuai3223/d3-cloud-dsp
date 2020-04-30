package com.d3.cloud.dsp.common.entity;

import lombok.Data;

@Data
public class AuditInfo {
    private String operator_id;
    private String operator_name;
    private String query_object_id;
    private String query_object_id_type;
    private String item_id;
    private String item_code;
    private String item_sequence;
    private String inal_info;
    private String query_timestamp;
}
