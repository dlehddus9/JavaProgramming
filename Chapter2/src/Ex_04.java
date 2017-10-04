//369 게임을 간단히 작성해보자. 1~99 까지의 정수를 키보드로부터 입력받고 정수에 3,6,9 중 하나가 있는 경우는 "박수짝" 을 출력하고 두개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라.
//예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝" 을 , 36인 경우 "박수짝짝" 을 출력하면 된다.


import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        int a;
        Scanner sc =new Scanner(System.in);
        while(true){
            System.out.println("1~99까지의 정수를 입력하세요");
             a=sc.nextInt();


            int b= a/10; //65 가 들어왔으면 b =6
            int c= a%10; //65 가 들어오면 c=5

            int clap=0;
            if(b%3==0 && b!=0)
            {
                clap++;
            }
            if(c%3==0 && c!=0)
            {
                clap++;
            }
            if(clap==2)
            {
                System.out.println("박수짝짝");
            }
            else if(clap==1)
            {
                System.out.println("박수짝");
            }
            else {

            }
            if(a>100 || a<0)
            {
                break;
            }



        }

    }
}
