package chace;

public class Test {

    double a[] = {0, 2,2,2,2,2},
            b[] = {0, 0, 0.357,0.6,0.428,1},
            c[] = {0, 1,0.64,0.4,0.57},
            d[] = {0, 5.52, 4.31,3.26,2.42,2.11},
            x[] = {0, 0, 0, 0, 0, 0},
            y[] = {0, 0, 0, 0, 0, 0}, p[] = {0, 0, 0, 0, 0, 0}, q[] = {0, 0, 0, 0, 0, 0};

    public double[] getA() {
        return a;
    }

    public void setA(double[] a) {
        this.a = a;
    }

    public double[] getB() {
        return b;
    }

    public void setB(double[] b) {
        this.b = b;
    }

    public double[] getC() {
        return c;
    }

    public void setC(double[] c) {
        this.c = c;
    }

    public double[] getD() {
        return d;
    }

    public void setD(double[] d) {
        this.d = d;
    }

    public double[] getX() {
        return x;
    }

    public void setX(double[] x) {
        this.x = x;
    }

    public double[] getY() {
        return y;
    }

    public void setY(double[] y) {
        this.y = y;
    }

    public double[] getP() {
        return p;
    }

    public void setP(double[] p) {
        this.p = p;
    }

    public double[] getQ() {
        return q;
    }

    public void setQ(double[] q) {
        this.q = q;
    }

   public double[] in() {
        int n = a.length - 1;
        p[1] = a[1];
        q[1] = c[1] / p[1];
        for (int i = 2; i <= n; i++) {
            p[i] = a[i] - b[i] * q[i - 1];
            if (i < n) {
                q[i] = c[i] / p[i];
            }
        }

        y[1] = d[1] / p[1];
        for (int i = 2; i <= n; i++) {
            y[i] = (d[i] - b[i] * y[i - 1]) / p[i];
        }
        x[n] = y[n];
        for (int i = n - 1; i >= 1; --i) {
            x[i] = y[i] - q[i] * x[i + 1];
        }
        return x;


    }



}


