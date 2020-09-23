package com.soapTest.Controller;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.soapTest.Dto.Category;

@WebService // (name="ProductCat" , targetNamespace="ProductCat")
public interface CategoryMngService {

	@WebMethod(action = "fetchCategories", operationName = "fetchCategories")
	public List<Category> getCategories();

	// @WebMethod(exclude = true)
	public Category getCategory(int id);

	// @WebMethod(exclude = true)
	public List<Category> addCategory(int id, String name);

	// @WebMethod(exclude = true)
	public List<Category> updateCategory(int id, String name);

	// @WebMethod(exclude = false)
	public List<Category> removeCategory(int id);

}
