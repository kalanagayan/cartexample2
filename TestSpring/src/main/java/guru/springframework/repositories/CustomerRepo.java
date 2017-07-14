package guru.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.domain.Customer;


public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
