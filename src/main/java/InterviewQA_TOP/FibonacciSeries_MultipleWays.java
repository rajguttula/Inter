package InterviewQA_TOP;

import java.util.Scanner;

import org.testng.annotations.Test;

public class FibonacciSeries_MultipleWays {

	@Test
	public void fibonacciSeries1() {
		// TODO Auto-generated method stub
        System.out.println("Enter a number..");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int f1=0;
        int f2=1;
        int sum=0;
        for(int i=0;i<=n;i++)
        {
        	sum=f1+f2;
        	System.out.println(f1);
        	
        	f1=f2;
        	f2=sum;
        	
        }
        in.close();
	}

}
