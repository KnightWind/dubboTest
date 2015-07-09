package com.wcb.duboo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wcb.dubbo.test.SayHello;

public class ComsumeThd implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(    
                new String[]{"applicationConsumer.xml"});    
        context.start();    
    
//        IProcessData demoService = (IProcessData) context.getBean("demoService"); // get    
        SayHello helloService = (SayHello) context.getBean("helloService"); // get    
                                                                                // service    
        // proxy    
        String hello = helloService.sayHello("martin Wang"); // do invoke!    
        
        // service    
        IProcessData processService = (IProcessData) context.getBean("procService"); // get    
	  
		String prodata = processService.processData("martin"); // do invoke!    
    
        System.out.println(Thread.currentThread().getName() + " "+hello  +"   process: "+prodata);    
	}
	
	
	public static void main(String []args){
		
		new Thread(new ComsumeThd()).start();
	}

}
