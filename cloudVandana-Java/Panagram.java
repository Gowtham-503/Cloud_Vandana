package cloudVandana;
import java.util.Scanner;
public class Panagram {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String a = read.nextLine();
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String newa = a.toLowerCase();
		int c=0;
		for(int i=0;i<newa.length();i++)
		{
			if(newa.indexOf(alpha.charAt(i))>=0)
				c++;
			else 
				break;
		}
		if(c>=26)
		System.out.println("Panagram");
		else
			System.out.println("not panagram");
		read.close();
	}
}
