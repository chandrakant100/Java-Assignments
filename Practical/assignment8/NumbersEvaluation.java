import com.myjava.pac.Number;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumbersEvaluation {
    public static void main(String[] args)
    {
        try{    
            Scanner sc = new Scanner(System.in);
            int num;
            System.out.println("Enter any number: ");
            num = sc.nextInt();

            Number obj = new Number(num);
            System.out.println("Number is "+num);
            System.out.println("cube = "+obj.getCube());
            System.out.println("Square "+obj.getSquare());
            System.out.println("Squareroot "+obj.getSquareRoot());
            System.out.println("is Armstrong: "+obj.isArmstrong());
            System.out.println("is even: "+obj.isEven());
            System.out.println("is Odd: "+obj.isOdd());
            System.out.println("is nagative: "+obj.isNagative());
            System.out.println("is positive: "+obj.isPositive());
            System.out.println("is prime: "+obj.isPrime());
            System.out.println("is zero: "+obj.isZero());
            
            obj.printFactors();
            System.out.println();
            obj.printPrimeFactors();

            sc.close();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please Enter integer number!!!");
        }    
    }
}
