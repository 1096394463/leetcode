package com.qiu.design.pattern.behavioral.interpreter;

import java.util.Objects;
import java.util.Stack;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class ExpressionParser {
    private Stack<Interpreter> stack=new Stack<>();
    public int parse(String str){
        String[] strItemArray = str.split(" ");
        for (String symbol : strItemArray) {
            if(Objects.equals("+",symbol)||Objects.equals("*",symbol)){
                Interpreter first = stack.pop();
                Interpreter second = stack.pop();
                System.out.println(String.format("出栈:%d和%d",first.interpret(),second.interpret()));
                if(Objects.equals("+",symbol)){
                    AddInterpreter addInterpreter = new AddInterpreter(first, second);
                    System.out.println(String.format("应用运算符:%s",addInterpreter));
                    int result = addInterpreter.interpret();
                    NumberInterpreter numberInterpreter = new NumberInterpreter(result);
                    stack.push(numberInterpreter);
                    System.out.println(String.format("阶段结果入栈:%d",numberInterpreter.interpret()));
                }else {
                    MultiInterpreter multiInterpreter = new MultiInterpreter(first,second);
                    System.out.println(String.format("应用运算符:%s",multiInterpreter));
                    int result = multiInterpreter.interpret();
                    NumberInterpreter numberInterpreter = new NumberInterpreter(result);
                    stack.push(numberInterpreter);
                    System.out.println(String.format("阶段结果入栈:%d",numberInterpreter.interpret()));
                }
            }else {
                NumberInterpreter numberInterpreter = new NumberInterpreter(symbol);
                stack.push(numberInterpreter);
                System.out.println(String.format("入栈：%d",numberInterpreter.interpret()));
            }
        }
        return stack.pop().interpret();
    }
}
