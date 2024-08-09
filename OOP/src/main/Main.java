package main;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	Vector<String> breeds = new Vector<String>();
	Vector<String> sizes = new Vector<String>();
	Vector<Integer> ages = new Vector<Integer>();
	Vector<String> colors = new Vector<String>();
	
	Vector<Dog> dogs = new Vector<Dog>();
	
	
	public void play() {
		int idx = -1;
		view();
		System.out.println("Input Dog Number: ");
		idx = scan.nextInt();
		scan.nextLine();
		
		dogs.get(idx-1).eat();
		dogs.get(idx-1).sleep();
		
	}
 	
	public void insert() {
		String breed;
		String size;
		int age;
		String color;
		
		System.out.println("Input dog name: ");
		breed = scan.nextLine();
		
		System.out.println("Input dog size: ");
		size = scan.nextLine();
		
		System.out.println("Input dog age: ");
		age = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Input dog color: ");
		color = scan.nextLine();
		
//		breeds.add(breed);
//		sizes.add(size);
//		ages.add(age);
//		colors.add(color);
		
//		Dog a = new Dog(breed, size, age, color);
		
		dogs.add(new Dog(breed, size, age, color));
		
	}
	
	public void view() {
		int count = 0;
		for (Dog a : dogs) {
			count++;
			System.out.println();
			System.out.println("Dog info number: " +count);
			System.out.println("--------------------");
			System.out.println("Name: " +a.breed);
			System.out.println("Size: " +a.size);
			System.out.println("Age: " +a.age);
			System.out.println("Color: " +a.color);
			System.out.println("--------------------");
			System.out.println();
		}
	}
	
	
	public void delete() {
		view();
		int idx = -1;
		System.out.println("Input Number You Want To Delete: ");
		idx = scan.nextInt();
		scan.nextLine();
		
		dogs.remove(idx-1);
	}
	
	public void exit() {
		System.out.println("Thank You!");
	}
	
	public void menu() {
		int input = -1;
		do {
			
			System.out.println("1. Insert Dog");
			System.out.println("2. View Dog");
			System.out.println("3. Delete Dog");
			System.out.println("4. Play Dog");
			System.out.println("0. Exit");
			
			input = scan.nextInt();
			scan.nextLine();
			switch(input) {
			case 1:
				insert();
				break;
			case 2:
				view();
				break;
			case 3:
				delete();
				break;
			case 4:
				play();
				break;
			case 0:
				exit();
				break;
			default:
				break;
			}
			
		}while(input != 0);
	}
	public Main() {
		menu();
	}

	public static void main(String[] args) {
		new Main();

	}

}

//	public void test(){
//	
//	ArrayList<String> angka = new ArrayList<>();
//	Vector<Integer> Angka = new Vector<>();
//	
//	Angka.add(1);
//	Angka.add(2);
//	Angka.add(3);
////		System.out.println(Angka);
//	Angka.set(0, 4);
//	Angka.set(1, 5);
//	
//	
//	System.out.println(Angka);
//	
//	angka.add("Satu");
//	angka.add("Dua");
//	angka.add("Tiga");
//	
//	angka.set(1, "Delapan");
//	angka.set(0, "Empat");
//	
//	angka.remove("Delapan");
//	
//	System.out.println(angka);
//	
//	angka.size();
//	System.out.println(angka.size());
//	}
//	