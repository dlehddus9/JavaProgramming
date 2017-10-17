/*6.
        간단한 공연 예약 시스템을 만들어보자. 다수의 클래스를 다루고 객체의 배열을 다루
        기에는 아직 자바로 프로그램 개발이 익숙하지 않은 초보자에게 다소 무리가 있을 것
        이다. 그러나 반드시 넘어야 할 산이다. 이 도전 주제를 통해 산을 넘어갈 수 있는 체
        력을 키워보자. 공연 예약 시스템의 내용은 다음과 같다.
        1.공연은 하루에 한번 있다.
        2.좌석은 s석,a석,b석 탑이 있으며 모두 10석의 좌석이 있다.
        3.공연 예약시스템의 메뉴는 "예약","조회","취소","끝내기"가 있다.
        4.예약은 한자리만 예약할 수 있고 좌석 타입, 예약자 이름, 좌석 번호를 순서대로
        입력받아 예약한다.
        5.조회는 모든 종류의 좌석을 표시한다.
        6.취소는 예약자의 이름을 입력하여 취소한다.
        7.없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소 등의 대해서 오류메시지를 출력하
        고 사용자가 다시 시도하도록 한다.*/
 package problem6;
import java.util.Scanner;

import static java.lang.System.exit;

public class ex_01 {
        public static void main(String[] args) {
                Opera opera=new Opera();
                int k=0;
                Scanner sc= new Scanner(System.in);
                while(true) {
                        System.out.println("예약<1>, 조회<2>, 취소<3> , 끝내기<4>");
                        k=sc.nextInt();
                        switch (k)
                        {
                                case 1:opera.Book();
                                        break;
                                case 2:opera.View();
                                        break;
                                case 3:opera.Cancle();
                                        break;
                                case 4:System.out.println("종료합니다.");
                                        exit(0);
                                        break;
                        }


                }
        }

}
