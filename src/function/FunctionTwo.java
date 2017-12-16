package function;

public class FunctionTwo extends Function {

    double fun = 0;

    @Override
    public double fun(double x) {

        fun = x - (x * x * x - 2 * x * x - 4 * x - 7) / (3 * x * x - 4 * x - 4);
        return fun;
    }
}
