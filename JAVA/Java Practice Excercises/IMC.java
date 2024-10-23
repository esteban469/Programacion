import java.util.Scanner;

public class IMC {

    /*
     * 
     * Ejercicio:
     * Escribe un programa en Java que calcule el índice de masa corporal (IMC) de
     * una persona.
     * 
     * Instrucciones:
     * El programa debe pedirle al usuario que ingrese su peso en kilogramos y su
     * altura en metros.
     * Utiliza la fórmula del IMC​
     * 
     * Después de calcular el IMC, el programa debe mostrar el resultado y, además,
     * clasificarlo según los siguientes rangos:
     * Bajo peso: IMC menor a 18.5
     * Normal: IMC entre 18.5 y 24.9
     * Sobrepeso: IMC entre 25 y 29.9
     * Obesidad: IMC de 30 o más
     * 
     * 
     */

    public static void main(String[] args) {
        Double weight, height, imc, heightSquared;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your weight in kg: ");
        weight = sc.nextDouble();
        System.out.println("Now, enter your height in mts: ");
        height = sc.nextDouble();
        heightSquared = Math.pow(height, 2);
        imc = weight / heightSquared;
        System.out.printf("Your IMC is: %.1f%n", imc);

        if (imc <= 18.5) {
            System.out.println("Classification: Low Weight");
        } else if (imc >= 1.85 && imc <= 24.9) {
            System.out.println("Classification: Normal Weight");
        } else if (imc >= 24.9 && imc <= 29.9) {
            System.out.println("Classification: Overweight");
        } else if (imc >= 30) {
            System.out.println("Classification: Obesity");
        }

        sc.close();
    }
}
