package guass;
/**/
public class Service {

    double a[][] = {{8, -3, 2}, {4, 11, -1}, {6, 3, 12}}, x[] = {0, 0, 0}, b[] = {20, 33, 36};
    double eq = 0.0002, N = 200;

    public double[][] getA() {
        return a;
    }

    public void setA(double[][] a) {
        this.a = a;
    }

    public double[] getB() {
        return b;
    }

    public void setB(double[] b) {
        this.b = b;
    }

    double k = 1, emax, s;

    double[] lalal() {

        while (true) {
            emax = 0;
            for (int i = 0; i < x.length; i++) {
                s = b[i];
                for (int j = 0; j < x.length; j++) {
                    s = s + a[i][j] * x[j];
                }
                if (Math.abs(s - x[i]) > emax) {
                    emax = Math.abs(s - x[i]);
                }
                x[i] = s;
            }
            k = k + 1;
            if ((emax < eq) && k >= N) {
                System.out.println("发撒");
                break;
            }

        }
        return x;


    }

    public  double[] name() {

        while (true) {

            for (int i = 0; i < x.length; i++) {

                s = b[i];

                for (int j = 0; j < x.length; j++) {
                    if (j != i) {
                        s = s - x[j] * a[i][j];
                    }
                }

                s = s / a[i][i];

                if (Math.abs(s - x[i]) < eq) {

                    System.out.println("最大");
                    return x;

                }
                x [i] =s;

            }

            k = k + 1;
            if (k >N) {

                System.out.println("不能解决");
                break;
            }

        }
        return x;
    }
}