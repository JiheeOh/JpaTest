package jpabook.jpashop.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;

@Entity
@Inheritance(strategy =InheritanceType.SINGLE_TABLE) // Item이 단독으로 테이블 생성될 필요가 없다고 가정 
@DiscriminatorColumn
public abstract class Item extends BaseEntity {
	
	@Id @GeneratedValue
	@Column(name ="ITEM_ID")
	private Long Id;
	
	private String name;
	private int price;
	private int stockQuantity;
	
	// Category와 다대다 매핑, 연관관계 주인은 카테고리
	@ManyToMany(mappedBy="items")
	private List<Category> categories = new ArrayList<>();
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	
	
}
