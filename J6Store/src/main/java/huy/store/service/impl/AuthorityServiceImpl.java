package huy.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import huy.store.dao.AccountDAO;
import huy.store.dao.AuthorityDAO;
import huy.store.entity.Account;
import huy.store.entity.Authority;
import huy.store.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService{
@Autowired
AuthorityDAO dao;
@Autowired
AccountDAO acdao;
	@Override
	public List<Authority> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Authority create(Authority auth) {
		// TODO Auto-generated method stub
		return dao.save(auth);
	}
	
	@Override
	public List<Authority> findAuthoritiesOfAdministrators() {
		List <Account> accounts = acdao.getAdministrators();
		return dao.authoritiesOf(accounts);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

}
