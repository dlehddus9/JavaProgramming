/*숨겨진 카드의 수를 맞추는 게임을 만들어보자. 0에서 99까지의 임의의 수를 가진 카드를 한장 숨기고 이 카드의 수를 맞추는 게임이다. 아래의 화면과 같이 카드 속의 수가 12인 경우를 보자. 수를 맞추는 사람이 55라고 입력하면 "더 낮게"
, 다시 11이라고 입력하면 "더 높게 " 라는 식으로 범위를 좁혀가면서 수를 맞춘다. 게임을 반복하기 위해 y/n을 묻고 n인 경우 종료된다.*/

import java.util.Random;
import java.util.Scanner;

public class OpenChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int su=(int)Math.round(Math.random()*99);

        System.out.println("수를 결정 하였습니다. 맞추어 보세요");
        System.out.println("0-99");

        while(true)
        {
            int a=sc.nextInt(); //사용자가 입력
            if(su>a)
            {
                System.out.println("더 높게");
            }
            else if(su<a)
            {
                System.out.println("더 낮게");
            }
            else {
                System.out.println("맞았습니다.");
                System.out.print("다시하시겠습니까?(y/n)");
                String again=sc.next();
                if(again.equals("y"))
                {
                    su=(int)Math.round(Math.random()*99);
                    System.out.println(su);
                    System.out.println("수를 결정 하였습니다. 맞추어 보세요");
                }
                else if(again.equals("n")) {
                    break;
                }
                else {
                    System.out.println("잘못입력하셨습니다.");
                    break;

                }
            }

        }
    }
}
