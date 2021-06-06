package Practicals;

import java.util.Scanner;

public class P5Complex{
    public static void main(String[] args){
        System.out.println();

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the real part of first number: ");
        int first_real = obj.nextInt();
        System.out.print("Enter the imaginary part of first number: ");
        int first_imag = obj.nextInt();
        System.out.print("Enter the real part of second number: ");
        int second_real = obj.nextInt();
        System.out.print("Enter the imaginary part of second number: ");
        int second_imag = obj.nextInt();

        A a = new A(first_real, first_imag);
        A b = new A(second_real, second_imag);

        System.out.println(A.toString(a, b));
    }
}

class A {
    private int real;
    private int imaginary;

    public A(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public static String Add(A A, A B){
        String result;
        Practicals.A C = new A(0, 0);
        C.real = A.real + B.real;
        C.imaginary = A.imaginary + B.imaginary;
        if (C.imaginary>0) {
            result = C.real + " + " + C.imaginary + "i";
        }
        else{
            result = C.real + "  " + C.imaginary + "i";
        }
        return result;
    }

    public static String Multiply(A A, A B){
        String result;
        Practicals.A C = new A(0,0);
        C.real = A.real*B.real - A.imaginary* B.imaginary;
        C.imaginary = A.imaginary*B.real + B.imaginary* A.real;
        if (C.imaginary>0) {
            result = C.real + " + " + C.imaginary + "i";
        }
        else{
            result = C.real + "  " + C.imaginary + "i";
        }
        return result;
    }

    public static String toString(A A, A B) {
        return "The result of addition is " + Practicals.A.Add(A, B) + "\n" + "The result of multiplication is " + Practicals.A.Multiply(A, B);
    }
}