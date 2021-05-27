package s;

public class rec {
    static int fact(int m){
        if (m==1) return 1;
        else return m*fact(m-1);
    }
public static void main(String args[]){
    System.out.println(fact(6));
}
}