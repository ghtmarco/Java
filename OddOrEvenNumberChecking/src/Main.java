import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

        int num = reader.nextInt();

        if(num % 2 == 1)
            System.out.println(num + " Inputan anda adalah ganjil");
        else
            System.out.println(num + " Inputan anda adalah genap");
	}	

}