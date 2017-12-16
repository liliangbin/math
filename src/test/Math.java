package test;

/*
* 用于算一个数列的平均值和方差*/
public class Math {


    public double lalal(double a, double b[]) {

        return 0;
    }

   /* public static void main(String arg[]) {


        double total = 0;
        double a = 0;
        double name[] = {0.1789,0.1794,0.1799,0.1801, 0.1802};

        //double a =7.8338;
        for (int j = 0; j < 5; j++) {
            a = a + name[j] / 5;

        }
        double b[] = name;
        for (int i = 0; i < 5; i++) {

            total = total + (b[i] - a) * (b[i] - a);
        }
        System.out.println(total);
        System.out.println(java.lang.Math.sqrt(total / 20));
        System.out.println(a);

    }*/


   public static  void  main(String arg[]){


       double l  , m , d ,f;
       l= 0.18004;
       m= 0.0727;
       d =0.0078338;
       f = 825;

       double total =1.008*1.6067*(l*l*l*m*f*f)/(d*d*d*d);

       System.out.println(total);


       total = total *0.0023;
       System.out.println(total);
   }


}
