package com.xq.weini.guanyi.entity.param;

import com.xq.weini.guanyi.entity.GyBaseParam;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
public class GyStockParam extends GyBaseParam {

  private Integer page_no;
  private Integer page_size;
  private String item_code;
  private String sku_code;
  private String warehouse_code;

  @Data
  public static class GyAddOrdDetail {

    private int qty;
    private double price;
    private String note;
    private double refund;
    private String oid;
    private String item_code;
    private String sku_code;

  }

  @Data
  public static class GyAddOrderParam {

    private String appkey;
    private String sessionkey;
    private String method;
    private String sign;

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
    private List<GyAddOrdInvoice> invoices;
    /** mandatory */
    private List<GyAddOrdPayment> payments;
    private List<GyAddOrdDetail> details;

  }

  @Data
  public static class GyAddOrdInvoice {

    private int invoice_type;
    private String invoice_title;
    private String invoice_content;
    private String invoice_amount;
    private String bill_amount;


  }

  @Data
  public static class GyAddOrdPayment {

    private double payment;
    private String paytime;
    private String account;
    private String pay_type_code;
    private String pay_code;


  }
}
