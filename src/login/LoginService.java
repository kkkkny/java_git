package login;

import java.util.Scanner;

import member.MemberService;

public class LoginService {
	   public void log () {
		   MemberService mem = new MemberService();
	   
	      Scanner scan = new Scanner(System.in);
	      System.out.println("아이디를 입력해주세요 ");
	      System.out.print(">>>>");
	      String name = scan.next();
	      System.out.println("비밀번호 입력해주세요 ");
	      System.out.print(">>>>");
	      String pwd1 = scan.next();
	      System.out.println(mem.id);
	      if(mem.id.contains(name)) {
	    	  if(mem.pwd.contains(pwd1)){
	 	    	 System.out.println("ㅎㅇ");
	    	  }
	      }
	      else {
	    	  System.out.println("아이디 또는 비밀번호를 다시 입력해주세요.");
	      }
}
}