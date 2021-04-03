package src;
import java.io.File;
import java.io.IOException;

class ListDirectories1 
{
    public static void main(String args[])
    {
        File dir = new File("C:/MY-PROGRAME/3rd semester/java/lab assignment");

        if (!dir.isDirectory())
        {
            System.out.println("Not a diectory!!\n programe ends");
            return;
        }
    
        File dirArr[] = dir.listFiles();
        int fileCount = 0, dirCount = 0;
    
        for (File contain : dirArr)
        {
            if (contain.isDirectory())
            {
                ++dirCount;
                System.out.println("Directory name  :\t" + contain.getName());
            }
            else
            {
                ++fileCount;
            }
        }
        System.out.print("\nTotal sub-directory(s) = " + dirCount + "\nTotal file(s) = " + fileCount);
    } 
}