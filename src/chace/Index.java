package chace;
/*追赶法*/
public class Index {

    public static void main(String arg[]) {


        Test test = new Test();


        double[] name = test.in();
        /*test.p[1] = 2;
        System.out.println(test.p[1]);*/

        for(int i=1;i<test.a.length;i++){
            System.out.println(name[i]);
        }
    }
}
