package huy.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import huy.store.dao.AccountDAO;
import huy.store.entity.Account;
import huy.store.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
@Autowired
AccountDAO adao;
@Override
public Account findById(String username) {
	return adao.findById(username).get(); 
}
public List<Account> findAll() {
	return adao.findAll(); 
}

public List<Account> getAdministrators() {
	
	return adao.getAdministrators();
}
}
