package corejava;

import java.util.Scanner;

class Calculator{
	public double a;
	public double b;
	public String operation;
	
	public Calculator(double a,double b,String operation) {
		this.a=a;
		this.b=b;
		this.operation=operation;
	}
	
	public double calculate() {
		switch (operation.toLowerCase()) {
        case "add":return a + b;
        case "sub":return a - b;
        case "mul":return a * b;
        case "div":if (b != 0) {
                return a / b;
                } else {
                System.out.println("can't divide by zero");
                return Double.NaN;
            }
        default:
            System.out.println("Invalid operation");
            return Double.NaN;
    }
	}
	
}

public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		double a =sc.nextDouble();
		System.out.print("Enter second number:");
		double b=sc.nextDouble();
		System.out.print("Enter the operation(add,sub,mul,div)");
		String operation = sc.next();
		Calculator c =new Calculator(a,b,operation);
		double result=c.calculate();
		System.out.print("Result:"+result);
		

	}

}
