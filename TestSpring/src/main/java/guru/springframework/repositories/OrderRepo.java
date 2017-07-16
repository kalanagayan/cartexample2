package guru.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.domain.Order;

public interface OrderRepo extends JpaRepository<Order,Integer>{

}
