package main;

import java.util.Scanner;

import login.LoginService;
import member.MemberService;

public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemberService mem = new MemberService();
		LoginService log = new LoginService();
		int num;
		while(true) {
			System.out.println("1. 로그인 기능");
			System.out.println("2. 회원가입 기능");
			System.out.println("3. 게시판 기능");
			num = scan.nextInt();
			switch(num) {
			case 1:
				log.log();
				break;
			case 2:
				mem.memberInput();
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


