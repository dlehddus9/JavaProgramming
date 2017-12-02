//하나의 학생 정보는 Student 클래스로 표현한다. student 클래스에는
// 이름,학과,학번,학점 평균을 나타내는 필드가 있다. 키보드로 학생 정보를 5개 입력받아 ArrayList<Stduent>
//에 저장한 후에 ArrayList<Student>의 모든 학생접오를 출력하는 프로그램을 작성하라


package Ex_05;

import java.util.*;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> a = new ArrayList<Student>();
        System.out.println("이름을 입력하세요");
        String name=sc.next();
        System.out.println("학과를 입력하세요");
        String dep=sc.next();
        System.out.println("학번을 입력하세요");
        int num=sc.nextInt();
        System.out.println("학점평균을 입력하세요");
        int mean=sc.nextInt();
        a.add(new Student(name,dep,num,mean));

       /* Student s = a.get(0);
        System.out.println(s);*/




    }
}
