//Scanner 클래스를 사용하여 10개의 실수 값을 키보드로부터 읽어 백터에 저장한 후  벡터를 검색하여 가장 큰
// 수를출력하는 프로그램을 작성하라.

package Ex_01;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();

        for(int i=0; i<10 ; i++)
        {
            System.out.println("숫자 "+(i+1)+" 번 째를 입력하세요");
            int k=sc.nextInt();
            v.add(k);
        }
        int temp=v.get(0);
        for(int i=0 ; i<10 ; i++) {
            if(temp<v.get(i))
            {
                temp=v.get(i);
            }
        }
        System.out.println("가장 큰수는"+temp);

    }
}
