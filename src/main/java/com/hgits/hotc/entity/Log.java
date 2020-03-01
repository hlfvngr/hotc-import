package com.hgits.hotc.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Accessors(chain = true)
@Table(name = "tb_Import_Logs")
public class Log implements Serializable {

    private static final long serialVersionUID = -1536322851331305259L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private Integer sumType;

    private String fileName;

    private Date importTime;

    private Integer result;
}
