package com.zyl.spring.set;


import lombok.Getter;
import lombok.Setter;

public class ChinaGirlFirend  implements GirlFirend{
	@Setter
	@Getter
	private String language;
	   @Override
	   public String speak(){
		   return language;
	   }
	  

	

}
