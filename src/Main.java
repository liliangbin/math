import function.Function;
import function.FunctionFour;
import function.FunctionThree;
import function.FunctionTwo;
import sevice.Service;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double eq = scanner.nextDouble();

        Service service = new Service();
        /*
        *
        * 这里的是用的函数值和 eq  的比较
        *
        * */
        // System.out.println(service.getValue(a , b , eq));
        //常规做法
        // System.out.println(service.serviceOne(a, b, eq));
        //牛顿迭代公式
        System.out.println(service.serviceTwo(a, b, eq, new FunctionTwo()));

    }
}
