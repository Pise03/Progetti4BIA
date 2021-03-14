/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class Buffer {

    public double x, y, z, t, k, a, b, c;

    public Buffer() {
        x = 0;
        y = 0;
        z = 0;
        t = 0;
        k = 0;
        a = 0;
        b = 0;
        c = 0;
    }

    public Buffer(double a, double b, double c) {
        x = 0;
        y = 0;
        z = 0;
        t = 0;
        k = 0;
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("I parametri valgono: a: " + a + " b: " + b + " c:" + c);
    }

}
