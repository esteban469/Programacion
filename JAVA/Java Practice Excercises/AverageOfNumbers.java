import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum=0, number = 0, average; // variables double to use
        int n;
        
        System.out.println("Please, enter the number of numbers to average");
        n = sc.nextInt();
        System.out.println("Please, enter " + n + " numbers \n");
        for(int i = 1; i <= n; i++)
        {
            System.out.println("Number " + i + " --> ");
            number = sc.nextDouble();
            sum = sum + number;
            System.out.println("\n");
        }
        average = sum/n;

        System.out.printf("The average of the numbers entered is: %.2f%n", average );

        sc.close();
    }
}
