package com.xq.weini.guanyi.service.impl;

import com.alibaba.fastjson.JSON;
import com.xq.weini.guanyi.comm.GuanYiConstants;
import com.xq.weini.guanyi.comm.util.GuanYiUtil;
import com.xq.weini.guanyi.entity.param.GyStockParam;
import com.xq.weini.guanyi.service.GyStockService;
import org.springframework.stereotype.Service;

@Service
public class GyStockServiceImpl implements GyStockService {

  @Override
  public String getStock() {
    GyStockParam param = new GyStockParam();
    param.setAppkey(GuanYiConstants.appKey);
    param.setSessionkey(GuanYiConstants.sessionkey);
    param.setMethod(GuanYiConstants.method_gy_erp_stock_get);
    param.setPage_no(1);
    param.setPage_size(100);
    param.setSign(GuanYiUtil.sign(JSON.toJSONString(param), GuanYiConstants.secret));
    return JSON.toJSONString(param);
  }


  public static void main(String[] args) {
    GyStockParam param = new GyStockParam();
    param.setAppkey(GuanYiConstants.appKey);
    param.setSessionkey(GuanYiConstants.sessionkey);
    param.setMethod(GuanYiConstants.method_gy_erp_stock_get);
    //param.setPage_no(1);
    //param.setPage_size(100);
    param.setSign(GuanYiUtil.sign(JSON.toJSONString(param), GuanYiConstants.secret));
    System.out.println(JSON.toJSONString(param));
  }

}
