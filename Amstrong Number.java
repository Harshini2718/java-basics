import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number:");
	   int n=sc.nextInt();
	   int x=n;
	   int sum=0,y;
	   while(n>0){
	       y=n%10;
	       n=n/10;
	       sum=sum+y*y*y;
	   }if(x==sum){
	       System.out.println("Given number is a amstrong");
	   
	   }else{
	       System.out.println("Given number is not amstrong");
	   }
		}
	}
