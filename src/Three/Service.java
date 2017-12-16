package Three;

import chace.Test;

public class Service {

    Test test = new Test();
    double x[] = {0.25, 0.30, 0.39, 0.45, 0.53};
    double y[] = {0.5, 0.5477, 0.6245, 0.6708, 0.7280};
    double a[] = {0, 2, 2, 2, 2,2};
    double b[];
    double c[];
    double d[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    double h[] = {0, 0, 0, 0, 0, 0, 0, 0};//xi -xi-1

    double hr[] = {0, 0, 0, 0, 0, 0, 0, 0};//c
    double u[] = {0, 0, 0, 0, 0, 0, 0, 0, 0,};//b
    double y1 = 1;
    double yn = 0.6868;

    public double[] doTest() {


        test.setA(a);
        double n = x.length - 1;
        hr[0] = 1;
        u[(int) n] = 1;

        for (int i = 1; i < n + 1; i++) {

            h[i] = x[i] - x[i - 1];
            // System.out.println("hi的值是"+h[i]);
        }
//从1开始的循环 。

        double f = (y[1] - y[0]) / (x[1] - x[0]) - y1;
        d[0] = 6 * f / h[1];
        d[(int) n] = 6 / h[(int) n] * (yn - (y[(int) n] - y[(int) n - 1]) / (x[(int) n] - x[(int) n - 1]));

        for (int j = 1; j < n; j++) {
            hr[j] = h[j + 1] / (h[j] + h[j + 1]);
            u[j] = 1 - hr[j];
            d[j] = 6 / (h[j] + h[j + 1]) * ((y[j + 1] - y[j]) / h[j + 1] - (y[j] - y[j - 1]) / h[j]);
        }
        double[] d1 = test.getD();
        for (int m = 0; m < n + 1; m++) {

            d1[m + 1] = d[m];

            System.out.println(d[m] +"d的值");
        }
        test.setD(d1);
        double[] h1 = test.getC();
        for (int t = 0; t < n; t++) {

            h1[t + 1] = hr[t];
            System.out.println(hr[t]+"c的值");
        }
        test.setC(h1);
        double[] u1 = test.getB();
        for (int g = 1; g < n +1; g++) {
            u1[g + 1] = u[g];
            System.out.println("b的值" +u[g]);
        }
        test.setB(u1);
        b = test.in();
        System.out.println("即将输出结果");
        return b;
    }


}
