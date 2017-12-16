package function;

public class FunctionThree extends Function {


    double total;

    @Override
    public double fun(double x) {
        total = x - (x * x - 8) / (2 * x);
        return total;
    }
}
