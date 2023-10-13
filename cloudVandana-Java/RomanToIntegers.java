package cloudVandana;

import java.util.Scanner;

public class RomanToIntegers {
	public static void main(String[] args) {
		int num=0;
		int sum = 0;
		Scanner read = new Scanner(System.in);
		String a = read.nextLine();
		for(int i=a.length()-1;i>=0;i--)
		{
			char choice = a.charAt(i);
			switch(choice)
			{
			case 'I': num = 1;break;
			case 'X' : num = 10;break;
			case 'V' : num =5;break;
			case 'L' : num = 50;break;
			case 'C' : num  =100;break;
			case 'D' : num = 500; break;
			case 'M' : num = 1000;break;
			}
			if( 4*num < sum)
				sum = sum - num;
			else
				sum =sum+num;		
		}
		System.out.println(sum);
		read.close();
	}

}
