package OpenChallenge;

import java.util.Scanner;


public class Player {
    public static boolean succeed(String word, String postword)
    {
        int lastIndex = word.length()-1;
        char lastChar = word.charAt(lastIndex); //마지막 글자
        char firstChar = postword.charAt(0);
        if(lastChar==firstChar)
        {
            return true;
        }
        return false;
    }

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
