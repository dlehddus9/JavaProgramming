//두 수를 입력받아 최대 공약수를 출력하는 프로그램을 작성하라.

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 두를 입력하세요");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int su1=0; //2의배수
        int su2=0; //3의 배수
        int su3=0; //5의 배수
        int su4=0; //나눗셈수
        int sum=0;
        while(true)
        {
            if(a%2==0 && b%2==0)
            {
                su1=su1+1; // a,b 수가 2로 나뉘어지면 su1 2의 배수저장
                a=a/2;
                b=b/2;
            }
            else if(a%3==0 && b%3==0)
            {
                su2=su2+1;
                a=a/3;
                b=b/3;

            }
            else if(a%5==0 && b%5==0)
            {
                su3=su3+1;
                a=a/5;
                b=b/5;
            }
            else if(a>b)
            {
                su4=a/b; //21 7 이면 21/7 3이들어옴
            }
            else if(a<b)
            {
                su4=b/a;
            }
            else if(a==b)
            {
                break;
            }
        }
        sum=2*su1 *3*su2 * su3*5 * su4;
        System.out.println(" 두수의 최대공약수는"+sum+"입니다.");

    }
}
