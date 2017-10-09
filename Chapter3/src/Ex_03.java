//키보드로부터 0보다 큰 임의의 정수를 입력받고 이 정수를 이진수로 출력하고 이진수에 들어 있느 1의 개수를 출력하라.


import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        int a; //사용자가 입력
        int num=0;
        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.print("0 보다 큰 임의의 수를 입력해주세요");
            a=sc.nextInt();
            if(a>0)
                break;
        }
        // 배열 1칸 2 , 배열 2칸 4 , 배연 3칸 8 , 배연 4칸 16, 5칸 32

        int array[] = new int[10];


        for(int i=0 ; i<array.length ; i++)
        {
            array[(array.length-1)-i]=a%2; //a 에 17 들어오면  1
            a=a/2; //a에 8 들어감
        }
        for(int i=0 ; i<array.length;i++)
        {
            System.out.print(array[i]);
            if(array[i]==1)
            {
                num=num+1;
            }
        }
        System.out.println();
        System.out.print("1개의 갯수는"+num+"입니다.");



    }
}