package com.zyl.spring.set;

import org.springframework.context.ApplicationContext;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import lombok.Getter;
import lombok.Setter;


public class BoySetter {
	private static Logger logger=Logger.getLogger(BoySetter.class); 
  
	//�����ӿ����͵����ã��;���ʵ��������
	@Setter
	@Getter
	private GirlFirend girlFirend;
	private  static ClassPathXmlApplicationContext ctx;
	
	public static void main(String[] args) {
	ctx=new ClassPathXmlApplicationContext("applicationContext-set.xml"); 
    BoySetter boy=(BoySetter) ctx.getBean("boySetter");
	logger.info(boy.girlFirend.speak());
	}

}
