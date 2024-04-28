import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Paso 1: Solicitar al usuario que ingrese los tres números enteros
        System.out.println("Ingresa el primer número entero:");
        int num1 = input.nextInt();
        
        System.out.println("Ingresa el segundo número entero:");
        int num2 = input.nextInt();
        
        System.out.println("Ingresa el tercer número entero:");
        int num3 = input.nextInt();
        
        // Paso 2: Inicializar variables para almacenar los valores menor, medio y mayor
        int menor = num1;
        int medio = num2;
        int mayor = num3;
        
        // Paso 3: Encontrar el número más pequeño
        if (num2 < menor && num2 < num3) {
            menor = num2;
        } else if (num3 < menor && num3 < num2) {
            menor = num3;
        }
        
        // Paso 4: Encontrar el número del medio
        if (num1 < medio && num1 > menor || num1 > medio && num1 < menor) {
            medio = num1;
        } else if (num3 < medio && num3 > menor || num3 > medio && num3 < menor) {
            medio = num3;
        }
        
        // Paso 5: Encontrar el número más grande
        if (num2 > mayor && num2 > medio) {
            mayor = num2;
        } else if (num1 > mayor && num1 > medio) {
            mayor = num1;
        }
        
        // Paso 6: Calcular la suma de los dos números más pequeños
        int sumaMenores = menor + medio;
        
        // Paso 7: Calcular la diferencia entre los dos números más grandes
        int diferenciaMayores = mayor - medio;
        
        // Paso 8: Mostrar los resultados
        System.out.println("La suma de los dos números más pequeños es: " + sumaMenores);
        System.out.println("La diferencia entre los dos números más grandes es: " + diferenciaMayores);
        System.out.println("El número más grande es: " + mayor);
    }
}
