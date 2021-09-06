package classAndObject;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Venue venue =new Venue();
	String name=sc.next();
	String city=sc.next();
	venue.setname(name);
	venue.setcity(city);
	System.out.println("venue details:");
	System.out.println("venue name:"+venue.getname());
	System.out.println(" city name:"+venue.getcity());
	
	
	
	

	}

}
