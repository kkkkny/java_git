package main;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1. 로그인 기능");
			System.out.println("2. 회원가입 기능");
			System.out.println("3. 게시판 기능");
			num = scan.nextInt();
			switch(num) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				System.out.println("오류");
				break;
			}
		}
	}
}


