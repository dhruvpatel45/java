import java.util.*;

public class calculator {

	public static void main(String[] args) {
		double num1,num2,answer=0.0;
		Scanner inpu=new Scanner(System.in);
		System.out.print("Enter 2 number: ");
		num1=inpu.nextDouble();
		num2=inpu.nextDouble();
		System.out.print("enter your choice (+, -, *, /): ");
		char choice=inpu.next().charAt(0);
		switch(choice){
			case '+':
				answer=num1+num2;
			break;
			case '-':
				answer=num1-num2;
			break;
			case '*':
				answer=num1*num2;
			break;
			case '/':
				answer=num1/num2;
			break;
			default:
				System.out.print("there is some thing wrong");
			break;
		}
		System.out.print(answer);
	}

}
