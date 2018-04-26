package com.xq.weini.guanyi.entity.param;

import com.xq.weini.guanyi.entity.GyBaseParam;
import com.xq.weini.guanyi.entity.param.GyStockParam;import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
public class GyAddOrderParam extends GyBaseParam {

  private String order_type_code;
  private int refund;
  private boolean cod;
  private String order_settlement_code;
  private String platform_code;
  /** mandatory */
  private String shop_code;
  /** mandatory */
  private String express_code;
  /** mandatory */
  private String warehouse_code;
  /** mandatory */
  private String vip_code;
  private String vip_name;
  private String receiver_name;
  private String receiver_address;
  private String receiver_zip;
  private String receiver_mobile;
  private String receiver_phone;
  private String receiver_province;
  private String receiver_city;
  private String receiver_district;
  private String tag_code;
  /** mandatory */
  private String deal_datetime;
  private String pay_datetime;
  private String business_man_code;
  private double post_fee;
  private double cod_fee;
  private double discount_fee;
  private Date plan_delivery_date;
  private String buyer_memo;
  private String seller_memo;
  private String seller_memo_late;
  private String vipIdCard;
  private String vipRealName;
  private String vipEmail;
  /** mandatory */
  private List<GyStockParam.GyAddOrdInvoice> invoices;
  /** mandatory */
  private List<GyStockParam.GyAddOrdPayment> payments;
  private List<GyStockParam.GyAddOrdDetail> details;

}
