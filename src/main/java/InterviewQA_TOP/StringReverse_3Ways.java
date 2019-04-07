package InterviewQA_TOP;

import org.testng.annotations.Test;

public class StringReverse_3Ways {

	String name="Raju";
	
	@Test
	public void stringRevers1() {
		char[] ch=name.toCharArray();
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		System.out.println("");
	}
	
	@Test
	public void stringRevers2() {
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println("");
	}
	
	@Test
	public void stringRevers3() {
		StringBuffer str=new StringBuffer(name).reverse();
		System.out.println(str);
	}
	
}
