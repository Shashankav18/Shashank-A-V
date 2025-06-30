package corejava;

import java.util.Scanner;

public class Program_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int a=sc.nextInt();
		for(int i=1;i<a*2;i+=2) {
			System.out.print(i);
			if(i<a*2-1) {
				System.out.print(",");
			}
		}
		sc.close();

	}

}
