package main;

public class Dog {
	
	public String breed;
	public String size;
	public int age;
	public String color;
	
	public Dog(String breed, String size, int age, String color) {
		
		this.breed = breed;
		this.size = size;
		this.age = age;
		this.color = color;
	}
	
	public void eat() {
		System.out.println(breed+" is eating....");
	}
	
	public void sleep() {
		System.out.println(breed+" is sleeping....");
	}
}
