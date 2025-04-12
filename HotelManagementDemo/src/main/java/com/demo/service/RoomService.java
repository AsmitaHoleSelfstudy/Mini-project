package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Room;
import com.demo.repository.RoomRepository;

@Service
public class RoomService
{
    @Autowired
    private RoomRepository roomRepo;

    public List<Room> getAllRooms() 
    {
        return roomRepo.findAll();
    }
    
    public Room addRoom(Room room)
    {
        return roomRepo.save(room);
    }
    
    public Room updateRoom(Long id, Room updatedRoom) {
        Room existing = roomRepo.findById(id).orElse(null);
        if (existing != null) {
            existing.setRoomNumber(updatedRoom.getRoomNumber());
            existing.setPrice(updatedRoom.getPrice());
            existing.setAvailable(updatedRoom.getAvailable());
            return roomRepo.save(existing);
        }
        return null;
    }

	public void deleteAll() 
	{
		
		roomRepo.deleteAll();
	}

	public Room save(Room room) 
	{
		
		return null;
	}

	
}