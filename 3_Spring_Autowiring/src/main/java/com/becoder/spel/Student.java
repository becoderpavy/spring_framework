package com.becoder.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("#{2+3}")
	public int sum;

	@Value("#{5-3}")
	public int sub;

	@Value("#{2*3}")
	public int mul;

	@Value("#{15/3}")
	public int div;

	@Value("#{1 lt 3}")
	public boolean equalvalid;
	
	public static String call()
	{
		return "Method Call";
	}
	
	
	@Value("#{1==3 || 2==2}")
	public boolean checkStatus;
	
	
	@Value("#{2<3 ? 'Yes' : 'NO'}")
	public String terinaryCheck;
	
	@Value("#{T(java.lang.Math).PI}")
	public int num;

	
	@Value("#{T(com.becoder.spel.Student).call()}")
	public String result;
	
}
