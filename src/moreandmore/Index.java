package moreandmore;

public class Index {



    public static void main(String arg[]) {
        int n = 8, m = 2;


        MoreService2 moreService2 = new MoreService2();
        double[] total = moreService2.ServiceOne(n,m);
        for (int i = 0; i <total.length;i++){
            System.out.println("最后的值是" + total[i]);
        }
    }
}
