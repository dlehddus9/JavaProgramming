//Scanner 클래스를 사용하여 5개 학점 ('A','B','C','D','F')을 문자로 입력받아  ArrayList에 저장하고
//ArrayList에 저장하고 ,. ArrayList를 검색하여 학점을 점수(A=4, B=3 , C=2 D=1 F=0) 으로 변환하여 프로그램을 작성하라

package Ex_02;

import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        int total=0;
        ArrayList<String> a = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<5 ; i++)
        {
            System.out.println("학점을 입력하세요");
            String c=sc.next();
            a.add(c);
        }
        for(int i=0 ; i< a.size() ; i++  )
        {
            String k=a.get(i).toLowerCase();
            switch (k)
            {
                case "a":total=total+4;
                break;
                case "b":total=total+3;
                break;
                case "c":total=total+2;
                break;
                case "d":total=total+1;
                break;
                case "f":break;
                default:System.out.println("잘못된 성적입니다.");

            }
        }
        System.out.println(total+"점 입니다.");
    }
}
