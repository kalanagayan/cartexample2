package guru.springframework.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String description;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Item_Order", 
    				joinColumns = @JoinColumn(name = "item_id", referencedColumnName = "id"), 
    				inverseJoinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"))	
   	private Set<Order> order;
	
	
	public Item(){
		
	}
	public Item(String name){
		this.name=name;
	}
	public Item(String name,String description){
		this.name=name;
		this.description=description;
	}
	public Item(String name, String description, Set<Order> order) {
		this.name = name;
		this.description = description;
		this.order = order;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Order> getOrder() {
		return order;
	}

	public void setOrder(Set<Order> order) {
		this.order = order;
	}

	
	
}
