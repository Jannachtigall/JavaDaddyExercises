package mentorship.roadmap.Java_Core.step4_OOP.topic11_StrategyCommand;

import mentorship.roadmap.Java_Core.step4_OOP.topic11_StrategyCommand.command.Command;
import mentorship.roadmap.Java_Core.step4_OOP.topic11_StrategyCommand.command.PauseCommand;
import mentorship.roadmap.Java_Core.step4_OOP.topic11_StrategyCommand.command.StartCommand;
import mentorship.roadmap.Java_Core.step4_OOP.topic11_StrategyCommand.command.StopCommand;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommandProcessor {

    private Map<String, Command> map = new HashMap<>();

    public CommandProcessor() {
        map.put("start", new StartCommand());
        map.put("pause", new PauseCommand());
        map.put("stop", new StopCommand());
    }

    public void process() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("List of commands: start, pause, stop");
        while (true) {
            System.out.print("Please, enter command: ");
            Command command = map.get(scanner.nextLine());
            if (command != null) {
                command.execute();
            } else {
                System.out.println("Wrong command!");
            }
        }
    }
}
