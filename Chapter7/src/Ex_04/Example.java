// 다음 프로그램은 ArrayList에 20개의 임의의 실수를 삽입하고 모든 실수를 출력하는
//프로그램이다. 모든 실수를 출력하는 부분을 Iterator를 이용하여 수정하라

package Ex_04;

import java.util.ArrayList;
import java.util.Iterator;

public class Example {
    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList<Double>();
        for(int i=0 ; i<20 ; i++)
        {
            double d=Math.random()*100;//0.0~100.0 사이의 랜덤한 실수
            a.add(d);
        }

        Iterator<Double> iterator = a.iterator();
        while(iterator.hasNext()){
            Double d=iterator.next();
            System.out.println(d);
        }

    }
}
