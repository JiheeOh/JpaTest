package jpabook.jpashop.domain;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order {
	
	@Id @GeneratedValue
	private Long id;
	
	private Long memberId;
	private LocalDateTime orderDate;
	
	@Enumerated(EnumType.STRING)  //ORDINAL 사용 금지! 
	private OrderStatus status;
	
	

}
