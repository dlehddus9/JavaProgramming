//가위바위보게임

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b;
        System.out.println("가위 바위 보 게임입니다. 가위,바위,보 중에서 입력하세요");
        System.out.print("철수 >>");
        a=sc.next();
        System.out.print("영희 >>");
        b=sc.next();

        if(a.equals("가위"))
        {
            if(b.equals("가위"))
            {
                System.out.print("무승부 입니다.");
            }
            else if(b.equals("바위"))
            {
                System.out.print("영희가 이겼습니다.");
            }
            else {
                System.out.print("철수가 이겼습니다.");
            }
        }


        else if(a.equals("바위"))
        {
            if(b.equals("가위"))
            {
                System.out.print("철수가 이겼습니다. ");
            }
            else if(b.equals("바위"))
            {
                System.out.print("무승부 입니다.");
            }
            else {
                System.out.print("영희가 이겼습니다.");
            }
        }

        else if(a.equals("보"))
        {
            if(b.equals("가위"))
            {
                System.out.print("영희가 이겼습니다. ");
            }
            else if(b.equals("바위"))
            {
                System.out.print("철수가 이겼습니다.");
            }
            else {
                System.out.print("무승부 입니다.");
            }
        }

    }
}
