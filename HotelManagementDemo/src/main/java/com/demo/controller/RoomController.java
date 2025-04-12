package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Room;
import com.demo.service.RoomService;

@RestController
public class RoomController 
{
	 @Autowired
	    private RoomService s;
	private Long id;

	    @PostMapping("/add")
	    public Room addRoom(@RequestBody Room room) 
	    {
	        return s.addRoom(room);
	    }

	    @GetMapping("/viewrooms")
	    public List<Room> getAllRooms()
	    {
	        return s.getAllRooms();
	    }
	    @PutMapping("/update/{id}")
	    public Room updateRoom(@PathVariable Long id, @RequestBody Room room) {
	        return s.updateRoom(id, room);
	    }
	    @DeleteMapping("/delete")
	    public void deleteRoom()
	    {
	        s.deleteAll();
	    }
	    
	   

}
