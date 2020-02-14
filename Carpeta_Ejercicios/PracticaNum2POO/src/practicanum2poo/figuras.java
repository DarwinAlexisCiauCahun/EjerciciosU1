/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicanum2poo;

public class figuras {
 protected String nombre;
 protected double area;
 protected  double perimetro;

  public figuras (String n) {
 nombre=n;
 }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
 
 public void resultados() {
 
     System.out.println("Nombre:"+this.getNombre());
       System.out.println("Area:"+this.getArea());
         System.out.println("Perimetro:"+this.getPerimetro());
 }

 
}
