package 과제.level2;

public class Level2_3 {
    public static void main(String[] args) {
        int 국어=89;
        int 영어=49;
        int 수학=72;
        int 합계=국어+영어+수학;
        double 평균=합계/3;
        boolean three=true;
        boolean eight=true;
        String 홀짝="홀수";
        String 결과="합격";

        if(합계%3!=0){three=false;}
        if(합계%8!=0){eight=false;}
        if(합계%2==0){홀짝="짝수";}
        if(평균<65){결과="탈락";}

        System.out.printf("국어   영어   수학   합계   평균   3배수   8배수   홀짝   결과\n" +
                            "%d     %d    %d    %d   %.1f   %b   %b  %s   %s",국어,영어,수학,합계,평균,three,eight,홀짝,결과);

    }
}
