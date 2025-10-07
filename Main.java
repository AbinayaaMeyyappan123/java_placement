import java.util.*;

public class Main {
    public static void main(String[] args) {
     int marks=23;
      if(marks>=90){
         System.out.println("A+");
       }
      else if(marks>=80 && marks<=89)
      {
        System.out.println("A");
      }
      else if(marks>=70 && marks<=79)
      {
        System.out.println("B");
      }
       else if(marks>=60 && marks<=69)
       {
          System.out.println("C");
       }
       else 
       {
          System.out.println("Fail");
       }
     }
  }

