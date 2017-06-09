package com.zyl.spring.set;

import org.springframework.context.ApplicationContext;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class BoyConstructor {
	private static  Logger logger=Logger.getLogger(BoyConstructor.class);
	//�����ӿ����͵����ã��;���ʵ��������
	private GirlFirend girlFirend;
	private static ClassPathXmlApplicationContext ctx;
	public   BoyConstructor() {	
		
	}
	//����girlFirend���Եĸ�ֵ�Ĺ��췽��
	public BoyConstructor(GirlFirend girlFirend){
		this.girlFirend =girlFirend;
		
	}
	public static void main(String[] args) {
		ctx=new ClassPathXmlApplicationContext("applicationContext-set.xml");
         BoyConstructor boy=(BoyConstructor) ctx.getBean("boyConstructor");
	   logger.info(boy.girlFirend.speak());
	}

}
