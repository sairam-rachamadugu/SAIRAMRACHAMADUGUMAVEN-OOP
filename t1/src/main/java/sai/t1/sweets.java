package sai.t1;

import java.util.Scanner;

public class sweets {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	App first=new App();
	first.inputChocolates();
	System.out.println("enter the on what base should be displayed\n1)price\n2)Weight");
	int sortType=sc.nextInt();
	first.calcRange(sortType);
}
}
