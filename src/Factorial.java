import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int b=1;
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        for(i=1;i<=a;i++)
        {
            b=b*i;
        }
        System.out.println("Factorial of "+a+" is:"+ b);
    }
}
