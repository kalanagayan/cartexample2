package guru.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.domain.Address;


public interface AddressRepo extends JpaRepository<Address, Long>{

}
