package com.wcb.test.impl;

import com.wcb.dubbo.test.SayHello;

public class MySayHello implements SayHello {

	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello! "+name;
	}

}
