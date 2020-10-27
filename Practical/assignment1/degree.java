package src;
import java.util.Scanner;
class Temprature
  {
    void degCelcius(float fahrenheit)
    {
        float cel;
        cel = ((fahrenheit - 32) * 5) / 9;

        System.out.println("Temptrature in Degree Celtius is :"+String.format("%.2f",cel));
    }
  }
  class Degree
  {
    public static void main(String[] args)
    {
        System.out.println("Enter the temprature in ferenheit: ");
        Scanner sc  = new Scanner(System.in);

        float fahrenheit = sc.nextFloat();

        Temprature obj = new Temprature();
        obj.degCelcius(fahrenheit);
    }
  }