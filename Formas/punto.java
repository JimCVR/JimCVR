package Formas;

public class punto {
    private int x;
    private int y;
    private int [] xy;
    public punto(){
        x = 0;
        y = 0;
    }
    public punto(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int[] getXy() {
        return xy;
    }

    public void setXy(int[] xy) {
        this.xy = xy;
    }
    public double distance(int x, int y){
        double distancia = x-y;
        return distancia;
    }
    public double distance(punto otro){
        double distancia = otro.getX()-otro.getY();
        return distancia;
    }
}
