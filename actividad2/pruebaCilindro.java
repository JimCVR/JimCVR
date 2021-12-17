package actividad2;

public class pruebaCilindro {
    public static void main (String [] args){
        cilindro cil1= new cilindro();

        System.out.println("Radio: "+ cil1.getRadio()+"\naltura: "+ cil1.getAltura()+"\ncolor: "+ cil1.getColor()+"\nbase area: "+ cil1.getArea()+"\nvolumen: "+ cil1.getVolumen());

        cilindro cil2= new cilindro();
        System.out.println("Radio: "+ cil2.getRadio()+"\naltura: "+ cil2.getAltura()+"\ncolor: "+ cil2.getColor()+"\nbase area: "+ cil2.getArea()+"\nvolumen: "+ cil2.getVolumen());

    }
}
