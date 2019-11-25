package strings;

public class RotateStr_4 {

	public static void main(String[] args) {

		String s1="Shweta";
		int n=s1.length();
		
		StringBuffer sb=new StringBuffer(s1);
		sb.append(s1);
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j!=n;j++)
			{
				System.out.print(sb.charAt(i+j));
			}
			System.out.println();
		}
	}

}
