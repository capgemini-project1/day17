package labAssignment3;

public class MirrorImage {

public String getImage(String input)
{
	char[] try1=input.toCharArray();
	String reverse="";
	for(int i=try1.length-1;i>=0;i--) {
		reverse=reverse+try1[i];
		
	}
	return reverse;
}
public static void main(String[] args) {
	String input="MOON";
	MirrorImage GetImage = new MirrorImage();
	String reverse=GetImage.getImage(input);
	String res=input+"|"+reverse;
	System.out.println(res);
}
}
