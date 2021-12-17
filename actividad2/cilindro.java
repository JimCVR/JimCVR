package actividad2;

public class cilindro extends circulo {
    protected double altura;
    public cilindro(){
        altura = 1.0;
    }
    public cilindro(double altura){
        this.altura=altura;
    }
    public cilindro(double altura,double radio){
        super();
        this.altura=altura;
        this.radio=radio;
    }
    public cilindro(double altura,double radio,String color){
        super();
        this.altura=altura;
        this.radio=radio;
        this.color=color;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "cilindro{" +
                "altura=" + altura +
                '}';
    }
    public double getVolumen(){
        double volumen = getArea()*altura;
        return volumen;
    }
}
