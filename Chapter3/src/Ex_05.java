//키보드로 부터 정수를 10개 입력받아 배열에 저장하고 이 정수중에서 3의 배수인수만 골라 출력하는 프로그램을 작성하라


import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];

        for(int i=0; i<array.length; i++)
        {
            System.out.println(+(i+1)+"번 째 숫자를 입력하세요");
            array[i]=sc.nextInt();
        }
        for(int i=0; i<array.length; i++)
        {
            if(array[i]%3==0)
            {
                System.out.println("3의 배수는" +array[i] +"입니다.");
            }
        }

    }
}
