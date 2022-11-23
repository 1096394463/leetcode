package com.qiu.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class Staff {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }
}
