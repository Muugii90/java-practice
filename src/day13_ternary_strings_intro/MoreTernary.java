package day13_ternary_strings_intro;

public class MoreTernary {

	public static void main(String[] args) {
		
		String quality = "bad";
		int rating = (quality.equals("good"))? 100 : 0;
		
		System.out.println("Rating " + rating);
		
		
		int PMhour = 5 ;
		boolean rushHour = (PMhour >= 4 && PMhour <= 7) ? true : false;
		String result = rushHour== true ? "yes" : "no";
		System.out.println(PMhour + " is rush hour?  " + rushHour);
		
		
		//String result = rushHour.equals(true) ? "yes" : "no";
		
		
		int AMHours = 8;
		String amRushHour = AMHours >= 6 && AMHours <=9 ? "yes" : "no";
		
		
		System.out.println(AMHours + " is rush hour? "+ amRushHour);
		}

}
