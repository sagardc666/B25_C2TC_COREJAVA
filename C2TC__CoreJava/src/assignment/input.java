package assignment;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int temperature=sc.nextInt();
			int week=5;
			for(int i=1;i<week;i++) {
				temperature=temperature-2;
System.out.println(temperature);
			}
		}
	}

}
