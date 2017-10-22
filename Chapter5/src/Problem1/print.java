/*1.다음 그림과 같은 상속 구조를 갖는 클래스를 설계하라. 모든 프린터는 모델명,
        제조사,인터페이스 종류(USB 또는 병렬 인터페이스), 인쇄 매수, 인쇄 종이 잔량을
        나타내는 정보를 가지며 print() 라는 메소드를 갖는다. 잉크젯 프린터는 잉크 잔량이라
        는 추가 정보를 가지며 레이저 프린터는 토너 잔량이라는 추가 정보를 가진다.
        print() 메소드는 각 프린터 타입에 맞게 구현한다. 편의상 print() 메소드를 한 번
        호출할 때 마다 인쇄용지 1매를 사용하는것으로한다. 이러한 클래스를 설계하고 적
        절한 필드, 생성자, 메소드를 작성하고, 실행 프로그램을 작성하여 동작을 확인하라*/
package Problem1;

public class print {

        private String model; //모델명
        private String name; //제조사
        private String type; //인터페이스 종류
        private String primtnum; //인쇄 매수
        private String printremain; //인쇄 종이 잔량
        print() {
            // 오버라이딩 할꺼임.
        }

}
