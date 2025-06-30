package corejava;

import java.util.Scanner;

public class Program_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int a=sc.nextInt();
		int b=(a%2==0)?a-1:a;
		for(int i=1;i<b*2;i+=2) {
			System.out.print(i);
			if(i<b*2-1) {
				System.out.print(",");
			}
		}
		sc.close();

	}

}
