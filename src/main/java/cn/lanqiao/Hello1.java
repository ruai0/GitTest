package cn.lanqiao;

import java.math.BigDecimal;

public class Hello1 {
    public static void main(String[] args) {
        String s1 ="1000000";
        String s2 ="30";
        BigDecimal price = new BigDecimal(s1);
        BigDecimal price2 = new BigDecimal(s2);
        double result = price.divide(price2,2,BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(result);
    }
}
