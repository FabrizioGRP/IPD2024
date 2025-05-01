/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adatarea1;
import java.util.*;
public class ADAtarea1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("Ingrese el tamaño de la matriz (mayor a 3): ");
            n = sc.nextInt();
        } while (n <= 3);

        sc.nextLine();
        
        List<String> palabras = new ArrayList<>();
        
        System.out.println("Ingrese " + n + " palabras (mín. 3 letras, máx. " + n + " letras):");
        for (int i = 0; i < n; i++) {
            String palabra;
            while (true) {
                System.out.print("Palabra #" + (i + 1) + ": ");
                palabra = sc.nextLine().trim().toUpperCase();
                if (palabra.length() >= 3 && palabra.length() <= n) {
                    palabras.add(palabra);
                    break;
                } else {
                    System.out.println("Longitud inválida. Intente nuevamente.");
                }
            }
        }
        
        SopadeLetras sopa = new SopadeLetras(n);
        sopa.insertarPalabras(palabras);
        sopa.rellenarAleatorios();
        
        System.out.println("\nSopa de letras:");
        sopa.imprimirMatriz();
    }
    
}
