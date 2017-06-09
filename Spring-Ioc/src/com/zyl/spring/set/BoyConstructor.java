package com.zyl.spring.set;

import org.springframework.context.ApplicationContext;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class BoyConstructor {
	private static  Logger logger=Logger.getLogger(BoyConstructor.class);
	//声明接口类型的引用，和具体实现类解耦合
	private GirlFirend girlFirend;
	private static ClassPathXmlApplicationContext ctx;
	public   BoyConstructor() {	
		
	}
	//用于girlFirend属性的赋值的构造方法
	public BoyConstructor(GirlFirend girlFirend){
		this.girlFirend =girlFirend;
		
	}
	public static void main(String[] args) {
		ctx=new ClassPathXmlApplicationContext("applicationContext-set.xml");
         BoyConstructor boy=(BoyConstructor) ctx.getBean("boyConstructor");
	   logger.info(boy.girlFirend.speak());
	}

}
