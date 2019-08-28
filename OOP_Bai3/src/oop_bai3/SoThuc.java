/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_bai3;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class SoThuc {
    private float a;
    private float b;
    private float c;

    public SoThuc() {
    }

    public SoThuc(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    Scanner sc = new Scanner(System.in);

    public void nhap(){
        System.out.print("Nhập a: ");
        a = sc.nextFloat();
        System.out.print("Nhập b: ");
        b = sc.nextFloat();
        System.out.print("Nhập c: ");
        c = sc.nextFloat();
    }
    public void ptb2(){
        if(a==0){
            if(b==0){
                if(c==0) System.out.println("Phương trình có vô số nghiệm");
                else System.out.println("Phương trình vô nghiệm");
            }
            else{
                System.out.println("Phương trình có 1 nghiệm duy nhất: x = "+ (-c/b));
            }
        }
        else{
            float delta = (float) (Math.pow(b,2)- 4*a*c);
            if(delta==0) System.out.println("Phương trình có nghiệm kép x1 = x2 = "+ (-b/(2*a)) );
            else if(delta<0) System.out.println("Phương trình vô nghiệm");
            else{
                System.out.println("Phương trình có 2 nghiệm phân biệt: ");
                System.out.println("x1 = " + ((-b+Math.sqrt(delta))/(2*a)));
                System.out.println("x2 = " + ((-b-Math.sqrt(delta))/(2*a)));
            }
        }
    }
    public void dienTichtamgiac(){
        float s;
        float p = (a+b+c)/2;
        if(a+b-c>0 && b+c-a>0 && a+c-b>0 && a>0 && b>0 && c>0){
            s = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Diện tích tam giác có độ dài ba cạnh a,b,c là: S = " +s);
        }
        else System.out.println("Ba số đo cạnh trên ko tạo thành tam giác");
    }
    public void sin(){
        a = sc.nextFloat();
        System.out.println("Sin(" + a+ ") = " + Math.sin(a) );
    }
    public void cos(){
        b = sc.nextFloat();
        System.out.println("Sin(" + b+ ") = " + Math.cos(b) );
    }
    public void dienTichHinhhop(){
        System.out.println("Diện tích xung quanh hình hộp là: Sxq = " + 2*(a*b+a*c));
        System.out.println("Diện tích toàn phần của hình hộp là: Stp = " + 2*(a*b+a*c+b*c) );
    }
}
