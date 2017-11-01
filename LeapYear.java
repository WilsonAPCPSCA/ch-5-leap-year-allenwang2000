import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("What year is it?");
		int year = in.nextInt();
		boolean leapyear= isLeapYear(year);
		System.out.println(leapyear);
		
	}

public static boolean isLeapYear(int year) {
	boolean leapyear;
	if((year%4==0 && year%100!=0) || (year%400==0)) leapyear=true;
	else
		leapyear = false;
	return leapyear;
	

	}

}
