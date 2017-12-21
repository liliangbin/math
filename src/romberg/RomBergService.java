package romberg;

public class RomBergService {
    double h, s1, c1, r1, s2, c2, r2, t1, t2, s;
    double a, b, eq;

    public static double f(double x) {

        double f1;
        if (x == 0) f1 = 1;
        else {
            f1 = Math.sin(x) / x;
        }
        return f1;

    }//函数

    //操作emmm
    public void romBergService(double a, double b, double eq) {
        this.a = a;//这个地方的是区间
        this.b = b;
        this.eq = eq;

        int i, k, n;
        h = (b - a) / 2.0;//为了得到一个double类型的数值
        t2 = (f(a) + f(b)) * h;  //t1；
        s2 = 0;
        c2 = 0;
        r2 = 0;
        n = 1;
        k = 0;
        do {
            t1 = t2;
            s1 = s2;
            c1 = c2;
            r1 = r2;
            s = 0.0;//满足条件的是double类型的数据
            for (i = 0; i <= n; i++) {
                s = s + f(a + (2 * i - 1) * h);
            }
            t2 = t1 / 2 + s * h;
            s2 = (4 * t2 - t1) / 3;
            c2 = (16 * s2 - s1) / 15;
            r2 = (64 * c2 - c1) / 63;
            n = n * 2;
            k = k + 1;
            h = h / 2;

        }
        while (Math.abs(r2 - r1) >= eq);
        System.out.printf("R(%d) = %f ", k, r2);
    }

}
