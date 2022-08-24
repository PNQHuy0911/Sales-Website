package huy.store.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import huy.store.entity.Role;



public interface RoleDAO extends JpaRepository<Role, String> {

}
