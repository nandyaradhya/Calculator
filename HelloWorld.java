import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		String operation;
		Scanner input = new Scanner(System.in);

        System.out.println("please enter the first number");
        a = input.nextInt();

        System.out.println("please enter the second number");
        b = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Please enter operation");
        operation = op.next();

        if (operation == "+");
        {
            System.out.println("your answer is" + (a + b));
        }
        if  (operation == "-");
        {
            System.out.println("your answer is" + (a - b));
        }

        if (operation == "/");
        {
            System.out.println("your answer is" + (a / b));
        }
        if (operation == "*")
        {
            System.out.println("your answer is" + (a * b));
        }
	}

}
