package com.demo.model;

import jakarta.persistence.*;

@Entity
public class Room
{
    @Id
    private Long id;
    private String roomNumber;
    private Double price;
    private Boolean available;
    
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Room(Long id, String roomNumber, Double price, Boolean available) {
		super();
		this.id = id;
		this.roomNumber = roomNumber;
		this.price = price;
		this.available = available;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

    
   
}