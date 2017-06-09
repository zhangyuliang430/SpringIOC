package com.zyl.spring.type;




import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Setter;

@Setter
public class DataType {
	private String specialcharacter1;//�����ַ�1
	private String specialcharacter2;//�����ַ�2
	private  User innerBean;//javabean����
	private  List<String> list;//list ����
	private   String[] array;//��������
	private  Set<String> set;//set����
	private   Map<String,String> map;//map����
	private  Properties props;
	private  String emptyValue;
	private  String nullValue="init null";
	 
	public void printValue(){
		PrintStream out=System.out;
		out.println("�����ַ�1��"+this.specialcharacter1);
		out.println("�����ַ�2��"+this.specialcharacter2);
		out.println("�ڲ�Bean��"+this.innerBean);
		out.println("List���ԣ�"+this.list);
		out.println("�������ԣ�"+this.array);
		out.println("set���ԣ�"+this.set);
		out.println("map���ԣ�"+this.map);
		
		out.println("Properties��"+this.props);
		out.println("ע����ַ�����["+this.emptyValue+"]");
		out.println("ע��nullֵ��"+this.nullValue);
		
	}



}
