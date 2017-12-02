//하나의 학생 정보는 Student 클래스로 표현한다. student 클래스에는
// 이름,학과,학번,학점 평균을 나타내는 필드가 있다. 키보드로 학생 정보를 5개 입력받아 ArrayList<Stduent>
//에 저장한 후에 ArrayList<Student>의 모든 학생접오를 출력하는 프로그램을 작성하라



package Ex_05;

public class Student {
    private String name; //이름
    private String dep; //학과
    private int num; //학번
    private int mean; //학점 평균

    public Student(String name,String dep, int num, int mean) {
        this.name=name;
        this.dep=dep;
        this.num=num;
        this.mean=mean;

    }


}
