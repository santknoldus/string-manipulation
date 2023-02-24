package com.knoldus.stringmanipulation;
import java.util.Scanner;
public class Main
{
    public static void main( String[] args )
    {
        StringApi stringApiObj = new StringApi();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        System.out.println("Reversed string = "+stringApiObj.reverseString(string));
        System.out.println("Length of string is = "+stringApiObj.getStringLength(string));
    }
}
