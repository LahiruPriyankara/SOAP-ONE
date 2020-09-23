package com.soapTest.Controller;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.soapTest.Dto.Category;
import com.soapTest.bl.CategoryMng;
import com.soapTest.bl.CategoryMngImpl;

//name space - 
@WebService(endpointInterface="com.soapTest.Controller.CategoryMngService", portName="CategoryMng", serviceName="CategoryMngService")
public class CategoryMngServiceImpl implements CategoryMngService{
	CategoryMng catMng = new CategoryMngImpl();
// action - allows us to give a name to he action. operationName- giving a name to the operation.
	@WebMethod(action="fetchCategories" , operationName="fetchCategories")
	public List<Category> getCategories() {
		return catMng.getCategories();
	}

	@Override
	//@WebMethod(exclude = true) // web method eka servive ekak lesa denne na..WSDL eke meka na
	public Category getCategory(int id) {
		return catMng.getCategory(id);
	}

	@Override
	//@WebMethod(exclude = true)
	public List<Category> addCategory(int id, String name) {
		return catMng.addCategory(id, name);
	}

	@Override
	//@WebMethod(exclude = true)
	public List<Category> updateCategory(int id, String name) {
		return catMng.updateCategory(id, name);
	}

	@Override
	//@WebMethod(exclude = true)
	public List<Category> removeCategory(int id) {
		return catMng.removeCategory(id);
	}



}
