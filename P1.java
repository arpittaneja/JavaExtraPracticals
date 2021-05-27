package s;

import java.io.*;

public class P1 {
    public static void main(String args[]){
        int num, sum=0;
        System.out.println("The command line arguments are 10, 20, 30.");

        for(int i=0; i<args.length; i++){
            num=i=Integer.parseInt(args[i]);
            sum+=num;
        }
        System.out.println("Sum of elements is "+sum);
    }
}
