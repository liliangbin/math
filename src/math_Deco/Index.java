package math_Deco;

public class Index {
    public static void main(String arg[]) {


        double a[][] = {{7, 8, 11}, {5, 1, -3}, {1, 2, 3}};
        double b[] = {-3, -4, 1};
        double eq;

        int ip = 0;
        eq = 0.0001;
        Service service = new Service(a, b, eq);
     /*   try {
            b = service.fun();
        }catch (Exception e){
            e.printStackTrace();
        }*/
        b = service.fun();
        System.out.println(b[0] + "\n" + b[1] + "\n" + b[2]);

    }
}

