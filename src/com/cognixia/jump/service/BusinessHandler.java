package com.cognixia.jump.business;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

import com.cognixia.jump.classes.Address;
import com.cognixia.jump.classes.Animal;
import com.cognixia.jump.classes.Location;
import com.cognixia.jump.classes.User;
import com.cognixia.jump.dao.EntityHandler;
import com.cognixia.jump.enums.AnimalStatus;




//can be named something else
public class BusinessHandler {

	
	public List<Animal> getAllAnimals() {
		return new EntityHandler<Animal,Object>(Animal.class).readAll();
	}
	
	public List<Animal> getAllAdoptedAnimals() {
		return new EntityHandler<Animal,Object>(Animal.class).readAllByAttribute(3, AnimalStatus.ADOPTED.getText());
	}
	
	public List<Animal> getAllAvailableAnimals() {
		return new EntityHandler<Animal,Object>(Animal.class).readAllByAttribute(3, AnimalStatus.AVAILABLE.getText());
	}
	
	public List<Animal> getAllAvailableAnimalsByLocation(com.cognixia.jump.classes.Location location) {
		
		return new EntityHandler<Animal, Object>(Animal.class).readAllByAttribute(3, AnimalStatus.AVAILABLE.getText()).
				stream().filter( a -> a.getLocId()==location.getIdLocation()).collect(Collectors.toList());
	}
	public List<Address> getAllAddresses() {
		return new EntityHandler<Address,Object>(Address.class).readAll();
	}
	public List<Location> getAllLocations() {
		return new EntityHandler<Location,Object>(Location.class).readAll();
	}
	
	public List<User> getAllUsers(){
		return new EntityHandler<User,Object>(User.class).readAll();
	}
	
	public Integer setAnimalToAdoptedById(int animalId) {	
		return new EntityHandler<Animal,Object>(Animal.class).updateAttribute(animalId, 3, AnimalStatus.ADOPTED.getText());
	}
	 
	public Integer setAnimalToAvailableById(int animalId) {	
		return new EntityHandler<Animal,Object>(Animal.class).updateAttribute(animalId, 3, AnimalStatus.AVAILABLE.getText());
	}
	
	public int getDaysInShelter(int id) {
		
		return (int) ChronoUnit.DAYS.between(new EntityHandler<Animal,Object>(Animal.class).readById(id).getAnimalDate().toLocalDate(), LocalDate.now());	
			
		
	}
}
