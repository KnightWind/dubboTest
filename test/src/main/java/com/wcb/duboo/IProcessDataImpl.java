package com.wcb.duboo;

public class IProcessDataImpl implements IProcessData {

	public String processData(String data) {
		// TODO Auto-generated method stub
//		return null;
		try{
			
			Thread.sleep(1000l);
		}catch(Exception e){
			
			
			e.printStackTrace();
		}
		
		return "Flished process:"+data;
	}
	
}
