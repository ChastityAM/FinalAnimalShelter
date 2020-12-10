package com.cognixia.jump.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

import com.cognixia.jump.dao.EntityHandler;
import com.cognixia.jump.enums.AnimalStatus;
import com.cognixia.jump.enums.ShelterLocation;
import com.cognixia.jump.models.Address;
import com.cognixia.jump.models.Animal;
import com.cognixia.jump.models.Location;
import com.cognixia.jump.models.User;




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
	
	public List<Animal> getAllAvailableAnimalsByLocation(ShelterLocation shelter) {
		
		return new EntityHandler<Animal, Object>(Animal.class).readAllByAttribute(3, AnimalStatus.AVAILABLE.getText()).
				stream().filter( a -> a.getLocId()==shelter.getCode()).collect(Collectors.toList());
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
	
	
	public static void main(String[] args) {
		new BusinessHandler().getAllAvailableAnimalsByLocation(ShelterLocation.CHICAGO).stream().forEach(a->System.out.println(a));
	}
}
