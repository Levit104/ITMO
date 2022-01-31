import static java.lang.Math.*;

public class LabFinal {
    public static void main(String[] args) {
        byte i, j, n;
        n = 0;

        short[] a1 = new short[13];
        for (i = 1; i <= 25; i++) {
            if (i % 2 != 0) a1[n] = i;
            else n++;
        }

        float[] x = new float[17];
        for (i = 0; i < 17; i++) x[i] = (float) (random() * 19) - 5;

        double[][] a2 = new double[13][17];
        for (i = 0; i < 13; i ++) {
            for (j = 0; j < 17; j++) {
                switch (a1[i]) {
                    case 25:
                        a2[i][j] = 2.0/3 * (pow(atan((x[j] + 4.5)/19), 1.0/3) + 1);
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 13:
                    case 17:
                    case 23:
                        a2[i][j] = pow(E, pow(x[j], 1.0/9));
                        break;
                    default:
                        a2[i][j] = pow(sin(PI/(0.5 - pow(E, x[j]))), 1.0/3);
                }
                System.out.printf("%.3f ", a2[i][j]);
            }
            System.out.println();
        }
    }
}