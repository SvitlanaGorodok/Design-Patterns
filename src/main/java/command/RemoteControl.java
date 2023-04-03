package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoteControl {
    List<Command> onCommands;
    List<Command> offCommands;

    public RemoteControl() {
        onCommands = new ArrayList<>();
        offCommands = new ArrayList<>();
        for(int i=0; i < 7; i++){
            onCommands.add(new NoCommand());
            offCommands.add(new NoCommand());
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands.set(slot, onCommand);
        offCommands.set(slot, offCommand);
    }

    public void onButtonWasPushed(int slot){
        onCommands.get(slot).execute();
    }

    public void offButtonWasPushed(int slot){
        offCommands.get(slot).execute();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("----------------------RemoteControl----------------------\n");
        for(int i=0; i < 7; i++){
            result.append("slot ")
                    .append(i)
                    .append(" - ")
                    .append(onCommands.get(i).getClass().getName())
                    .append(" ")
                    .append(offCommands.get(i).getClass().getName())
                    .append("\n");
        }
        return  result.toString();
    }
}
