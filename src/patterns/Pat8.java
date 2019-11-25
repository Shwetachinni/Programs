package patterns;

public class Pat8 {

	public static void main(String[] args) {
	{
			int space=3;
			int star=1;
			int ch=1;
			for(int i=1;i<=4;i++)
			{
				for(int k=1;k<=space;k++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=star;j++)
				{
					System.out.print(ch);
					ch++;
				}
				System.out.println(" ");
				star++;
				space--;
			}

		}
		

	}

}
