import java.lang.System; // Redundant import
import java.lang.*;	 // Redundant import
import java.util.Random;  
import java.util.*;	 // Redundant import

public class RedundantImportExample {

	public static void main(String[] args){
		Random r = new Random();
		System.out.println(r.nextInt(10));
	}
}
