package com.ithjc.pojo;

import lombok.Data;

@Data
public class Goods {
    private long id;
    private String goodsName;
    private double goodsPrice;
    private long goodsNum;
    private String goodsType;
    private String remark;
}

