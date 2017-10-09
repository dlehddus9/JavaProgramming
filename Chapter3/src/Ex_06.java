import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//키보드로부터 10개 입력받아 배열에 저장하고 증가하는 순서로 정렬하고 이들을 출력하는 프로그램을 작성하라.
public class Ex_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];

        for(int i=0 ; i<array.length ; i++)
        {
            System.out.println((i+1)+"번째 수를 입력하세요");
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);

        for(int i=0 ; i<array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
