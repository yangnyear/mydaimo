package com.swpu;

public class Calcict {

    public static void main(String[] args) {
	// write your code here
       System.out.print("10的阶乘="+katch(10));
        System.out.print(("10的阶乘为"+katch2(10)));
    }
    public  static double katch(int n){
        double result=1.0;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }
    public static double katch2(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*katch2(n-1);
        }
    }
}
