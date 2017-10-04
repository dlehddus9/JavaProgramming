//키보드로 입력받은 주민번호에서 문자열을 '-'으로 분리하여 주민번호 앞자리만 출력하는 프로그램을 작성하라. 구분 문자를 설정할 때에는 Scanner 클래스의 useDelimiter() 메소드를 사용하라.
//힌트 Scanner a= new Scanner(System.in).useDelimiter("\\s:-");

import java.util.Scanner;

public class EX_02 {
    public static void main(String[] args) {
        System.out.println("주민번호를 입력하세요~");
        Scanner sc = new Scanner(System.in).useDelimiter("-");//useDelimiter 을 사용해서 뒤에거를 전부다 날릴수 있다.

        int a = sc.nextInt();
        System.out.println("입력하신 주민번호는"+a+"입니다.");


    }
}
