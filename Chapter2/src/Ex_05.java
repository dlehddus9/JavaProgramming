//Scanner를 이용하여 정수를 3개를 입력받고 이 3개의 수로 삼각형을 만들 수 있는 지를 판별하라.
//삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야한다.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b;

        int a[]= new int[3];
        for(int i=0; i<a.length; i++)
        {
            System.out.println("숫자를 입력하세요");
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
       b=a[0]+a[1]>a[2];

       if(b==true)
       {
           System.out.println("삼각형 가능");
       }
       else{
           System.out.println("삼각형 불가능");
       }



    }
}
