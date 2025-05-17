/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adatarea3;
import java.util.Scanner;
public class ADAtarea3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AlgIterativo ack = new AlgIterativo();
        
        System.out.println("Ingrese un numero no negativo ---> ");
        int m = leer.nextInt();
        
        System.out.println("Ingrese otro numero no negativo ---> ");
        int n = leer.nextInt();
        leer.close();
        
        int resultado = ack.calcular(m, n);
        System.out.println("A(" + m + ", " + n + ") = " + resultado);
    }
    
}
