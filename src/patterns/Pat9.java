package patterns;

public class Pat9 {

	public static void main(String[] args) {
		int count=1;
		int ch=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			int rev=count+ch-1;
			for(int k=0;k<i;k++)
			{
				System.out.print(rev--);
				ch++;
			}
			System.out.println();
			count++;
		}

	}
}
	


	


