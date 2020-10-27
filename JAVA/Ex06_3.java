public class Ex06_3 {
    public static void main(String[] args) {
        int[] responses = { 1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6, 10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 7, 5, 6, 6, 5,
                6, 7, 5, 6, 4, 8, 6, 8, 10, 6 };
        int[] count = new int[10];
        int i = 0, j = 0;
        for (j = 0; j < count.length; j++) {
            for (i = 0; i < responses.length; i++) {
                if (j + 1 == responses[i])
                    count[j]++;
            }
        }
        System.out.printf("Rating\tFrequency\n");
        for (int k = 0; k < 10; k++)
            System.out.printf("%6d\t%9d\n", k + 1, count[k]);
    }
}
