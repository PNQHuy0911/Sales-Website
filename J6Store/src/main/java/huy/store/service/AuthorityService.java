package huy.store.service;

import java.util.List;

import huy.store.entity.Authority;



public interface AuthorityService {

	List<Authority> findAll();

	Authority create(Authority auth);

	List<Authority> findAuthoritiesOfAdministrators();

	public void delete(Integer id);



}
