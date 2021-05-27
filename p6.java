package s;

public class p6 {
    public static void main(String args[]){
        System.out.println("hehe");

        complex a = new complex(1, 3);
        complex.info1(a);
        complex b = new complex(2, 4);
        complex.info2(b);
        compAdd.Add(a, b);
        compSub.Sub(a, b);
    }

}
class complex {
    public int real;
    public int imaginary;

    public complex(int r, int i){
        real=r;
        imaginary=i;
    }

    public static void info1(complex x){
        System.out.println("The first number is " + x.real + " + "+ x.imaginary+"i");

    }
    public static void info2(complex x){
        System.out.println("The second number is " + x.real + " + "+ x.imaginary+"i");

    }


}
class compAdd{
    public static void Add(complex A, complex B){
        complex C = new complex(0, 0);
        C.real = A.real + B.real;
        C.imaginary = A.imaginary + B.imaginary;
        System.out.println("Their addition is "+ C.real+" + "+ C.imaginary +"i");
    }
}

class compSub{
    public static void Sub(complex A, complex B){
        complex C = new complex(0, 0);
        C.real = A.real - B.real;
        C.imaginary = A.imaginary - B.imaginary;
        if (C.imaginary >0) {
            System.out.println("Their subtraction is "+ C.real+" + "+ C.imaginary +"i");
        }
        else {
            System.out.println("Their subtraction is "+ C.real+" "+ C.imaginary +"i");
        }
    }
}
