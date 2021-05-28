//To learn the use of one dimensional array by defining the array dynamically

package s;

import java.util.Scanner;
public class P3Array1D {
    public static void main(String args[]){
        int arr[] = new int[15];
        System.out.println("Enter the number of elements: ");
        Scanner obj = new Scanner(System.in);
        int len = obj.nextInt();

        System.out.println("Enter the elements: ");
        for (int i=0; i<len; i++){
            arr[i] = obj.nextInt();

        }
        System.out.println("The elements after adding 5 are: ");
        for (int i=0; i<len; i++){
            arr[i]+=5;

            System.out.println(arr[i]);
        }
    }
}
