import java.util.Scanner;

//your code goes here


public class p5 {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    }
}
class Converter{
    static String toBinary(int num){
        String binary="";
        while(num > 0) {
            binary = (num%2)+binary;
            num /= 2;

        }
        return binary;
    }
}