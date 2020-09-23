package com.soapTest.bl;

import java.util.List;

import com.soapTest.Dto.Category;

public interface CategoryMng {

	public Category getCategory(int id);

	public List<Category> getCategories();

	public List<Category> addCategory(int id, String name);

	public List<Category> updateCategory(int id, String name);

	public List<Category> removeCategory(int id);

}
