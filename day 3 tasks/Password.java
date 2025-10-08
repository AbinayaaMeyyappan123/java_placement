import java.util.*;

public class Password{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter a username:");
        String username=sc.nextLine();
        String correctpass="abinayaa";
        int attempt=3;
        while(attempt!=0){
            System.out.println("enter password");
            String password =sc.nextLine();
            attempt--;
        if(correctpass.equals(password)) {
            System.out.println("Login successfully");
             break;
        }
       else {
           System.out.println("Login failed");
       }
        }
    }
}

