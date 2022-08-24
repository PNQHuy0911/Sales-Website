package huy.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import huy.store.dao.RoleDAO;
import huy.store.entity.Role;
import huy.store.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
@Autowired
RoleDAO dao;
public List<Role> findAll(){
	return dao.findAll();
}
}
