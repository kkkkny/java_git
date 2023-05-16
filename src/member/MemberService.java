package member;

import java.util.ArrayList;
import java.util.Scanner;

import main.memberDTO;
//회원가입
public class MemberService {
   
   Scanner input = new Scanner(System.in);
   String inputid=null, inputpwd=null;


   public void memberInput(memberDTO dto) {
	  ArrayList<String> inputid = new ArrayList<>(); 
	  ArrayList<String> inputpwd = new ArrayList<>(); 
      System.out.print("아이디를 입력해주세요: ");
        String id = input.next();
        System.out.print("비밀번호를 입력해주세요: ");
        String pwd = input.next();
        
        if(dto.getId().contains(id)) {
            System.out.println("중복된 아이디입니다.");
         }
       else if(dto.getPwd().contains(pwd)) {
          System.out.println("중복된 비밀번호입니다.");
       }
       else {
        dto.setId(id);
        dto.setPwd(pwd);
        System.out.println(dto.getId());
       }
       System.out.println("등록되었습니다.");
   }
}
