package moreandmore;

import guass.Service;

public class MoreService2 {
    int n, m;
    double a[][] = {

            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0}

    },
            b[] = {0, 0, 0},
            z[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    double x[] = {1.36, 1.49, 1.73, 1.81, 1.95, 2.16, 2.28, 4.48};
    double y[] = {14.094, 15.069, 16.844, 17.378, 18.435, 19.949, 20.963, 22.495};
    int i, j, k, ip;
    double s;


    public double[] ServiceOne(int n, int m) {

        this.n = n;
        this.m = m;
        z[0] = n;
        for (i = 0; i < 2 * m - 1; i++) {

            s = 0;
            for (k = 0; k <= n - 1; k++) {
                s = s + Math.pow(x[k], (i + 1));
            }
            z[i + 1] = s;
        }

        for (i = 0; i <= m; i++) {
            s = 0;
            for (k = 0; k < n; k++) {

                s = s + y[k] * Math.pow(x[k], i);

            }

            b[i] = s;

        }

        for (i = 0; i <= m; i++) {

            for (j = 0; j <= m; j++) {
                a[i][j] = z[i + j];
            }
        }
        Service service = new Service();


        service.setA(a);
        service.setB(b);
        double[] total = service.name();

        return total;

    }

}
