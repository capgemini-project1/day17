package labAssignment3;
	import java.util.Scanner;
		public class ModifyNumber{
			public static void main(String[] args){
				Scanner myInput = new Scanner( System.in );
			      int a;
			      int b;
			      System.out.print( "Enter integer: " );
			      a = myInput.nextInt();
			      b=modifyNumber(a);
			      System.out.println("result "+b); 
			      myInput.close(); 
			    }
			    public static int modifyNumber(int a){
			        int res=0,diff;
			        String num=Integer.toString(a);
			        int l=num.length();
			        char ch = num.charAt(l-1);
			        res=res+Integer.parseInt(String.valueOf(ch));
			        int m=10;
			        while(l>1){
			        char ch1 = num.charAt(l-1);
			char ch2 = num.charAt(l-2);
			diff=Math.abs(Integer.parseInt(String.valueOf(ch1))-Integer.parseInt(String.valueOf(ch2)));
			res=res+diff*m;

			l--;
			m=m*10;
			        }
			        return res;
			    }
			}

