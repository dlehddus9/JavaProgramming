package Ex06;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book= new Book();

        while(true)
        {
            System.out.println("예약(1), 조회(2), 취소(3), 끝내기(4)>>");
            int num=sc.nextInt();
            switch (num){
                case 1: book.Check();
                    break;
                case 2: book.Show();
                    break;
                case 3: book.Cancle();
                    break;
                case 4:System.out.println("프로그램을 종료합니다.");
                        System.exit(0);
                    break;
                default:System.out.println("1~4번을 입력하세요");
            }
        }
    }
}
