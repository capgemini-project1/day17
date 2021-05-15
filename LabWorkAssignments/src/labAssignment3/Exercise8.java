package labAssignment3;

import java.util.Scanner;

public class Exercise8 {

		public static void main(String[] args) {
			Scanner sc = new Scanner( System.in );
			      String a;
			      System.out.print( "Enter String: " );
			      a = sc.next();
			      System.out.println(isPositiveString(a));
			      sc.close();
			}
			public static boolean isPositiveString(String a)throws NumberFormatException{
			         int l=a.length();
			         int z=0;
			         while(l>1&&z==0){
			        char ch1 = a.charAt(l-1);
			        char ch2=a.charAt(l-2);
			        int n1=ch1;
			        int n2=ch2;
			        int diff= n1-n2;
			        if(diff<0){
			            z=-1;
			            }
			            l--;
			         }  
			        if(l<=1){
			             return true;
			         }
			         else
			         return false;
			         }
			}  


