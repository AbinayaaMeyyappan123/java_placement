import java.util.*;

public class Employee{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter years of experience: ");
        int experience = sc.nextInt(); 
      if( experience>5){
         System.out.println("15% bonus");
       }
      else if(experience>=3)
      {
        System.out.println("10% bonus");
      }
       else 
       {
          System.out.println("5% bonus");
       }
     }
  }

