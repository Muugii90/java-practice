package day47_blocks;
import static java.lang.Math.*;
import static java.lang.Character.*;
import static java.util.Arrays.toString;
import static java.time.LocalDateTime.now;
import java.util.Arrays;

public class StaticImport {
	
	public static void main(String[] args) {
		//
		System.out.println(PI);
		System.out.println(max(10,10));
		System.out.println(min(5,100));
		System.out.println(floor(3.55));
		System.out.println(round(45.99));
		System.out.println(round(15.5));
		System.out.println(abs(9.09));
		System.out.println(pow(10.4, 2));
		System.out.println(sqrt(5));
		
		System.out.println(isDigit('4'));
		System.out.println(isAlphabetic('J'));
	
		int[]nums = {233,455,66,76,77,76,99};
		System.out.println(Arrays.toString(nums));
		System.out.println(now());
	}
}
