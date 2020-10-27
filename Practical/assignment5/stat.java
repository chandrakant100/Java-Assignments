package src;
class Static
{
    static int num = 10;
    static void change()
    {
        num = 20;
    }
    public static void main(String[] args)
    {
        System.out.println("num = "+num);
        change();
        System.out.println("num = "+num);
    }
}    
