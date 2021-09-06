package classAndObject;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Player player=new Player();
		String name=sc.next();
		String country=sc.next();
		String skill=sc.next();
		player.setname(name);
		player.setcountry(country);
		player.setskill(skill);
		System.out.println("playername:"+player.getname());
		System.out.println("playercountry:"+player.getcountry());
		System.out.println("playerskill:"+player.getskill());

	}

}
