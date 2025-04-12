package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

	
}