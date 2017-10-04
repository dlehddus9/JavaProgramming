//2차원 평면에서 하나의 직사각형은 두점으로 표현된다. (50,50) 과 (100,100) 의 두점으로 이루어진 직사가형이 있다고하자.
//이때 키보드로부터 다른 직사가형을 구하성하는 두 점 (x1,y1), (x2,y2) 를 입력받아 두개의 직사형이 서로 충돌하는지 판별하는 프로그램을 작성하라.


import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[2]; //x1,y1
        int b[] = new int[2]; //x2,y2

        for(int i=0; i<1; i++)
        {
            System.out.println("x1 좌표를 입력해주세요");
            a[i]=sc.nextInt();
            System.out.println("y1 좌표를 입력해주세요");
            a[i+1]=sc.nextInt();

            System.out.println("x2 좌표를 입력해주세요");
            b[i]=sc.nextInt();
            System.out.println("y2 좌표를 입력해주세요");
            b[i+1]=sc.nextInt();
        }
        if(a[0]>=100 || a[1]>=100)
        {
            System.out.println("충돌하지 않습니다.");
        }

        else if(b[0]<=50 || b[1]<=50)
        {
            System.out.println("충돌하지 않습니다.");
        }
        else
        {
            System.out.println("충돌합니다");
        }


    }
}
