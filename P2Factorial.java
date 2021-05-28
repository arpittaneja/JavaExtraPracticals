//To find factorial of a given number.

package s;
import java.util.Scanner;

public class P2Factorial {
    public static void main(String args[]){
       int fact=1;
        System.out.println("Enter the number whose factorial you want to find: ");
        Scanner obj= new Scanner(System.in);
        int num  = obj.nextInt();

        for (int i=num; i>1; i--){
            fact*=i;
        }
        System.out.println("The factorial of "+num+" is "+fact);


    }
}
