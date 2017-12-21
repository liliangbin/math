package rrvert;

/*
* 复化辛蒲生求积公式*/
public class RevetMain {

    public static void main(String arg[]) {
        double a, b, n;
        a =0;
        b =1;
        n =5;//阶数
        RevetService revetService = new RevetService();
        revetService.doRevet(a,b,n);

    }
}
