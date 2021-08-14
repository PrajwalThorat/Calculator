
import java.util.*;
//Arithmetic class
class BasicMathematicalOp
{
	public  double addition(double firstNumber,double secondNumber)
	{
		double result;
		result = firstNumber+secondNumber;
		return result;
	}
	
	public double subtract(double firstNumber, double secondNumber)
	{
		double result;
		result = firstNumber -  secondNumber;
		return result;
	}
	
	public double multiply(double firstNumber, double secondNumber)
	{
		double result;
		result = firstNumber * secondNumber;
		return result;
		
	}
	
	public double divide(double firstNumber, double secondNumber)
	{
		double result=0;
		try {
		 result = firstNumber/secondNumber;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Not divided by zero ");
		}
		
		return result;
	}
	public double mod(double firstNumber, double secondNumber)
	{
		double result=0;
		result = firstNumber/secondNumber;
		return result;
	}
}

// Scientific Calculator
class ScientificCalculator
{
	public double ceilFuntion(double value)
	{
		double result;
		result = Math.ceil(value);
		return result;
	}
	
	public double floorFunction(double value)
	{
		double result;
		result = Math.floor(value);
		return result;
	}
	
	public double squareRootFuntion(double value)
	{
		if(value<0)
		{
			System.out.println("Negative Number square root can't be determined");
		}
		double result;
		result = Math.sqrt(value);
		return result;
	}
	
	public double powerFuntion(double base , double exponent)
	{
		if(base == 0 && exponent == 0)
		{
			System.out.println("Input Positive numbers");
		}
	    double result;
		result = Math.pow(base, exponent);	
		return result;	
	}
}

//Driver Class
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mainMenu();	
	}
	
	@SuppressWarnings("resource")
	public static void mainMenu()
	{
		int choose;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the operation you want to wish to perform :");
		System.out.println("1. Mathematical Calculations");
		System.out.println("2.Scientific Calculations");
		System.out.println("3.Exit");
		choose = input.nextInt();
		
		switch(choose)
		{
		case 1: basicOperationList();
		break;
		case 2: scientificOperationList();
		break;
		case 3:
			Scanner scan = new Scanner(System.in);
			char c;
			System.out.println("Do you want to go back ? (Y/N)");
			c = scan.next().charAt(0);
			if(c=='Y')
			{
				mainMenu();
			}
			else 
			{
				break;
			}
		break;
		default:
			System.out.println("Invalid input");
			
		}
	}
	

	public static void basicOperationList()
	{
		BasicMathematicalOp obj = new BasicMathematicalOp(); 	 
		@SuppressWarnings("resource")
		Scanner in  = new Scanner(System.in);
		int choose;
		System.out.println("Select an arithmetic operation");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		System.out.println("5.Modulo");
		System.out.println("6.Back to Main Menu");
		choose = in.nextInt();
		
		switch(choose)
		{
		case 1:
				double a;
				double b;
				System.out.println("Enter the value of a and b");
				a = in.nextDouble();
				b = in.nextDouble();
				System.out.println("The sum of firstNumber and secondNumber is "+(obj.addition(a, b)));			
			break;
		case 2:
				double c;
				double d;	
				System.out.println("Enter the value of a and b");
				c= in.nextDouble();
				d= in.nextDouble();
				System.out.println("The difference of firstNumber and secondNumber is "+obj.subtract(c,d));
				break;
		 case 3:
				double e;
				double f;
				System.out.println("Enter the value of a and b");
				e = in.nextDouble();
				f = in.nextDouble();
				System.out.println("The multiplication of e and f is "+(obj.multiply(e, f)));
				break;
		 case 4:
				double g;
				double h;
				System.out.println("Enter the value of g and h");
				g = in.nextDouble();
				h = in.nextDouble();
				System.out.println("The division of g and h is "+(obj.divide(g, h)));
				break;
		 case 5:
			 	double i;
			 	double j;
			 	System.out.println("Enter the value of i and j");
			 	i = in.nextDouble();
			 	j = in.nextDouble();
			 	System.out.println("The modulus of i and j"+(obj.mod(i, j)));
			 	break;
		
			
		}	
		
		if(choose == 6)
		{
			mainMenu();
		}
	}
	
	public static void scientificOperationList()
	{
		
		ScientificCalculator obj = new ScientificCalculator();
		Scanner x = new Scanner(System.in);
		int choose;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Select an scientific operation");
		System.out.println("1.Ceil");
		System.out.println("2.Floor");
		System.out.println("3.Square Root");
		System.out.println("4.Power Of");
		System.out.println("5.Back to Main Menu");
		choose = in.nextInt();
		
		switch(choose)
		{
		case 1:
			double num;
			System.out.println("Enter the value to calculate ceiling value ");
			num = in.nextDouble();
			System.out.println("The calculated ceil value is "+(obj.ceilFuntion(num)));
			break;
		case 2:
			double num1;
			System.out.println("Enter the value to calculate floor value ");
			num1 = in.nextDouble();
			System.out.println("The calculated floor value is "+(obj.floorFunction(num1)));
			break;
		case 3:
			double num2;
			System.out.println("Enter the value to calculate square root ");
			num2 = in.nextDouble();
			System.out.println("The calculated square value is "+(obj.squareRootFuntion(num2)));
			break;
		case 4:
			double base;
			double exponent;
			System.out.println("Enter the base and exponent values ");
			base = in.nextDouble();
			exponent = in.nextDouble();
			System.out.println("The base and exponent value is "+(obj.powerFuntion(base, exponent)));
			break;
		}
		if(choose == 5)
		{
			mainMenu();
		}
	}
}
