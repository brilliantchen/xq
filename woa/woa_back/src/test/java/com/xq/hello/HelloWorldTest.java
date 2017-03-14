package com.xq.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xq.woa.back.hello.HelloWorld;
import com.xq.woa.back.jms.JmsProducer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:applicationContext-woa_back-beans.xml" })
public class HelloWorldTest {
	
	private static Logger logger = LoggerFactory.getLogger(HelloWorld.class);
	
	@Autowired
	@Qualifier("jmsProducer")
	private JmsProducer jmsProducer;

	@Test
	public void testSendMsg() {
		logger.info("11111111");
		jmsProducer.sendMsg("XXXQ", "my msg444");
	}

}
