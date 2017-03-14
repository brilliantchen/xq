package com.xq.woa.back.web.hello;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
	
	private static Logger logger = LoggerFactory.getLogger(HelloWorld.class);
	//@Autowired
	//private MemcachedUtil memcachedUtil;
	
	/*@Autowired
	@Qualifier("jmsProducer")*/
	
	@RequestMapping("/index") //用来处理前台的login请求  
    private String hello(Model model,HttpServletRequest request,HttpServletResponse response){
		logger.debug("in hello world... sessionId:"+request.getSession().getId());
		
		/*for (int i = 0; i < 100; i++) {
			User usr = new User();
			usr.setName("name"+i);
			usr.setPwd("pwd"+i);
			memcachedUtil.add(String.valueOf(i), usr);
		}*/
        return "login";  
    }  
	
	
	@RequestMapping("/login") //用来处理前台的login请求  
    private @ResponseBody String hello(  
            @RequestParam(value = "username", required = false)String username,  
            @RequestParam(value = "password", required = false)String password  
            ){  
		
        return "Hello "+username+",Your password is: "+password ;
        		//+" cache:"+((User)memcachedUtil.get(username)).toString();  
        
    }  

}
