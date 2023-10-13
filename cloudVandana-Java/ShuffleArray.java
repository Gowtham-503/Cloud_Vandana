package cloudVandana;
import java.util.*;
public class ShuffleArray {
	public static void main(String[] args) {
		//Scanner read = new Scanner(System.in);
		 int[] array = {1,2,3,4,5,6,7};
		 Random random = new Random();
	     for (int i = 0; i <array.length; i++) {
	    	 int j = random.nextInt(0,i + 1);
	    	 int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	     }
	     for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	     }
	}
}

