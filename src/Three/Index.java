package Three;

public class Index {

    public static void main(String arg[]) {

        Service service = new Service();

        double[] hr = service.doTest();
       for(int i=1;i<hr.length;i++){

           System.out.println(hr[i]);

       }

        return;
    }
}
