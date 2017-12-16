package sevice;

import function.Function;
import function.FunctionOne;
import function.FunctionTwo;

import java.util.logging.Logger;

public class Service {

    Function function = new FunctionOne();

    public double getValue(double a, double b, double eq) {
        double mid = (a + b) / 2;
        while (Math.abs(function.fun(mid)) - eq > 0) {
            mid = (a + b) / 2;
            double value = function.fun(mid);
            if (function.fun(mid) - eq >= 0) {
                b = mid;
            } else {
                a = mid;
            }
        }
        return mid;
    }

    public double serviceOne(double a, double b, double eq) {
        double c = 0;
        double al = function.fun(a);
        double bl = function.fun(b);
        double cl = 0;
        //这个是一个满足条件
        if (al * bl < 0) {
            while (Math.abs(a - b) >= eq) {
                c = (b + a) / 2;
                al = function.fun(a);
                cl = function.fun(c);
                if (al * cl < 0) {
                    b = c;
                } else {
                    a = c;
                }
            }
            return c;

        } else {

            //这个是一个不满足条件的。
            System.out.println("条件不满足，请重新输入");

            return 0;
        }


    }

    public double serviceTwo(double a, double b, double eq, Function function) {


        double x0 = a;
        x0  = function.fun(a)*function.fun(b);
        if (x0>0){
        double x1 = 0;
        while (true) {

            x1 = function.fun(x0);
            if (Math.abs(x1 - x0) < eq) {
                break;
            }
            x0 = x1;
        }
        return x1;
    }else {
            System.out.println("存在输入错误");
            return  0;
        }
}

}

