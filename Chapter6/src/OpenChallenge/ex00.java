package OpenChallenge;

import java.io.IOException;
import java.io.InputStreamReader;
// 65~90 A~Z  97~122 a~z
public class ex00 {
    public static void main(String[] args) throws IOException {
        int a=0;
        int array[]=new int[26];
        InputStreamReader isr = new InputStreamReader(System.in);
        System.out.println("문장을 입력하세요");
        int c=isr.read();
        while(c!=-1) {




            for(int i=65; i<=90 ; i++){
                if(c==i){
                    array[i-65]++;
                }
            }
            for(int i=97; i<=122 ; i++){
                if(c==i){
                    array[i-97]++;
                }
            }
            c=isr.read();

            if(c=='\n'){
                break;
            }
        }
        for(int i=0 ; i<array.length ; i++)
        {
            char d=(char)(i+65);
            System.out.print( d);
            for(int j=0 ; j <array[i] ; j++) {
                System.out.print("-");
            }
            System.out.println();
        }

    }
}
