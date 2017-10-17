package problem6;

import java.util.Scanner;

public class Opera {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int number;
    String s[]=new String[10];
    String a[]=new String [10];
    String b[]=new String[10];
    boolean sk[] = new boolean[10];
    boolean ak[] = new boolean[10];
    boolean bk[] = new boolean[10];

    public void Book() {
        System.out.println("좌석구분 s(1),a(2),b(3)");
        int k=0;
        k=sc.nextInt();
        if(k==1) {

            System.out.println("이름");
            name = sc.next();
            System.out.println("번호");
            number = sc.nextInt();
            if (sk[number - 1] == true) {
                System.out.println("이미 자리가 있단다.");
            } else {
                sk[number - 1] = true;
                s[number - 1] = name;
            }
        }
        if(k==2)
        {

            System.out.println("이름");
            name = sc.next();
            System.out.println("번호");
            number = sc.nextInt();
            if (ak[number - 1] == true) {
                System.out.println("이미 자리가 있단다.");
            } else {
                ak[number - 1] = true;
                a[number - 1] = name;
            }

        }

        if(k==3)
        {
            System.out.println("이름");
            name = sc.next();
            System.out.println("번호");
            number = sc.nextInt();
            if (bk[number - 1] == true) {
                System.out.println("이미 자리가 있단다.");
            } else {
                bk[number - 1] = true;
                b[number - 1] = name;
            }

        }

    }
    public void View() {
        System.out.print("S석 ");
        for(int i=0; i<s.length; i++)
        {
            if(s[i]==null)
            {
                s[i]="_____";
            }
            System.out.print(s[i]+" ");

        }
        System.out.println();

        System.out.print("A석 ");
        for(int i=0; i<s.length; i++)
        {
            if(a[i]==null)
            {
                a[i]="_____";
            }
            System.out.print(a[i]+" ");

        }
        System.out.println();
        System.out.print("B석");
        for(int i=0; i<s.length; i++)
        {
            if(b[i]==null)
            {
                b[i]="_____";
            }
            System.out.print(b[i]+" ");

        }
        System.out.println();

    }
    public void Cancle() {
        System.out.println("좌석 구분 S(1),A(2),B(3)");
        int k=sc.nextInt();
        if(k==1) {
            for (int i = 0; i < s.length; i++) {
                if (s[i] == null) {
                    s[i] = "_____";
                }
                System.out.print(s[i] + " ");

            }
            System.out.println();


            System.out.println("이름");
            name = sc.next();
            for (int i = 0; i < s.length; i++) {
                if (s[i].equals(name)) {
                    s[i] = "_____";
                    sk[i] = false;
                }

            }
        }
        if(k==2)
        {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == null) {
                    a[i] = "_____";
                }
                System.out.print(a[i] + " ");

            }
            System.out.println();


            System.out.println("이름");
            name = sc.next();
            for (int i = 0; i < a.length; i++) {
                if (a[i].equals(name)) {
                    a[i] = "_____";
                    ak[i] = false;
                }

            }
        }
        if(k==3)
        {
            for (int i = 0; i < b.length; i++) {
                if (b[i] == null) {
                    b[i] = "_____";
                }
                System.out.print(b[i] + " ");

            }
            System.out.println();


            System.out.println("이름");
            name = sc.next();
            for (int i = 0; i < b.length; i++) {
                if (b[i].equals(name)) {
                    b[i] = "_____";
                    bk[i] = false;
                }

            }
        }


    }
}
