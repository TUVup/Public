import java.util.Random;

public class Ex09_2_300 {

    public static void graph_made(int[] score_count){//스코어-그래프 출력
        int a=100;
        for (int n : score_count) {
            if(a == 100){
                System.out.printf("%5d: ", a);
                a-=1;
            }
            else{
            System.out.printf("%02d-%02d: ", a, a-9);
            a = a - 10;
            }
            System.out.printf("%4d ", n);
            for (int i = 0; i < n; i++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Random randomNums = new Random();
        int[] score = new int[300];
        double avr = 0;
        int score_count[] = new int[11];

        System.out.print("score[]: ");// 스코어배열 출력
        for (int i = 0; i < 300; i++) {
            score[i] = 1 + randomNums.nextInt(100);
            System.out.printf("%d ", score[i]);
            avr += score[i];
        }
        System.out.printf("\n\n");

        System.out.printf("Avarage: %.2f\n\n", avr / 300);// 평균을 출력

        for (int i = 0; i < 300; i++) {// 점수별 인원수 체크
            if(score[i] == 100)
            score_count[0]++;
            else if(score[i] <=99 && score[i] >=90)
            score_count[1]++;
            else if(score[i] <=89 && score[i] >=80)
            score_count[2]++;
            else if(score[i] <=79 && score[i] >=70)
            score_count[3]++;
            else if(score[i] <=69 && score[i] >=60)
            score_count[4]++;
            else if(score[i] <=59 && score[i] >=50)
            score_count[5]++;
            else if(score[i] <=49 && score[i] >=40)
            score_count[6]++;
            else if(score[i] <=39 && score[i] >=30)
            score_count[7]++;
            else if(score[i] <=29 && score[i] >=20)
            score_count[8]++;
            else if(score[i] <=19 && score[i] >=10)
            score_count[9]++;
            else if(score[i] <=9 && score[i] >=0)
            score_count[10]++;
        }
        graph_made(score_count);//스코어-그래프 출력
    }
}
