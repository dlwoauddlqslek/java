package 과제.level3;

import java.util.Scanner;

public class Level3_2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int i=1;
        while(true){
            String program="";
            System.out.print(i+"회 입력 : "); program=scan.next();

            if(program.equals("end")){
                System.out.printf("안내) 프로그램 종료 합니다.[총 %d회 입력]",i-1);
                break;
            }i++;

        }
    }
}
