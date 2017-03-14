package com.xq.woa.back.client;

import org.springframework.stereotype.Service;

import com.xq.woa.base.service.IBackClientService;

@Service("backClientServiceRemote")
public class BackClientServiceImpl implements IBackClientService {

	public String appName(String consumerName) {
		return "call woa_back."+"consumer:"+consumerName;
	}

}
