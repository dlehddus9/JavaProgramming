//키보드로부터 10개의 나라 이름과 인구를 입력받아 저장하고 , 다시 나라 이름을 키보드로부터 입력받아
// 인구를 출력하는 프로그램을 다음과 같이 해시맵을 이용하여  작성하라
// HashMap<String, Integer> nations = new HashMap<String,Integer>();
package Ex_03;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String , Integer> nations = new HashMap<String,Integer>();

        for(int i=0 ; i<10; i++)
        {
            System.out.println("나라 이름을 입력하세요");
            String name=sc.next();
            System.out.println("인구수를 입력하세요");
            int pop=sc.nextInt();
            nations.put(name,pop);
        }
        for(int i=0 ; i<nations.size() ; i++)
        {
            System.out.println("인구수를 알고싶은 나라 이름을 입력하세요");
            String name=sc.next();
            int pop=nations.get(name);
            System.out.println("인구는"+pop+"입니다.");
        }

    }
}
