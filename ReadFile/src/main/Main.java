package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public Main() {
		try {
		FileReader file = new FileReader("D:\\test.txt");
		BufferedReader reader = new BufferedReader(file);
			do {
				System.out.println(reader.readLine());
			}while(reader.readLine() != null);
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
