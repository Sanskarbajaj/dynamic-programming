package DynamicProgramming;

public class fibonaccidpIterative {

	public static void main(String[] args) {
		int ans=fibonacciiterative(5);
		System.out.println(ans);
	}
	public static int fibonacciiterative(int n)
	{ int ans;
		int[] strg=new int[n+1];
		int i;
		strg[0]=0;
		strg[1]=1;
		for( i=2;i<=n;i++)
		{
			strg[i]=strg[i-1]+strg[i-2];
			
		}
//		for(int v:strg)
//		{
//			System.out.println(v);
//		}
		
		return strg[n];
		
	}

}
