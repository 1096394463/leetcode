package com.qiu.design.pattern.behavioral.interpreter;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class Test {
    public static void main(String[] args) {
        String InputStr="6 100 11 + *";
        ExpressionParser expressionParser = new ExpressionParser();
        int result= expressionParser.parse(InputStr);
        System.out.println("解释器计算结果"+result);
    }
}
