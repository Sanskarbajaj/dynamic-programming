package DynamicProgramming;

public class countboardpathRecdp {

	public static void main(String[] args) {
		int[] strg=new int[11];
int ans=CountBpRecDp(0, 10, strg);
System.out.println(ans);
	}
	public static int CountBpRecDp(int cp,int ep,int[] strg)
	{  if(cp==ep)
	{
		return 1;
	}
		if(cp>ep)
		{
			return 0;
		}
		if(strg[cp]!=0)
		{
			return strg[cp];
		}
		int count=0;
		
		for(int i=1;i<=6;i++)
		{
			
			count=count+CountBpRecDp(cp+i, ep, strg);
		}
		strg[cp]=count;
		return count;
	}

}
