package com.zyl.spring.set;

import org.springframework.context.ApplicationContext;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import lombok.Getter;
import lombok.Setter;


public class BoySetter {
	private static Logger logger=Logger.getLogger(BoySetter.class); 
  
	//声明接口类型的引用，和具体实现类解耦合
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
