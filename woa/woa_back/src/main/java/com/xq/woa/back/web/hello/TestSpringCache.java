package com.xq.woa.back.web.hello;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestSpringCache {
	
	private static Logger logger = LoggerFactory.getLogger(TestSpringCache.class);
	
	//@Autowired
	//private IBookRepository bookRepository;
	
	@RequestMapping("/testCache")
	@ResponseBody
    private String test(){
		logger.debug("" + new Date());
		/*logger.debug(new Date()+":"+bookRepository.getByIsbn("1"));  
		logger.debug(new Date()+":"+bookRepository.getByIsbn("2"));
		logger.debug(new Date()+":"+bookRepository.getByIsbn("1"));  
		logger.debug(new Date()+":"+bookRepository.getByIsbn("2"));
		logger.debug(new Date()+":"+bookRepository.getByIsbn("1"));  
		logger.debug(new Date()+":"+bookRepository.getByIsbn("2"));*/
		
        return "index";  
    }  

}
