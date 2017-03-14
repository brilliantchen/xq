package com.xq.woa.back.web.hello;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestThread {
	
	private static Logger logger = LoggerFactory.getLogger(TestThread.class);
	//volatile
	public  boolean stop = false;
	
	@RequestMapping("/threadRun")
	@ResponseBody
    private String threadRun(){
		logger.debug(""+new Date());
		logger.debug(new Date()+":"+simulateSlowService()+" "+stop);  
		logger.debug(new Date()+":"+simulateSlowService()+" "+stop);
		logger.debug(new Date()+":"+simulateSlowService()+" "+stop);  
		logger.debug(new Date()+":"+simulateSlowService()+" "+stop);
		logger.debug(new Date()+":"+simulateSlowService()+" "+stop);  
		logger.debug(new Date()+":"+simulateSlowService()+" "+stop);
		this.stop = false;
        return "index";  
    } 
	
	@RequestMapping("/threadStop")
	@ResponseBody
    private String threadStop(){
		this.stop = true;
		logger.debug(" "+stop);
        return "index";  
    } 
	
	private String simulateSlowService() {
		try {
			long time = 2000L;
			Thread.sleep(time);
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
		return "";
	}
	
}
