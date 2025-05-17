/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adatarea3;
import java.util.Stack;
public class AlgIterativo {
     public int calcular(int m, int n) {
        Stack<int[]> pila = new Stack<>();
        pila.push(new int[]{m, n});

        while (!pila.isEmpty()) {
            int[] actual = pila.pop();
            m = actual[0];
            n = actual[1];

            if (m == 0) {
                if (pila.isEmpty()) {
                    return n + 1;
                }
                int[] top = pila.pop();
                pila.push(new int[]{top[0], n + 1});
            } else if (n == 0) {
                pila.push(new int[]{m - 1, 1});
            } else {
                pila.push(new int[]{m - 1, -1});
                pila.push(new int[]{m, n - 1});
            }
        }

        return n + 1;
    }
}
