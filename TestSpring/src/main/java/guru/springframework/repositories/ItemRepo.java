package guru.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.domain.Item;

public interface ItemRepo extends JpaRepository<Item, Integer>{

}
