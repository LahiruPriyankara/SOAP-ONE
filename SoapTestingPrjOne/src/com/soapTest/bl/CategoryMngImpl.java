package com.soapTest.bl;

import java.util.ArrayList;
import java.util.List;

import com.soapTest.Dto.Category;

public class CategoryMngImpl implements CategoryMng {
	public static List<Category> categories = new ArrayList<>();

	public CategoryMngImpl() {
		categories.add(new Category(1, "CategoryOne"));
		categories.add(new Category(2, "CategoryTwo"));
	}

	@Override
	public Category getCategory(int id) {
		for (Category cat : categories) {
			if (cat.getcId() == id) {
				return cat;
			}
		}
		return null;
	}

	@Override
	public List<Category> getCategories() {
		return categories;
	}

	@Override
	public List<Category> addCategory(int id, String name) {
		categories.add(new Category(id, name));
		return categories;
	}
	
	@Override
	public List<Category> updateCategory(int id,String name) {
		if (id < categories.size()) {
			int i = 0;
			for (Category cat : categories) {
				if (cat.getcId() == id) {
					cat.setcName(name);
					break;
				} 
			}
			categories.remove(i);
		}
		return categories;

	}

	@Override
	public List<Category> removeCategory(int id) {
		if (id < categories.size()) {
			int i = 0;
			for (Category cat : categories) {
				if (cat.getcId() != id) {
					i++;
				} else {
					break;
				}
			}
			categories.remove(i);
		}
		return categories;

	}

}
