package labAssignment3;

	import java.util.*;
	public class AlterString {
			public static void main(String args[]) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a string");
				String str=sc.nextLine();
				System.out.println("Altered string is:"+alterString(str));
				sc.close();
				}
				static boolean isVowel(char ch)
				    {
				        if (ch != 'a' && ch != 'e' && ch != 'i'
				                && ch != 'o' && ch != 'u')  
				        {
				            return false;
				        }
				        return true;
				    }
				public static String alterString(String a){
				char[] s=a.toCharArray();
				for (int i = 0; i < s.length; i++)
				        {
				            if (!isVowel(s[i]))
				            {
				                if (s[i] == 'z')  
				                {
				                    s[i] = 'b';
				                }
				                else
				                {
				                    s[i] = (char) (s[i] + 1);
				                    if (isVowel(s[i]))  
				                    {
				                        s[i] = (char) (s[i] + 1);
				                    }
				                }
				            }
				        }
				        return String.valueOf(s);  
				     
				}
				
				}
