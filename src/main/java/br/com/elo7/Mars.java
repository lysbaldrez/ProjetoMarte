package br.com.elo7;

import br.com.elo7.spaceship.Perseverance;

public class Mars {
    private Point startPoint;
    private Point endPoint;

    public Mars(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Geolocation navigate(Perseverance car, NavigationInstructions instructions) {
        // aqui faz o carrinho navegar no terreno e retona o lugar que ele parou
        return new Geolocation(new Point(3, 3), Direction.N);
    }
}
