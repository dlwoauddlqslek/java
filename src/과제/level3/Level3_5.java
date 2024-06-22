package 과제.level3;

import java.util.Random;

public class Level3_5 {
    public static void main(String[] args) {
        String authNumber="";
        for (int i=0; i<6; i++){
            int random = new Random().nextInt(10);
            authNumber+=random;
        }
        System.out.println("본인확인 인증번호 : "+authNumber);
    }
}
