package huy.store.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import huy.store.entity.OrderDetail;




public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long> {

}
