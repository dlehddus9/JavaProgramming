//4x4 의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하여 정수 16개를 배열에 저장하고,2차원 배여을 화면에 출력하라.
//힌트 1에서 10까지 범위의 정수를랜덤하게 생성할 때는 다음 코드를 이용하라.
// int i= (int)Math.round(Math.random()*9 + 1);

public class Ex_07 {
    public static void main(String[] args) {

        int array[][]=new int[4][4];
        for(int i=0 ; i<array.length; i++)
        {
            for(int j=0; j<array.length;j++)
            {
                array[i][j]=(int)Math.round(Math.random()*9 +1);
            }
        }
        for(int i=0 ; i<array[i].length ; i++)
        {
            for(int j=0; j<array.length ; j++)
            {
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
    }
}
