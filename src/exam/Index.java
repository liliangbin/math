package exam;
/*
* 大物实验*/
public class Index {
    final static double pi = 3.141592;

    double p = 981;
    final static double g = 9.80;
    double n = 1.83E-5;
    double P = 0.101E6;
    double b = 8.23E-3;
    double d = 5E-3;
    double l = 0.002;

    double r;//半径
    double q;//电荷量
    double U = 176;//电压
    double tg[] = {19.9,18.9, 19.3, 19.5, 19.4, 19.6};//时间
    double name;
    double t = 1;

    double fun() {

        double tmp = 0;
        for (int i = 0; i < tg.length; i++) {

            tmp = tmp + tg[i];
        }
        t = tmp / tg.length;
        System.out.println("总体消耗的时间是"+tmp+"\n"+"平均的时间是"+t);
        double u = l / t;//速度
        System.out.println("下落的速度是"+u);
        r = Math.sqrt(9 * n * u / (2 * p * g));

        q = (18 * pi / (Math.sqrt(2 * p * g))) * d / U;
        name = n * l / (t * (1 + b / (P * r)));
        name = name * Math.sqrt(name);
        q = q * name;
        return q;

    }

    public static void main(String arg[]) {

        System.out.println(2.0 / 100000);
    }

}
