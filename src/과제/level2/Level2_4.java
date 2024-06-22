package 과제.level2;

import java.util.Random;
import java.util.Scanner;

public class Level2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("가위 바위 보 선택 : "); String player = scan.next();
        int random = new Random().nextInt(3);

        String com;
        if(random==0){com="가위";}
        else if(random==1){com="바위";}
        else{com="보";}

        if(player.equals("가위")){
            if(com.equals("가위")){
                System.out.println("comran) 가위");
                System.out.println("result) 무승부");
                return;
            }
            if(com.equals("바위")){
                System.out.println("comran) 바위");
                System.out.println("result) com 승리");
                return;
            }
            if(com.equals("보")){
                System.out.println("comran) 보");
                System.out.println("result) player 승리");
                return;
            }

        }

        if(player.equals("바위")){
            if(com.equals("가위")){
                System.out.println("comran) 가위");
                System.out.println("result) player 승리");
                return;
            }
            if(com.equals("바위")){
                System.out.println("comran) 바위");
                System.out.println("result) 무승부");
                return;
            }
            if(com.equals("보")){
                System.out.println("comran) 보");
                System.out.println("result) com 승리");
                return;
            }

        }

        if(player.equals("보")){
            if(com.equals("가위")){
                System.out.println("comran) 가위");
                System.out.println("result) com 승리");
                return;
            }
            if(com.equals("바위")){
                System.out.println("comran) 바위");
                System.out.println("result) player 승리");
                return;
            }
            if(com.equals("보")){
                System.out.println("comran) 보");
                System.out.println("result) 무승부");
                return;
            }

        }

    }
}
