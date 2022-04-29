class AddArray
{
	public static void main(String args[])
	
	{
		int a[][]={{1,4,6},{2,3,5},{3,4,5}};		// delaration and instantiation in single line , [][] means row column
		int b[][]={{1,5,6},{3,4,2},{1,2,4}};
		int c[][]=new int[3][3];
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			System.out.print(c[i][j]+" ");
			}
		System.out.println();	
			
		}
	}
}
		
		