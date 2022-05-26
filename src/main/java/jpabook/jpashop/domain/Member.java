package jpabook.jpashop.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Member {

		@Id @GeneratedValue(strategy = GenerationType.AUTO) // 기본 값 : 방언에 따라 전략선택 
		@Column(name="MEMBER_ID")
		private Long id;
		
		private String name;
		private String city;
		private String street;
		private String zipcode;
		
		// 멤버에서 바로 주문을 볼 수 있도록 참조 변경하는 경우 : 사실은 이런 경우는 거의 없는 것이 좋다. 이미 order에서 단방향으로 member를 fk로 잡고 있기 때문에
		@OneToMany(mappedBy ="member")
		private List<Order> orders = new ArrayList<>(); 
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getZipcode() {
			return zipcode;
		}
		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}
		
		
}
