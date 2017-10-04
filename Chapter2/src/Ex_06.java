import java.util.Scanner;

//키보드로부터 특정 연도를 입력받아 윤년인지 아닌지를 판별하는 프로그램을 작성하라.
//연수가 4로 나누어떨어지는 해는 우선 윤년으로 하되, 그중에서 100으로 나누어 떨어지는 해는 평년으로 하고,
//다만 400으로 나누어 떨어지는 해는 다시 유년으로 판정한다.
public class Ex_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("특정 연도를 입력하세요");
        int a= sc.nextInt(); //연도 입력받음

        if(a%4==0)
        {
            System.out.println("윤년1.");
        }
        else if(a%400==0)
        {
            System.out.println("윤년2.");
        }
        else if(a%100==0)
        {
            System.out.println("평년3.");
        }
        else {
            System.out.println("평년4.");
        }


    }
}
