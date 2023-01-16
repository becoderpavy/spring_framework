package com.becoder.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/spel/config.xml");

		Student st = context.getBean("student", Student.class);
		//System.out.println(st.terinaryCheck);
		
		//System.out.println(st.num);
		//System.out.println(st.result);
		
		
		SpelExpressionParser parser=new SpelExpressionParser();
		org.springframework.expression.Expression ex=parser.parseExpression("'Hello world'");
		System.out.println(ex.getValue());
		
		
		
	}

}
