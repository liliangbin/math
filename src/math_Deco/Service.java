package math_Deco;
/*
*
* 列消元的方法*/
public class Service  {

    int n, ip = -1;

    double a[][], b[];

    double eq;

    public Service(double[][] a, double[] b, double eq) {
        this.a = a;
        this.b = b;
        this.eq = eq;
        this.n = b.length;

    }

    public double[] fun()  {
        double max, temp, s;
        int m, i, j, k;
        for (k = 0; k <=n - 2; k++) {
//第一个循环，用于表示一行一行的数据来变化
            max = Math.abs(a[k][k]);
            m = k;

            for (i = k + 1; i <= n-1 ; i++) {
                if (Math.abs(a[i][k]) > max) {
//寻找绝对值最大的时候
                    max = Math.abs(a[i][k]);
                    m = i;
                }
            }

            /*if (max < eq) {
                ip = -1;

                break;
            }*/
 //当不满足的时候整行进行变换
            if (m != k) {

                for (j = k; j <= n-1; j++) {

                    temp = a[k][j];
                    a[k][j] = a[m][j];
                    a[m][j] = temp;
                }

                temp = b[k];
                b[k] = b[m];
                b[m] = temp;
            }
//寻找约分的最小的公因式。并且约分，同时为零的部分不进行操作
// ，最近的那个数据进行的操作是存储他们呢的公因子
            for (i = k + 1; i <= n-1; i++) {
                a[i][k] = a[i][k] / a[k][k];
                for (j = k + 1; j < n; j++) {
                    a[i][j] = a[i][j] - a[i][k] * a[k][j];

                }
                b[i] = b[i] - a[i][k] * b[k];
            }
        }
      //  System.out.println(b[0] + "\n" + b[1] + "\n" + b[2]);
//这个地方进行的是把他们的数据回带回去
        b[n - 1] = b[n - 1] / a[n - 1][n - 1];
        for (i = n - 2; i >= 0; i--) {
            s = 0;
            for (j = i + 1; j <= n-1; j++) {

                s = s + a[i][j] * b[j];

            }
           // System.out.println(s);
            b[i] = (b[i] - s)/a[i][i];

        }
        return b;

    }
}
