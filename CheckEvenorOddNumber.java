import java.util.Scanner;
import java.util.*;

public class CheckEvenorOddNumber{


    void cheakoddeven(int num){
        if(num%2==0){
            System.out.println(num + " is a even number");
        }else{
            System.out.println(num + " is a odd number");
        }
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        CheckEvenorOddNumber ceon = new CheckEvenorOddNumber();
        ceon.cheakoddeven(num);
        sc.close();
    }
}