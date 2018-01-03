package Ex06;

import java.util.Scanner;
//boolean books1[] = new boolean[10];
public class Book {
    int count=0;

    String books[] ;
    String booka[] ;
    String bookb[] ;
    boolean books1[];
    boolean booka1[];
    boolean bookb1[];
    Scanner sc = new Scanner(System.in);
    public  Book() {
        books1 = new boolean[10];
        booka1 = new boolean[10];
        bookb1 = new boolean[10];

        books = new String[10];
        booka = new String[10];
        bookb = new String[10];
        for(int i=0 ; i<10 ; i++)
        {
            books[i]="___";
            booka[i]="___";
            bookb[i]="___";
        }


    }

    public void Check() {
        System.out.println("좌석구분 S(1), A(2), B(3)");
        int num=sc.nextInt();
        switch (num)
        {
            case 1:BookS();
                break;
            case 2:BookA();
                break;
            case 3:BookB();
                break;
        }

    }
    public void BookS() {
        System.out.println("이름>>");
        String name=sc.next();
        System.out.println("번호>>");
        int num=sc.nextInt();
        if(books1[num-1]==false) {
            books[num - 1] = name;
            books1[num-1]=true;
        }
        else {
            System.out.println("이미 있는 좌석입니다.");
        }
    }
    public void BookA() {
        System.out.println("이름>>");
        String name=sc.next();
        System.out.println("번호>>");
        int num=sc.nextInt();
        if(booka1[num-1]==false) {
            booka[num - 1] = name;
            booka1[num-1]=true;
        }
        else {
            System.out.println("이미 있는 좌석입니다.");
        }


    }
    public void BookB() {
        System.out.println("이름>>");
        String name=sc.next();
        System.out.println("번호>>");
        int num=sc.nextInt();
        if(bookb1[num-1]==false) {
            bookb[num - 1] = name;
            bookb1[num-1]=true;
        }
        else {
            System.out.println("이미 있는 좌석입니다.");
        }

    }
    public void Show() {
        System.out.print("S>>");
        for(int i=0; i<10 ; i++)
        {System.out.print(books[i]+" ");

        }
        System.out.println();

        System.out.print("A>>");
        for(int i=0; i<10 ; i++)
        {System.out.print(booka[i]+" ");

        }
        System.out.println();

        System.out.print("B>>");
        for(int i=0; i<10 ; i++)
        {System.out.print(bookb[i]+" ");

        }
        System.out.println();
    }

    public void Cancle() {
        System.out.println("좌석구분 S(1), A(2), B(3)");
        int num=sc.nextInt();
        switch (num){
            case 1:Books1();
                break;
            case 2:Booka1();
                break;
            case 3:Bookb1();
                break;

        }

    }
    public void Books1() {
        for(int i=0; i<10 ; i++)
        {
            System.out.print(books[i]+" ");
        }
        System.out.println();
        System.out.println("이름>>");
        String name=sc.next();

        for(int i=0 ; i<10 ; i++)
        {
            if(books[i].equals(name)){
                books[i]="___";
                books1[i]=false;
                count++;
            }

        }
        if(count==0)
        {
            System.out.println("예약된사람이아닙니다.");
        }
    }
    public void Booka1() {
        for(int i=0; i<10 ; i++)
        {
            System.out.print(booka[i]+" ");
        }
        System.out.println();
        System.out.println("이름>>");
        String name=sc.next();

        for(int i=0 ; i<10 ; i++)
        {
            if(booka[i].equals(name)){
                booka[i]="___";
                booka1[i]=false;
                count++;
            }

        }
        if(count==0)
        {
            System.out.println("예약된사람이아닙니다.");
        }

    }
    public void Bookb1() {
        for(int i=0; i<10 ; i++)
        {
            System.out.print(bookb[i]+" ");
        }
        System.out.println();
        System.out.println("이름>>");
        String name=sc.next();

        for(int i=0 ; i<10 ; i++)
        {
            if(bookb[i].equals(name)){
                bookb[i]="___";
                bookb1[i]=false;
                count++;
            }

        }
        if(count==0)
        {
            System.out.println("예약된사람이아닙니다.");
        }

    }


}
