package mentorship.roadmap.Java_Core.step4_OOP.topic11_StrategyCommand.command;

public class StopCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Stop!");
        System.exit(0);
    }
}
