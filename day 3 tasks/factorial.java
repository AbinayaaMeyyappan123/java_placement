import java.util.*;
import java.io.*;

public class factorial
{
    	public static void main(String[] args) {
    	   Scanner sc= new Scanner(System.in);
    	  System.out.print("Enter a number: ");
    	   int num=sc.nextInt(); 
    	   int sum=1;
    	   
    	   if(num!=0&&num!=1){
    	       for(int i=num;i>=1;i--){
    	       sum=sum*i;
    	   }}
    	   else{
    	       System.out.println("Enter numbers from 2");
    	   }
    	   System.out.println("Factorial value: "+sum);
    	   
    	   }}