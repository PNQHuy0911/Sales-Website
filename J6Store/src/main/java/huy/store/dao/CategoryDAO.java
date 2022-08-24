package huy.store.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import huy.store.entity.Category;




public interface CategoryDAO extends JpaRepository<Category, String> {

}
