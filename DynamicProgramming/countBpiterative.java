package DynamicProgramming;

public class countBpiterative {

	public static void main(String[] args) {
		
int ans=countbpiterative(0, 10);
System.out.println(ans);
	}
 public static int countbpiterative(int cp,int ep)
 {  int[] strg=new int[ep+1];
	 strg[ep]=1;
	 int count=0;
	 for(int i=ep-1;i>=0;i--)
	 {
		 for(int j=1;j<=6 && i+j<strg.length;j++)
		 {
		 count=count+strg[j+i];
		 }
		 strg[i]=count;
	 }
	 return strg[cp];
 }
}
