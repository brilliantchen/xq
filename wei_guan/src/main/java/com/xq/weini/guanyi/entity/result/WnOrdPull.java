package com.xq.weini.guanyi.entity.result;

import java.util.List;
import lombok.Data;

@Data
public class WnOrdPull {

  private String OrderTime;

  private String ConsigneeName;

  private int PostalTotal;

  private String OrderStatus;

  private int DiscountTotal;

  private String SendTime;

  private String IdCard;

  private String PostId;

  private String WmsName;

  private String Province;

  private String ConsigneeNumber;

  private String City;

  private int SettleTotal;

  private String DetailedAddres;

  private String District;

  private int OrderTotal;

  private String LogisticName;

  private List<WnOrdPullItems> OrderItems ;

  private int TaxFee;

  private String Remark;


}
