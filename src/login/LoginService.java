package login;

import java.util.Scanner;

import main.memberDTO;

public class LoginService {
	
	   public void log (memberDTO dto) {
		  System.out.println(dto.getId());
	      Scanner scan = new Scanner(System.in);
	      System.out.println("아이디를 입력해주세요 ");
	      System.out.print(">>>>");
	      String name = scan.next();
	      System.out.println("비밀번호 입력해주세요 ");
	      System.out.print(">>>>");
	      String pwd1 = scan.next();
	      
	      System.out.println(dto.getId());
	      if(dto.getId().contains(name)) {
	    	  if(dto.pwd.contains(pwd1)){
	 	    	 System.out.println("ㅎㅇ");
	    	  }
	      }
	      else {
	    	  System.out.println("아이디 또는 비밀번호를 다시 입력해주세요.");
	      }
}
}