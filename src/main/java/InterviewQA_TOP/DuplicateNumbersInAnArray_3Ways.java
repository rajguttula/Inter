package InterviewQA_TOP;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class DuplicateNumbersInAnArray_3Ways {

	int []n= {1,3,3,7,8,8,9};
	@Test
	public void Duplicate1() {
		for(int i=0;i<n.length-1;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					System.out.println(n[i]);
					break;
				}
			}
		}		
	}
		@Test
		public void Duplicate2() {
			Arrays.sort(n);
			for(int i=0;i<n.length-1;i++)
			{
				if(n[i]==n[i+1])
				{
					System.out.println(n[i]);
				}
			}
		}
			
			@Test
			public void Duplicate3() {
				Set<Integer>set=new HashSet<Integer>();
				for(int i=0;i<n.length-1;i++)
				{
					if(!set.add(n[i]))
					{
						System.out.println(n[i]);
					}
				}

	}

}
