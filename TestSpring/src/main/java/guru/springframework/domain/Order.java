package guru.springframework.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String orderdate;
	private String amount;	
	//@ManyToOne
	//@JoinColumn(name = "customer_id")
	//private Customer customer;
	
	@ManyToMany(mappedBy = "order")
	private Set<Item> item;
	
	public Order(){
		
	}
	public Order(String orderdate){
		this.orderdate=orderdate;
	}
	public Order(String orderdate,String amount){
		this.orderdate=orderdate;
		this.amount=amount;
	}
	
	public Order(String orderdate, String amount, Set<Item> item) {
		this.orderdate = orderdate;
		this.amount = amount;
		//this.customer = customer;
		this.item = item;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	/*public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}*/
	
	public Set<Item> getItem() {
		return item;
	}

	public void setItem(Set<Item> item) {
		this.item = item;
	}
}
