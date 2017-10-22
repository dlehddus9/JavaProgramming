package OpenChallenge;

import java.util.Scanner;

public class Player {
    private String inputName; //사용자들의 이름
    private String inputWord;
    Scanner sc = new Scanner(System.in);

    public String sayWord() {   // 단어 입력받기
        System.out.print(inputName+">>>");
        inputWord=sc.next();
        System.out.println();
        return inputWord;
    }

    public void setInputName(String inputName) { //사용자들의 이름입력받는 setter
        this.inputName =inputName;
    }
    String getInputName() {
        return inputName;
    }


}
