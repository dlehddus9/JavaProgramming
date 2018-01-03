import java.util.Scanner;

public class WordGameApp {
    public static void main(String[] args) {
        int inwon;
        String word="아버지";
        Scanner sc = new Scanner(System.in);
        System.out.println("게임에 참가하는 인원은 몇명입니까?");
        inwon=sc.nextInt(); //게임에 참여하는인원수

        Player player[] = new Player[inwon]; //Player 에 대한 레퍼런스생성
        for(int i=0; i<inwon ; i++)
        {
            player[i]= new Player(); //실제 배열들을 생성
            System.out.println("참가자의 이름을 입력하세요");
            player[i].setName(sc.next());
        }


        System.out.println("시작하는 단어는 아버지입니다");
        while(true) {
            for (int i = 0; i < inwon; i++) {
                System.out.print(player[i].getName());
                System.out.println(">>");
                player[i].sayword(sc.next()); //단어입력
                player[i].succeed(word);
                word=player[i].getWord();


            }
        }
    }
}
