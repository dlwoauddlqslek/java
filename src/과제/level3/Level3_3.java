package 과제.level3;

public class Level3_3 {
    public static void main(String[] args) {
        int july1 = 3532100;
        int july2 = 9123700;
        int july3 = 5183400;
        int july4 = 11738700;
        String square1="";
        String square2="";
        String square3="";
        String square4="";
        for(int i=1; i<=july1/1000000; i++){
            square1+="■";
        }
        for(int i=1; i<=july2/1000000; i++){
            square2+="■";
        }
        for(int i=1; i<=july3/1000000; i++){
            square3+="■";
        }
        for(int i=1; i<=july4/1000000; i++){
            square4+="■";
        }

        System.out.println("--------7월 매출액--------");
        System.out.printf("1주차: %s%d만원\n",square1,july1/10000);
        System.out.printf("2주차: %s%d만원\n",square2,july2/10000);
        System.out.printf("3주차: %s%d만원\n",square3,july3/10000);
        System.out.printf("4주차: %s%d만원",square4,july4/10000);
    }
}
