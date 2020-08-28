package com.stats;

import java.math.BigDecimal;

public class ToolService {
    public static void main(String[] args) {

        equalsBigDecimal();
    }

    /**
     * equals比较两个bigDecimal值。数学意义上两个值应该相等。但是返回false。使用BigDecimal时需要注意
     * 应该使用compareTo比较大小。大于返回1 等于返回0 小于返回-1
     */
    public static void equalsBigDecimal(){

        BigDecimal bigDecimal1 = new BigDecimal("2.00");
        BigDecimal bigDecimal2 = new BigDecimal("2.0");
        System.out.println(bigDecimal1.equals(bigDecimal2));
        System.out.println(bigDecimal1.compareTo(bigDecimal2));
    }
}
