package com.soapTest.Controller;


import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.soapTest.Dto.Category;

@WebService
public class TestClass {
	
	public int addNum(int a,int b){
		return a+b;
	}

}
