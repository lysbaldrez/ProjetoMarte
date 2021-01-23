package br.com.elo7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NavigationInstructionsTest {

    @Test
    public void deveriaCriarAsInstructionsAPartirDoTextoDeEntrada() {
        String instructions = "LMRM";
        NavigationInstructions navigationInstructions = NavigationInstructions.createInstructions(instructions);
        assertEquals(Instruction.L, navigationInstructions.next());
        assertEquals(Instruction.M, navigationInstructions.next());
        assertEquals(Instruction.R, navigationInstructions.next());
        assertEquals(Instruction.M, navigationInstructions.next());
        assertEquals(null, navigationInstructions.next());
    }
}
