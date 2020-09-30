import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
  //Prints steps to Move n discs from rod one to rod 3 following rules of Tower of Hanoi game
		Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number of Discs");
		int n=sc.nextInt();
		hanoi(n,'1','3','2');
		System.out.println((int)Math.pow(2,n)-1);
	}
	static void hanoi(int n,char source,char dest,char temp)
	{   
	    if(n==1)
	    {System.out.println("move disc 1 from rod "+source+" to rod "+dest);
	    return ;}
	    hanoi(n-1,source,temp,dest);
	    System.out.println("move disc " +n+" from rod "+source+"to rod "+dest);
	    hanoi(n-1,temp,dest,source);
	}
}
