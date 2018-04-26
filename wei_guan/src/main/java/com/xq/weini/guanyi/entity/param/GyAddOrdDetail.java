package com.xq.weini.guanyi.entity.param;

import lombok.Data;

@Data
public class GyAddOrdDetail {

  private int qty;
  private double price;
  private String note;
  private double refund;
  private String oid;
  private String item_code;
  private String sku_code;

}
