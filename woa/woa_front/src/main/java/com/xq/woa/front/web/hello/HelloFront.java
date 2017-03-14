package com.xq.woa.front.web.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xq.woa.base.service.IBackClientService;

@Controller
public class HelloFront {
private static Logger logger = LoggerFactory.getLogger(HelloFront.class);
	
	@Autowired
	private IBackClientService backClientServiceRemote;
	
	
	@RequestMapping("/index") //用来处理前台的login请求  
	@ResponseBody
    private String index(){  
		logger.info("--------front in");
        return "hello front index";
        
    }  
	
	
	@RequestMapping("/hello")   
	@ResponseBody
    private String hello(){  
		logger.info("--------front in");
        return  backClientServiceRemote.appName("woa_front");
        
    }  
}
