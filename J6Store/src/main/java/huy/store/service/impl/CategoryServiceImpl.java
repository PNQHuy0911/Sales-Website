package huy.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import huy.store.dao.CategoryDAO;
import huy.store.entity.Category;
import huy.store.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{
@Autowired
CategoryDAO cdao;

@Override
public List<Category> findAll() {
	return cdao.findAll();
}
}
