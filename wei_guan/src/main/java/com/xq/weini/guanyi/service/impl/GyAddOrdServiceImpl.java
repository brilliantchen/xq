package com.xq.weini.guanyi.service.impl;

import com.xq.weini.guanyi.comm.GuanYiConstants;
import com.xq.weini.guanyi.comm.util.DateUtil;
import com.xq.weini.guanyi.entity.param.GyStockParam.GyAddOrdInvoice;
import com.xq.weini.guanyi.entity.param.GyStockParam.GyAddOrdPayment;
import com.xq.weini.guanyi.entity.param.GyStockParam.GyAddOrderParam;
import com.xq.weini.guanyi.service.GyAddOrdService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GyAddOrdServiceImpl implements GyAddOrdService {



  public void mockGyOrder() {
    //DateUtil.dateToString(new Date())
    String date = DateUtil.dateToString(new Date());//"2017-09-29 10:00:00";
    GyAddOrderParam gyOrd = new GyAddOrderParam();
    gyOrd.setAppkey(GuanYiConstants.appKey);
    gyOrd.setSessionkey(GuanYiConstants.sessionkey);
    gyOrd.setMethod(GuanYiConstants.method_gy_erp_item_add);
    //gyOrd.setOrder_type_code("weini");
    //gyOrd.setRefund(0);
    gyOrd.setPlatform_code("weiniOrderNo");
    gyOrd.setShop_code("weini");
    //gyOrd.setExpress_code("");
    gyOrd.setWarehouse_code("都快仓库");
    gyOrd.setVip_code("10000312");
    gyOrd.setVip_name("lvmmmm");
    gyOrd.setReceiver_name("王明");
    gyOrd.setReceiver_address("东方路100号");
    gyOrd.setReceiver_zip("0230");
    gyOrd.setReceiver_mobile("13129887654");
    gyOrd.setReceiver_phone("13129887654");
    gyOrd.setReceiver_province("上海市");
    gyOrd.setReceiver_city("上海市");
    gyOrd.setReceiver_district("浦东新区");
    gyOrd.setDeal_datetime(date);
    gyOrd.setPay_datetime(date);
    //gyOrd.setBusiness_man_code("");
    gyOrd.setBuyer_memo("买家留言");
    //gyOrd.setVipIdCard("00001");
    //gyOrd.setVipRealName("viper");

    GyAddOrdInvoice invoice = new GyAddOrdInvoice();
    invoice.setInvoice_type(1);
    List<GyAddOrdInvoice> invoices = new ArrayList<>();
    invoices.add(invoice);
    gyOrd.setInvoices(invoices);
    GyAddOrdPayment payment = new GyAddOrdPayment();
    payment.setPayment(100);
    payment.setPaytime(date);
    payment.setPay_type_code("pay_type_code");
    List<GyAddOrdPayment> payments = new ArrayList<>();
    payments.add(payment);
    gyOrd.setPayments(payments);
    //log.info(JSON.toJSONString(gyOrd));
    //gyOrd.setSign(GuanYiUtil.sign(JSON.toJSONString(gyOrd), GuanYiConstants.secret));
    //log.info(JSON.toJSONString(gyOrd));

  }




  }
