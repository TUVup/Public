public class Ex07_1 {
    public static void main(String[] args) {
        int[][] input = { { 1, 0, 1, 0, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 0, 1, 1 }, { 0, 1, 0, 0, 0, 0, 0, 0 },
                { 1, 1, 1, 1, 0, 0, 0, 0 }, { 1, 0, 1, 1, 1, 0, 0, 1 }, { 0, 0, 0, 0, 0, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 1, 1, 1, 1, 0, 0, 0 } };
        int[] paratty_S = new int[9];//세로 페러티
        int[] paratty_B = new int[9];//가로 페러티
        int i, j;
        double val=0;
        
        paratty_S = P_Side(input, paratty_S);//세로 페러티 계산
        paratty_B = P_bottom(input, paratty_B);//가로 페러티 계산
        for(i  = 0; i < input.length; i++){//바이너리 + 세로 페러티 출력 
            for(j = 0; j < input[i].length; j++){
                System.out.printf("%d ", input[i][j]);
            }
            System.out.printf("%d\n", paratty_S[i]);
        }
        for(i = 0; i < paratty_S.length; i++){//가로 페러티 마지막 인자 계산
            if(paratty_S[i] == 1) val++;
        }
        if(val%2 == 0) paratty_B[8] = 0;
        else paratty_B[8] = 1;
        for(i = 0; i< paratty_B.length; i++){//마지막 출력
            System.out.printf("%d ", paratty_B[i]);
        }
        System.out.printf("\n");
    }
    static int[] P_Side(int[][] input, int[] psout){//세로 페러티 함수
        double val=0;
        int i, j;
        for(i=0; i < input.length; i++){
            for(j = 0; j < input[i].length; j++){
                if(input[i][j] == 1) val+=1;
            }
            if(val%2 == 0) psout[i] = 0;
            else psout[i] = 1;
            val = 0;
        }
        return psout;
    }
    static int[] P_bottom(int[][] input, int[] pbout){//가로 페러티 함수
        double val=0;
        int i, j;
        for(i=0; i < input[0].length; i++){
            for(j = 0; j < input.length; j++){
                if(input[j][i] == 1) val+=1;
            }
            if(val%2 == 0) pbout[i] = 0;
            else pbout[i] = 1;
            val = 0;
        }
        return pbout;
    }
}