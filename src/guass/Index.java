package guass;

public class Index {

    public static void main(String arg[]) {
        Service service = new Service();
        double[] hh = service.name();

        for(int i=0;i<hh.length;i++){
            System.out.println(hh[i]);
        }
    }
}
