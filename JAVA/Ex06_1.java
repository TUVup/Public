public class Ex06_1 {
    public static void main(String[] args){
        
        int[] x = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87, 55, 60, 99, 63, 80};
        int Max = x[0], sum = 0, Min = x[0];

        for(int i = 0; i < x.length; i++)
        {
            if(x[i] > Max) Max = x[i];
            if(x[i] < Min) Min = x[i];
            sum += x[i];
        }
        System.out.println("max = " + Max);
        System.out.println("min = " + Min);
        System.out.println("sum = " + sum);

        double m = (double)sum/ x.length;
        double v = 0.0;
        for(int i = 0; i<x.length; i++)
            v += Math.pow( (x[i]-m), 2);
        v /= x.length;
        double s = Math.sqrt(v);
        System.out.printf("m = %.2f\n" ,m);
        System.out.printf("v = %.2f\n" , v);
        System.out.printf("s = %.2f\n" , s);
    }
}
