/*
n명이 참가하는 끝말잇기 게임을 프로그램으로 만들어보자. 여러개의 객체와 배열을
        사용하는 연습을 위한것이다. 처음 단어는 아버지 이다 n명의 참가즐은 순서대로 자신의 단어를 입력하면 된다.
        끝말잇기에서 끝말이 틀린 경우 게임을 끝내고 게임에서 진 참가를 화면에 출력한다.
        프로그램에서는 시간 지연을 구현하지 않아도 된다. 그렇지만 참가자들이 스스로 시간을 재어보는 것도 좋겠다.
        이클렙이서는 프로그램을 실행하면 한글 입력이 제대로 되지 않는 문제점이 있음을 꼭 기억하라.
        아마도 한글 입력을 원활히 모하는 버그인 듯하다. 그래서 저자도 아래와 같이 명령창에서
        프로그램을 실행하였다.
        힌트
        1.WordGameApp,Player 의 두클래스를 작성하는것을 추천한다. Player 클래스는 게임 참가자의 이름 필드와 사용자로부터
        단어를 입력받는 sayWord() 메소드,끝말잇기에 성공하였는지를 판별하고 게임을 계속하는지를 판별하는 succeed()
        메소드를 두면 좋겠다.
        2.WordGameApp 클래스는 main() 메소드를 가지고 참가자의 수를 입력받아 Plaer[] 배열을 생성한다.
        3.String 문자열의 마지막 문자와 첫 번째 문자는 다음과 같이 알아 낼 수 있다.
        String word ="아버지";
        int lastIndex=word.length()-1; //마지막 문자에 대한 인덱스
        char lastChar  = word.charAt(lastIndex); //마지막 문자
        char firstChar = word.charAt(0); //첫 번째 문자
*/


package OpenChallenge;
import java.util.Scanner;

import static OpenChallenge.Player.succeed;

public class WordGameApp {

    public static void main(String[] args) {

                 String word="아버지";
                 Scanner sc = new Scanner(System.in);

                System.out.println("게임에 참가하는 인원은 몇명입니까?");
                int num=sc.nextInt(); //게임인원 입력받음.
                Player player[] = new Player[num]; //Player 클래스 객체로 불러옴

                for(int i=0 ; i < num ; i++) {
                        player[i]=new Player();
                        System.out.println("참가자의 이름을 입력하세요.");
                        player[i].setInputName(sc.next());
                      }
                System.out.println("시작하는 단어는"+word+"입니다.");

                while(true)
                 {
                     for(int i=0; i<num ; i++) {
                         String postword=player[i].sayWord();
                         if(succeed(word,postword)){
                             word=postword;
                         }
                         else {
                             System.out.println(player[i].getInputName()+"님이 젔습니다.");
                         }
                     }

                 }


        }


}
