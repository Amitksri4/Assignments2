
class PatternVar		
{
	 int num;
	
	


}

class PatternLogic
{
	public void patInput(int num)
	{
	int i,j;
		for(i=1;i<=num;i++)
		{
	          for(j=i;j>=1;j--)
		  {
			System.out.print(+j);

		  }
	System.out.println();
		}	
		
	}

}

class PatternDisplay	
{

	public static void main(String[] args)

	{
		PatternVar pv=new PatternVar();
		PatternLogic pl =new PatternLogic();

		System.out.print("Enter  no. of Argument : ");
		pv.num=Integer.parseInt(System.console().readLine());

		
		pl.patInput(pv.num);
		

	}
}		