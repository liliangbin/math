package rrvert;

public class RevetService {
    double a, b;
    double n;

    public static  double f(double x){

        double f1 ;
        if(x==0) f1 =1;
        else {
            f1 = Math.sin(x)/x;
        }
        return f1;

    }
//代表这是一个函数
    //操作
    public void doRevet(double a, double b, double n) {

        this.a = a;
        this.b = b;
        this.n = n;//分为几等分
        double h, s, x;
        int i;
        h = (b - a) / n; //步长
        s = f(a) - f(b);//最开始的时候f(a) -f(b)
        x = a;//初始化部长


        for (i = 1; i <= n; i++) {


            x = x + h / 2;//每次都是前进半个部长
            s = s + 4 * f(x);//前面的那个
            x = x + h/2;
            s = s+2*f(x);//后面的整步


        }
        s = s*h/6;
        System.out.printf("the integral of f(x) %f ",s);
    }
}
