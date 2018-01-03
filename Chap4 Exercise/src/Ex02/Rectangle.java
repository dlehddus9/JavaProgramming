package Ex02;

public class Rectangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2; //사각형을 구성하는 두점의 좌표

    public  Rectangle() {
        x1=0;
        y1=0;
        x2=0;
        y2=0;
    }
    public  Rectangle(int x1,int y1,int x2,int y2)
    {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }

    public void set(int x1,int y1, int x2 , int y2) {
        // x1,y1,x2,y2 좌표설정
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }

    public int square() {
        int width=x2-x1;
        int height=y2-y1;
        int square=width*height;
        if(square<0)
        {
            return -square;

        }
        return square;
    }

    public void show() {
        System.out.println("x1의 좌표"+x1+" y1의 좌표"+y1);
        System.out.println("x2의 좌표"+x2+" y2의 좌표"+y2);
        System.out.println("넓이는: "+square());
    }

    boolean equals(Rectangle r)
    {
        if(x2-x1==r.x2-r.x1){
            if(y2-y1==r.y2-r.y1)
            {
                return true;
            }
        }
        return false;
    }
}
