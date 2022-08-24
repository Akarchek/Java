package myfirstpackage;

import java.util.Scanner;

public class myfirstclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Введіть першу сторону трикутника: ");
		System.out.println("Введіть друг сторону трикутника: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a*a+b*b; 
		
		System.out.println(sum);
	}

}
