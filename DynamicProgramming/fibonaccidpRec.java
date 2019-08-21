package DynamicProgramming;

public class fibonaccidpRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] strg=new int[6];
		int ans=	fibonacciRecursivedp(5, strg);
		System.out.println(ans);

	}
	public static int fibonacciRecursivedp(int n,int[] strg)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		if(strg[n]!=0)
		{
			return strg[n];
		}
		int fnm1=fibonacciRecursivedp(n-1, strg);
		int fnm2=fibonacciRecursivedp(n-2, strg);
		int myres=fnm1+fnm2;
		strg[n]=myres;
		return myres;
	}
}
