package moreandmore;

import guass.Service;

public class MoreService {

    double x[] = {1.36, 1.49, 1.73, 1.81, 1.95, 2.16, 2.28, 4.48};
    double y[] = {14.094, 15.069, 16.844, 17.378, 19.949, 22.495};
    double a[];
    double Ex[];
    double Ey[];

    int m = a.length - 1;

    public void doTest() {


        for (int i = 1; i < 2 * m + 1; i++) {
            double sum = 1;
//几次阶数
            for (int j = 0; j < x.length; j++) {
//x的值是多少
                for (int z = 0; z < i; z++) {
                    sum = sum * x[j];
                }
            }
            Ex[i] = sum;
        }

        for (int i = 0; i < a.length; i++) {
            double sum = 1;
            for (int j = 0; j < y.length; j++) {
                for (int z = 0; z < i; z++) {
                    sum = sum * x[j];
                }
                sum = sum * y[j];

            }
            Ey[i] = sum;
        }

        Service service = new Service();
        double[][] ab = service.getA();
        for (int i = 0; i < a.length; i++) {

            for (int j = i; j < a.length + i; j++) {

                ab[i][j] = 2;
            }
        }

    }

}
