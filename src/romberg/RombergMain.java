package romberg;

/*
* rombeg 求积公式*/
public class RombergMain {


    public static void main(String arg[]) {
        double a, b, eq;
        a = 0;
        b = 1;
        eq = 0.0000004;
        RomBergService romBergService = new RomBergService();
        romBergService.romBergService(a,b,eq);


    }
}
