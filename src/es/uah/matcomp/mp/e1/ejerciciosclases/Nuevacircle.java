package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Nuevacircle {
    //Atributos
    private double radius;

    // Constructor
    public Nuevacircle(){
        this.radius = 1.0;
    }
    public Nuevacircle(double radius){
        this.radius = radius;
    }

    // Métodos
    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    public double getCircumference(){
        return this.radius * 2 * Math.PI;
    }

    public String toString(){
        return "Circle[radius=" + radius + "]";

    }

}
