/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagoreantheorem;

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {

    public void run(){
        println("Enter values for a and b: ");
        double a = readDouble ("Enter a: ");
        double b = readDouble ("Enter b: ");
        double n1 = a*a;
        double n2 = b*b;
        double sum = n1 + n2;
        double c = Math.sqrt(sum);
        println("The value of hypotenuse is "+c+".");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new PythagoreanTheorem().start(args);
    }
    
}
