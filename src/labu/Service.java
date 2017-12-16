package labu;


/*拉格朗日插值定理*/
public class Service {

    double x[] = {1.1275,1.1503,1.1735,1.1972}, y[] = {0.1191, 0.13954, 0.15932,0.17903};
    double px = 1.13;

    double total = 0;
    public double name() {

        double n = y.length;
        for (int i = 0; i < n; i++) {
            double s = 1;

            for (int j = 0; j < n; j++) {


                if (j != i) {
                    s = s * (px -x[j]);
                }

            }

            for(int c=0;c<n;c++){

                if(c!=i){
                    s= s/(x[i] - x[c]);

                }
            }

            s =s * y[i];

            total = total + s;
        }

        return  total;
    }
}


