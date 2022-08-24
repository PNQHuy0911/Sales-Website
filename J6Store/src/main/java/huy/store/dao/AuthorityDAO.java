package huy.store.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import huy.store.entity.Account;
import huy.store.entity.Authority;



public interface AuthorityDAO extends JpaRepository<Authority, Integer> {
@Query("SELECT DISTINCT a FROM Authority a Where a.account IN ?1")
	List<Authority> authoritiesOf(List<Account> accounts);

}
