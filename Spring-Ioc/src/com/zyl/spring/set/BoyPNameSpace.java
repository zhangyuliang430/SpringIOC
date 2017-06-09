package com.zyl.spring.set;

import org.apache.catalina.core.ApplicationContext;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.Getter;
import lombok.Setter;


public class BoyPNameSpace {
	private static Logger logger=Logger.getLogger(BoyPNameSpace.class);
	  
	//声明接口类型的引用 ，和具体实现类的解耦合
	@Setter
	@Getter
	private GirlFirend girlFirend;
	private static ClassPathXmlApplicationContext ctx;

	public static void main(String[] args) {
	 ctx=new ClassPathXmlApplicationContext("applicationContext-set.xml");
		BoyPNameSpace boy =(BoyPNameSpace) ctx.getBean("boyPNameSpace");
		logger.info(boy.girlFirend.speak());

	}

}
