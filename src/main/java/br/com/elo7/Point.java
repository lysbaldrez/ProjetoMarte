package br.com.elo7;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        // validar numeros negativos
        // validar numeros inteiros
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
