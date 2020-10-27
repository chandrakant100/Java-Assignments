//To find the area of the triangle
package src;
class Area
{
    Area(float side1,float side2,float side3)
    {   
        double Area;
        float S;
        if (((side1+side2) > side3) && ((side1+side3) > side2) && ((side2+side3) > side1))
            {
                S = (side1 + side2 + side3) / 2;
                Area = Math.sqrt(S*(S-side1)*(S-side2)*(S-side3));
                System.out.println("Area of the triangle is: "+String.format("%.2f",Area));
             }
        else
        {
            System.out.println("Triangle is not possible");
        }
    }           
}
class Triangle
{
    public static void main(String[] args) 
    {
        if (args.length != 3)
        {
            System.out.println("Invalid arguments!!!");
            return;
        }
        float side1, side2, side3;

        side1 = Float.parseFloat(args[0]);
        side2 = Float.parseFloat(args[1]);
        side3 = Float.parseFloat(args[2]);

        Area obj = new Area(side1,side2,side3);

        
    }   
}
