/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasnumeros;
import java.util.Stack;
/**
 *
 * @author Omarsito
 */
public class PilasNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack pila = new Stack();
        pila.push(15);
        pila.push(10);
        pila.push(5);
        pila.push(8);
        pila.push(20);
        pila.push(30);
        pila.push(50);
        pila.push(2);
        pila.pop();
        pila.pop();
        System.out.println("El ultimo de la pila es: " + pila.peek());
        pila.pop();
        pila.push(40);
        System.out.println("El ultimo de la pila es: " + pila.peek());
        pila.pop();
        pila.pop();
        pila.pop();
        System.out.println("El ultimo de la pila es: " + pila.peek());
        while(pila.empty()==false)
        {
            System.out.println(pila.pop());
        }
    }
    
}
