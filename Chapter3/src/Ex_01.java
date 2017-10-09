//키보드로 부터 임의의 정수를 입력받고 * 를 출력하는 프로그램을 작성하라 예를 들어 5를 입력받았으면 그 결과는 다음과 같다.
/* *****   1 5
   ****    2 4
   ***     3 3
   **      4 2
   *       5 1            */

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("숫자 하나를 입력해주세요");
        int a=sc.nextInt();
        int b=a;

        for(int i=0; i<b; i++ )
        {
            for(int j=0 ; j<a ; j++)
            {
                System.out.print("*");
            }
            a--;
            System.out.println();
        }

    }
}
