package com.hgits.hotc.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class GantryCountSend implements Serializable {

    private static final long serialVersionUID = -5594322137083735836L;

    private String msgId;

    private String collectId;

    private String gantryId;

    private Integer computerOrder;

    private String collectDate;

    private String collectHourBatch;

    private Integer batchCount;

    private String etcTypeCount;

    private String etcClassCount;

    private Long etcSuccessCount;

    private Long etcSuccessFee;

    private Long etcFailCount;

    private String cpcTypeCount;

    private String cpcClassCount;

    private Long cpcSuccessCount;

    private Long cpcSuccessFee;

    private Long cpcFailCount;
}
