package com.myjava.pac;

import java.lang.Math;
public class Number {
    int x;
    public Number(int num)
    {
        x = num;
    }
    public boolean isZero()
    {
        if (x == 0)
            return true;
        else
            return false;
    }
    public boolean isPositive()
    {
        if (x > 0)
            return true;
        else
            return false;
    }
    public boolean isNagative()
    {
        if (x < 0)
            return true;
        else
            return false;
    }
    public boolean isEven()
    {
        if (x % 2 == 0)
            return true;
        else
            return false;
    }
    public boolean isOdd()
    {
        if (x % 2 != 0)
            return true;
        else
            return false;
    }
    public boolean isPrime()
    {
        if (x == 1)
            return true;
        else if (x == 0)
            return false;
        else
        {
            for (int i = 2; i < x; i++)
            {
                if (x % i == 0)
                    return false;           
            }
        }
        return true;        
    }
    public boolean isArmstrong()
    {
        int temp = x;
        int count = 0, sum = 0;
        while (temp != 0)
        {
            count ++;
            temp /= 10;
        }
        int num = x;
        while (num != 0)
        {
            temp = num % 10;
            sum += (int)Math.pow(temp,count);
            
            num /= 10;
        }
        if (sum == x)
            return true;
        else
            return false;    
    }
    public double getSquare()
    {
        return x*x;
    }
    public double getSquareRoot()
    {
        return Math.sqrt(x);
    }
    public double getCube()
    {
        return (x*x*x);
    }
    public void printFactors()
    {
        if (x == 1)
            System.out.println("Factor is only 1");
        else if (x == 0)
            System.out.println("No factors except 0");
        else
        {
            System.out.print("Factor are: ");
            for (int i = 2; i <= x; i++)
            {
                if (x % i == 0)
                    System.out.print(i+" ");
            }
        }    
    }
    public void printPrimeFactors()
    {
        if (x == 1)
            System.out.println("Factor is only 1");
        else if (x == 0)
            System.out.println("No factors except 0");
        else
        {
            System.out.print("Prime Factor are: ");
            for (int i = 2; i <= x; i++)
            {
                if (x % i == 0)
                {
                    if (isprime(i) == true)
                        System.out.print(i+" ");
                }
            }
        }      
    }
    boolean isprime(int num)
    {
        if (num == 1)
            return true;
        else if (num == 0)
            return false;
        else
        {
            for (int i = 2; i < num; i++)
            {
                if (num % i == 0)
                    return false;           
            }
        }
        return true;        
    }
}