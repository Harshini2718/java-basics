import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 /* int a=0;
	  int b=1;
	  int c;*/
	  Scanner sc=new Scanner(System.in);
	  int num=sc.nextInt();
	  int ori_num=num;
	  int rev=0;
	  while(num!=0){
	      rev=rev*10+num%10;
	      num=num/10;
	  }
	  if(ori_num==rev){
	      System.out.println(ori_num+" Palandrome Number");
	  }else{
	      System.out.println(ori_num+" Not palandrome Number");
	  }
	      
	  }
	}
