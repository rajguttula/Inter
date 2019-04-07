package InterviewQA_TOP;

public class NextAlphabatInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="A1B2C3";
		char[]ch=str.toCharArray();
		int asc=0;
		
		for (char c : ch) {
			asc=(int)c+1;
			System.out.print((char)asc);
		}
		
		/*int n=0;
		for(int i=0;i<ch.length;i++)
		{
			n=(int)ch[i];
			n=n+1;
			ch[i]=(char)n;
		}
		for (char c : ch) {
			System.out.print(c);
		}*/

	}

}
