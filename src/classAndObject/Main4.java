package classAndObject;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Innings innings=new Innings();
		String number=sc.next();
		String battingTeam=sc.next();
		Long runs=sc.nextLong();
		innings.setnumber(number);
		innings.setbattingTeam(battingTeam);
		innings.setruns(runs);
		System.out.println("Inning Details");
		System.out.println("Inning number:"+innings.getnumber());
		System.out.println("battingTeam:"+innings.getbattingTeam());
		System.out.println("runs:"+innings.getruns());

	}

}
