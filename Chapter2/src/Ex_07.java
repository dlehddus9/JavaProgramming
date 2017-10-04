//2차원 평면에서 하나의 직사각형은 두 점으로 표현된다.(50,50) 과 (100,100) 의 두점으로 이루어진 사각형이 있다고 하자.
//이때 키보드로부터 한 점을 구성하는 정수 x와 y 값을 입력받고 점(x,y)가 이 직사각형 안에 있는지를 판별해보자

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        System.out.println("좌표 두개를 입력하세요");
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();

        int k=0;

        if(a>=50 && a<=100)
        {
            k++;
        }
        if(b>=50 && b<=100)
        {
            k++;
        }
        if(k==2)
        {
            System.out.println("직사각형 안에 있습니다.");
        }
        else {
            System.out.println("직사각형 밖에 있습니다.");
        }


    }
}
