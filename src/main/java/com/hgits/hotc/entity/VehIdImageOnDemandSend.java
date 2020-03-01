package com.hgits.hotc.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_VehIdImageOnDemand_Recv")
public class VehIdImageOnDemandSend implements Serializable {

    private static final long serialVersionUID = -6980631716063500885L;

    private String msgId;

    private String id;

    private String image;

    private String tailImage;

    private Integer spare1;

    private Integer spare2;

    private Integer spare3;

    private String spare4;

    private String spare5;

    private String spare6;
}
