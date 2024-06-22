package 과제.level3;

import java.util.Scanner;

public class Level3_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total=0;
        while(true){
            System.out.print("input : ");
            total+=scan.nextInt();

            if(total<0){break;}

            String square="";
            for (int i=1; i<=total; i++){
                square+="■";
            }
            System.out.println(square);

            }

        }
    }

