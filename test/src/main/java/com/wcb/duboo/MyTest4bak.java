package com.wcb.duboo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest4bak {
	
	public static void main(String [] args) throws IOException{
		
		
		System.out.println("Hello dubbo!");
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(    
                new String[]{"applicationProvider4bak.xml"});    
        context.start();  
    
        System.out.println("Press any key to exit.");    
        System.in.read();  
	}

}
