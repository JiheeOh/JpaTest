package jpabook.jpashop.domain;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="ORDERS") // ORDER를 예약어로 사용하는 DB가 있기 때문에 테이블 이름은 ORDERS로 많이 사용한다. 
public class Order {
	
	@Id @GeneratedValue
	@Column(name="ORDER_ID") // DB와 컬럼명이 다를 경우 작성 
	private Long id;
	
	@Column(name="MEMBER_ID")
	private Long memberId;  // 관계형 DB에 맞춘 설계 
	
	/*
	//좀더 객체 지향적인 설계
	private Member member;
	
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	*/
	private LocalDateTime orderDate;
	
	@Enumerated(EnumType.STRING)  //ORDINAL 사용 금지! 
	private OrderStatus status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	
	
	

}
