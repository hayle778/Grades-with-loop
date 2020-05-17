/*
1. prompt the user
2.introduce the computer what kind of data variable you use and declare a method
3.Use scanner for adding the user input
4.assign and introduce the grade for the computer using the variable that you use
5. print out the grade based on the mark that the student get it
6.IF SCORE IS BETWEEN 90 AND 100 GRADE IS A
else if score is between 80 and 89 grade is B





*/
import java.util.Scanner;

public class Met {
public static void main (String[]args) {

    int y = 0;
   // int n;
  for (y = 0; y <= 10; y++) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter a number: ");
      int number = input.nextInt();
    //  System.out.println(number);
      if (number >= 90 && number < 100)
          System.out.println("A");
      else if (number >= 80 && number < 90)
          System.out.println("B");
      else if (number >= 70 && number < 80)
          System.out.println("C");
      else if (number >= 60 && number < 70)
          System.out.println("D");
      else
          System.out.println("F");
   //System.out.println("Grade" + number);

  }

 // System.out.println("........" + y + "..........");// concatinate strings

  }

  }
