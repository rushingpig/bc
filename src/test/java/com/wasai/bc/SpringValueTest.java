package com.wasai.bc;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wasai.bc.service.item.impl.MessageServiceImpl;

/**
 * @desc   
 * @author Pigo.can
 * @email  rushingpig@163.com
 * @date   2015年8月27日 下午6:41:28
 * @version V1.0 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring/spring-context.xml"})
public class SpringValueTest {
	
//	@Value("${jdbc.url}")
//	private String url;
	
	@Resource
	private MessageServiceImpl messageServiceImpl;
	
	
	@Test
	public void testValue(){
	}
}
