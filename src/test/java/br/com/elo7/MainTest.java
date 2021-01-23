package br.com.elo7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void deveriaRodarOFluxoCompleto(){
        Main app = new Main();
        String resultado = app.run("foo");
        assertEquals("foo", resultado);
    }
}
