package com.mongodb.Blog;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class HelloWorldFreeMarker {
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Configuration configuration=new Configuration();
		configuration.setClassForTemplateLoading(HelloWorldFreeMarker.class, "/hello");
		//-------Bootstrap code ends---------//
		
		try {
			Template helloTemplate=configuration.getTemplate("hello.ftl");
			StringWriter writer=new StringWriter();
			Map<String,Object> helloMap=new HashMap<>();
			helloMap.put("name", "Freemarker");
			helloTemplate.process(helloMap, writer);
			
			System.out.println(writer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
