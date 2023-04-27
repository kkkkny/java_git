package member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberService {
   
   Scanner input = new Scanner(System.in);
   ArrayList<String> id = new ArrayList<String>();
   ArrayList<String> pwd = new ArrayList<String>();
   String inputid=null, inputpwd=null;

   public void memberInput() {      
      System.out.print("아이디를 입력해주세요: ");
        String id = input.next();
        System.out.print("비밀번호를 입력해주세요: ");
        String pwd = input.next();
        
        if(this.id.contains(inputid)) {
            System.out.println("중복된 아이디입니다.");
         }
       else if(this.pwd.contains(inputpwd)) {
          System.out.println("중복된 비밀번호입니다.");
       }
       else {
        this.id.add(id);
        this.pwd.add(pwd);
       }
       System.out.println("등록되었습니다.");
   }
}
