package Rettangolo;
public class Rettangolo {
    private double base;
    private double larghezza;

    public Rettangolo(double base, double larghezza){
        setBase(base);
        setLarghezza(larghezza);
    }

    public void setBase(double nuovaBase){
        base = nuovaBase;
    }
    public void setLarghezza(double nuovaLarghezza){
        larghezza=nuovaLarghezza;
    }

    public double getBase(){
        return base;
    }
    public double getLarghezza(){
        return larghezza;
    }

    public static void stampaRettangolo(Rettangolo rettangolo){
        double area = rettangolo.getBase() * rettangolo.getLarghezza();
        double perimetro = 2 * (rettangolo.getBase() + rettangolo.getLarghezza());

        System.out.println("area: "+ area);
        System.out.println("perimetro: "+ perimetro);
    }
    public static void stampaDueRettangoli(Rettangolo rettangolo, Rettangolo rettangolo2){
        double area1 = rettangolo.getBase() * rettangolo.getLarghezza();
        double perimetro1 = 2 * (rettangolo.getBase() + rettangolo.getLarghezza());
        double area2 = rettangolo2.getBase() * rettangolo2.getLarghezza();
        double perimetro2 = 2 * (rettangolo2.getBase() + rettangolo2.getLarghezza());
        System.out.println("area Rettangolo 1: "+ area1);
        System.out.println("perimetro Rettangolo 1: "+ perimetro1);
        System.out.println("area Rettangolo 2: "+ area2);
        System.out.println("perimetro Rettangolo 2: "+ perimetro2);

        System.out.println("La somma dell'area è: " +(area1+area2) + " la somma dei perimetri è invece: " + (perimetro1+perimetro2));
    }

}
