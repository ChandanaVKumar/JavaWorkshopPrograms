import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count,n1=0, n2=1;
        int N=1;
        System.out.println("Enter no. of elements in the series: ");
        count = sc.nextInt();
        System.out.println("The Fibonacci sequence of " +count+ " numbers is: ");
        while(count>=N)
        {
            System.out.println(n1+ " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            N++;
        }

    }
}

