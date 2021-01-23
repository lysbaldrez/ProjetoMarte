package br.com.elo7;

import br.com.elo7.spaceship.Perseverance;
import org.junit.Test;

public class MarsTest {
    @Test
    public void deveriaCriarMarte(){
        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(5, 5);

        Mars mars = new Mars(startPoint, endPoint);
        Geolocation destination = mars.navigate(new Perseverance(), NavigationInstructions.createInstructions("LMR"));

//incompleto
    }
}
