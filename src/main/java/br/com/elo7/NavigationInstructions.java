package br.com.elo7;

import java.util.LinkedList;

public class NavigationInstructions {
    private LinkedList<Instruction> instructions;

    private NavigationInstructions(LinkedList<Instruction> instructions) {
        this.instructions = instructions;
    }

    public static NavigationInstructions createInstructions(String textInstructions) {
        LinkedList<Instruction> instructions = new LinkedList<>();
        for(char instruction: textInstructions.toCharArray()) {
            instructions.add(Instruction.valueOf(Character.toString(instruction)));
        }
        return new NavigationInstructions(instructions);
    }

    public Instruction next(){
        return instructions.pollFirst();
    }
}
