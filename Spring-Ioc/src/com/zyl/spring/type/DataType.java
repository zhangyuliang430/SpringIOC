package com.zyl.spring.type;




import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Setter;

@Setter
public class DataType {
	private String specialcharacter1;//特殊字符1
	private String specialcharacter2;//特殊字符2
	private  User innerBean;//javabean类型
	private  List<String> list;//list 类型
	private   String[] array;//数组类型
	private  Set<String> set;//set类型
	private   Map<String,String> map;//map类型
	private  Properties props;
	private  String emptyValue;
	private  String nullValue="init null";
	 
	public void printValue(){
		PrintStream out=System.out;
		out.println("特殊字符1："+this.specialcharacter1);
		out.println("特殊字符2："+this.specialcharacter2);
		out.println("内部Bean："+this.innerBean);
		out.println("List属性："+this.list);
		out.println("数组属性："+this.array);
		out.println("set属性："+this.set);
		out.println("map属性："+this.map);
		
		out.println("Properties："+this.props);
		out.println("注入空字符串：["+this.emptyValue+"]");
		out.println("注入null值："+this.nullValue);
		
	}



}
