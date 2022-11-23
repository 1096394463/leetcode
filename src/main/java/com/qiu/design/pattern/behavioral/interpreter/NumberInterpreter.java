package com.qiu.design.pattern.behavioral.interpreter;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class NumberInterpreter implements Interpreter{
    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }
    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }
    @Override
    public int interpret() {
        return this.number;
    }
}
