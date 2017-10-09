//키보드로부터 임의의 문자를 입력받고 그 문자보다 알파벳 순위가 낮은 모든 문자를 출력하는 프로그램을 작성하라. 예를들어, 'e'를 입력받았으면 그결과는 다음과 같다
/*
abcde
abcd
abc
ab
a
*/
// a 97 z 122 A 65 Z 90
import java.io.IOException;

public class Ex_02 {
    public static void main(String[] args) throws IOException{

        System.out.println("문자하나를 입력해주세요");
        int a = System.in.read();

        if(a>=97 && a<=122)
        {
            char b=(char)a;
            for(int i=97 ; i<=a; i++)
            {
                System.out.println(b);
            }

        }
        else if(a>=65 && a<=90)
        {
            System.out.println("소문자를 입력해주세요");
        }
        else {
            System.out.println("문자를 입력해주세요");
        }






    }
}
