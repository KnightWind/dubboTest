package com.wcb.duboo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wcb.dubbo.test.SayHello;

public class LocalComsumeThd implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(    
                new String[]{"applicationConsumerProc.xml"});    
        context.start();    
    
//        IProcessData demoService = (IProcessData) context.getBean("demoService"); // get    
        IProcessData processService = (IProcessData) context.getBean("procService"); // get    
                                                                                // service    
        // proxy    
        String hello = processService.processData("martin"); // do invoke!    
    
        System.out.println(Thread.currentThread().getName() + " "+hello);    
	}
	
	
	
	
	public static void main(String []args){
		
		new Thread(new LocalComsumeThd()).start();
	}

}
