
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int a, b;
        int answer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers a and b:");
        a = sc.nextInt();
        b=sc.nextInt();
        System.out.println("choose an operation: +, -, *, /");
        char op;
        op = sc.next().charAt(0);
        switch(op)
        {
            case '+':
               answer = a+b;
                System.out.println(answer);
                break;

            case '-':
                answer = a-b;
                if(a>b)
                {
                    System.out.println(answer);
                }
                else if(a<b)
                {
                    System.out.println(answer);
                }
                break;

            case '*':
                answer = a * b;
                System.out.println(answer);
                break;

            case '/':
                answer = a/b;
                System.out.println(answer);
                break;
            default:
                System.out.println("N/A");

        }

    }
}
