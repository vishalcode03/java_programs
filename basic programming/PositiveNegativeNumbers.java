import java.util.Scanner;
import java.util.*;
 public class PositiveNegativeNumbers{
    
   5 void checkNumber(int number)
{
    if(number>0){
        System.out.println(number + " is a positve number");
    }else if(number<0){
        System.out.println(number +" is a negative number");

    }else{
        System.out.println(number + " is zero");
    }
}

public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = sc.nextInt();
    PositiveNegativeNumbers pnn = new PositiveNegativeNumbers();
    pnn.checkNumber(number);
    sc.close();
}
}