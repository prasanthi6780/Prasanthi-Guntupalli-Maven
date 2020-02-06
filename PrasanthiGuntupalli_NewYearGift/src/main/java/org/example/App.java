package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Minimum Sugar level:");
        double min=sc.nextInt();
        System.out.println("Enter the Maximum Sugar level:");
        double max=sc.nextInt();
        NewYearGift newyeargift= new NewYearGift(min,max);
        newyeargift.main(args);
        newyeargift.totalWeight();

    }
}
