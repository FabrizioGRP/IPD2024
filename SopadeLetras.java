/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adatarea1;
import java.util.*;
public class SopadeLetras {
    private char[][] matriz;
    private int n;
    private Random rand = new Random();
    
    public SopadeLetras(int n) {
        this.n = n;
        matriz = new char[n][n];
        rellenarConGuiones();
    }
    
    private void rellenarConGuiones() {
        for (int i = 0; i < n; i++) {
            Arrays.fill(matriz[i], '-');
        }
    }
    
    public void insertarPalabras(List<String> palabras) {
        for (String palabra : palabras) {
            boolean insertado = false;

            while (!insertado) {
                int direccion = rand.nextInt(3);
                int fila = rand.nextInt(n);
                int col = rand.nextInt(n);

                insertado = insertarPalabra(palabra, fila, col, direccion);
            }
        }
    }
    
    private boolean insertarPalabra(String palabra, int fila, int col, int direccion) {
        int len = palabra.length();

        switch (direccion) {
            case 0:
                if (col + len > n) return false;
                for (int i = 0; i < len; i++)
                    if (matriz[fila][col + i] != '-' && matriz[fila][col + i] != palabra.charAt(i))
                        return false;
                for (int i = 0; i < len; i++)
                    matriz[fila][col + i] = palabra.charAt(i);
                return true;

            case 1:
                if (fila + len > n) return false;
                for (int i = 0; i < len; i++)
                    if (matriz[fila + i][col] != '-' && matriz[fila + i][col] != palabra.charAt(i))
                        return false;
                for (int i = 0; i < len; i++)
                    matriz[fila + i][col] = palabra.charAt(i);
                return true;

            case 2:
                if (fila + len > n || col + len > n) return false;
                for (int i = 0; i < len; i++)
                    if (matriz[fila + i][col + i] != '-' && matriz[fila + i][col + i] != palabra.charAt(i))
                        return false;
                for (int i = 0; i < len; i++)
                    matriz[fila + i][col + i] = palabra.charAt(i);
                return true;
        }

        return false;
    }
    
    public void rellenarAleatorios() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == '-') {
                    matriz[i][j] = (char) ('A' + rand.nextInt(26)); // Letra aleatoria
                }
            }
        }
    }
    
    public void imprimirMatriz() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
