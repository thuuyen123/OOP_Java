/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdemo;

/**
 *
 * @author Thu Uyên
 */
public class Main {
    public static void main(String[] args) {
        Outer o1 = new Outer("Outer class");
        System.out.println(o1.getName());
        Outer.Inner i1 = o1.new Inner(12);
        System.out.println(i1.getNumber());
    }
}
