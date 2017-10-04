//Scanner 클래스를 이용하여 키보드에서 영문자 한 자를 입력받아 소문자이면 대문자로, 대문자이면 소문자로 변환하여 출력하는 프로그램을 작성하라.입력된 문자가 영문자가 아니면,"영문자가 아닙니다." 를 출력하라.
//A 65 Z 90 a 97 z 122
import java.io.IOException;

public class Ex_01 {
    public static void main(String[] args) throws IOException
    {
        System.out.println("영문자 하나를 입력하세용");
        char a=(char)System.in.read();
        int b=(int)a;

        if(b>=65 && b<=90)
        {
            System.out.println("입력하신 문자는 대문자입니다. 소문자로 변환하면");
            b=b+32;
            a= (char)b;
            System.out.println(a);
        }
        else if(b>=97 && b<=122)
        {
            System.out.println("입력하신 문자는 소문자입니다. 대문자로 변환하면");
            b=b-32;
            a= (char)b;
            System.out.println(a);
        }
        else {
            System.out.println("영문자가 아닙니다.");
        }






    }
}
