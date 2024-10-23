import java.util.Scanner;

public class BasicOpMethod {
    // Método para sumar tres números enteros
    public static int addNumbers(int num1, int num2, int num3) {
        int addAllNumbers = num1 + num2 + num3;

        return addAllNumbers;
    }

    // Método para multiplicar tres números enteros
    public static int multNumbers(int num1, int num2, int num3) {
        int multAllNumbers = num1 * num2 * num3;

        return multAllNumbers;
    }

    // Método para calcular el promedio de tres números enteros
    public static double averageNumbers(int num1, int num2, int num3) {
        double average = (num1 + num2 + num3) / 3;

        return average;
    }

    public static void main(String[] args) {

        int choice, num1, num2, num3, result;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf(
                    "Please enter the operation you want to use: %n 1.- Addition of three numbers %n 2.- Multiplication of three numbers %n 3.- Average of three numbers %n Choice: ");
            choice = sc.nextInt();
            if (choice < 1 || choice > 3) {
                System.out.println("Please enter a valid choice");
            }
        } while (choice < 1 || choice > 3);
        System.out.println();
        System.out.println("Please enter the first number: ");
        System.out.print("--> ");
        num1 = sc.nextInt();
        System.out.println("Please enter the second number: ");
        System.out.print("--> ");
        num2 = sc.nextInt();
        System.out.println("Please enter the third number: ");
        System.out.print("--> ");
        num3 = sc.nextInt();

        switch (choice) {
            case 1:
                result = addNumbers(num1, num2, num3);
                System.out.println("The addition result is: " + result);
                break;

            case 2:
                result = multNumbers(num1, num2, num3);
                System.out.println("The multiplication result is: " + result);
                break;

            case 3:
                double resultAverage = averageNumbers(num1, num2, num3);
                System.out.println("The average is: " + resultAverage);
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }

    }
}

/*
 * Ejercicio:
 * Crea un programa en Java que permita ingresar tres números enteros y luego
 * implemente los siguientes métodos:
 * 
 * sumar: Recibe tres números enteros como parámetros y devuelve la suma de los
 * mismos.
 * multiplicar: Recibe tres números enteros como parámetros y devuelve el
 * producto de los mismos.
 * calcularPromedio: Recibe tres números enteros como parámetros y devuelve el
 * promedio de los mismos.
 * El programa principal debe:
 * 
 * Solicitar al usuario los tres números.
 * Mostrar el resultado de la suma, el producto y el promedio de los números
 * ingresados.
 */