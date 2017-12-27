package forecast;

public class ForecastService {


    double a, b, h, eq, y;

    final static double f(double x, double y) {


        return x*x;
    }

    final static double f2(double x, double y) {


        return x*x*x/3;
    }

    public ForecastService(double a, double b, double h, double eq, double y) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.eq = eq;
        this.y = y;
    }

    public void doForeat() {

        double tmp;
        double tim = 0;
        for (double i = a; i < b; i += h) {

            tmp = y + f(i, y) * h;
            y = y + h / 2 * (f(i, y) + f(i + h, tmp));
            tim =f2(i+h,y);
            System.out.println("xdezhi="+i+"   "+"y[0]="+tmp+"   "+"y[1]= "+y +"   真值是=" +tim);

        }


    }

}
