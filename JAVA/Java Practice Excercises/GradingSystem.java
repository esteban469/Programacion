import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberStudents, i, minor = 100,major = 0;
        double average, sum = 0;
        
        
        
        System.out.println("What is the number of students do you want enter");
        numberStudents = sc.nextInt();
        sc.nextLine();
        System.out.println("Hi, please enter the name of the student: ");
        String namesArray[] = new String[numberStudents]; // asignando el tamaño del arreglo con el numero de estudiantes
        for(i = 0; i < numberStudents; i++)
        {
            System.out.print("--> ");
            namesArray[i] = sc.nextLine();
        }
        System.out.println();
        System.out.println("Now, enter the grades: ");
        int gradingsArray[] = new int[numberStudents]; // asignando el tamaño del arreglo con el numero de estudiantes
        for(i = 0; i < numberStudents; i++)
        {
            System.out.print("--> ");
            gradingsArray[i] = sc.nextInt();
            sum = sum + gradingsArray[i];
        }

        // Buscando calificaciones mas altas y bajas
        for(i = 0; i < numberStudents; i++)
        {
            major = Math.max(major, gradingsArray[i]);  
            minor = Math.min(minor, gradingsArray[i]);  
        }
    

        //----------------------------------------- RESULTADOS -----------------------------------------
        System.out.println();
        System.out.printf("%-20s | %-10s%n"," Student Name ", " Grade ");
        System.out.println("______________________________________");
        for(i = 0; i < numberStudents; i++)
        {
            System.out.printf("%-20s %-10s%n", namesArray[i], gradingsArray[i]);
        }
        average = sum/(double)numberStudents;
        System.out.printf("Average: %.2f%n", average);
        System.out.println();

        sc.close();

        // mostrando calificaciones mas altas y bajas
        System.out.println("Highest rating");
        System.out.printf("%-20s | %-10s%n"," Student Name ", " Grade ");
        System.out.println("______________________________________");
        for(i = 0; i < numberStudents; i++)
        {
            if (major == gradingsArray[i])
            {
                System.out.printf("%-20s %-10s%n", namesArray[i], gradingsArray[i]);
            }
        }
        System.out.println();
        System.out.println("Lowest rating");
        System.out.printf("%-20s | %-10s%n"," Student Name ", " Grade ");
        System.out.println("______________________________________");
        for(i = 0; i < numberStudents; i++)
        {
            if (minor == gradingsArray[i])
            {
                System.out.printf("%-20s %-10s%n", namesArray[i], gradingsArray[i]);
            }
        }
        System.out.println();
        System.out.println("Approved students");
        for(i = 0; i < numberStudents; i++)
        {
            if(gradingsArray[i] >= 70)
            {
                System.out.printf("%-20s %-10s%n", namesArray[i], gradingsArray[i]);
            }
        }
        System.out.println();
        System.out.println("Failed students");
        for(i = 0; i < numberStudents; i++)
        {
            if(gradingsArray[i] < 70)
            {
                System.out.printf("%-20s %-10s%n", namesArray[i], gradingsArray[i]);
            }
        }


    }
}
/* Ejercicio: Sistema de Calificaciones
Crea un programa en Java que permita gestionar las calificaciones de un grupo de estudiantes. El programa debe realizar las siguientes funciones:

Capturar nombres y calificaciones:
El programa debe solicitar al usuario que ingrese el nombre de cada estudiante y su calificación (un valor numérico entre 0 y 100).
Utiliza un arreglo para almacenar las calificaciones y otro arreglo para los nombres.

Mostrar las calificaciones:
El programa debe mostrar los nombres de los estudiantes junto con sus calificaciones.

Calcular el promedio de las calificaciones:
El programa debe calcular el promedio de las calificaciones de todos los estudiantes y mostrarlo en pantalla.

Calificación más alta y más baja:
El programa debe mostrar el nombre del estudiante con la calificación más alta y el estudiante con la calificación más baja.

Clasificación de los estudiantes:
El programa debe clasificar a los estudiantes en dos grupos:
Aprobados: Estudiantes con una calificación mayor o igual a 70.
Reprobados: Estudiantes con una calificación menor a 70.

Requisitos:
Usa variables para almacenar las calificaciones y nombres de los estudiantes.
Utiliza estructuras de control como if/else y loops para manejar la lógica del programa.
Debes manejar un arreglo (array) para las calificaciones y otro para los nombres.
Utiliza el método Math.max() y Math.min() para encontrar la calificación más alta y más baja.
Implementa comentarios en tu código para que sea fácil de seguir. */
