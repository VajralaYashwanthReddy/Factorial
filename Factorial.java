import java.util.Scanner;
public class Factorial{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n , i, Factorial = 1;
		System.out.println("Enter value of n: ");
		n = sc.nextInt();
		System.out.println("Given Number:"+n);
		if(n < 0){
		    System.out.println("Factorial is not defined for negative numbers.");
		}
		else{
		    for(i = 1; i <= n; i++){
		        Factorial = Factorial * i;
		    }
		    System.out.println("Factorial of "+ n+" is "+Factorial);
		    }
		}
		}
