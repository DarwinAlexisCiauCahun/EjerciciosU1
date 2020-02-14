
package practicanum2poo;

public class rectangulo extends figuras{
private double base;
private double altura;

public rectangulo (double b, double a){
     super("Rectangulo");
      base=b;
     altura=a;
}

public void setArea() {

this.area=base*altura;
}
public void setPerimetro () {

this.perimetro= (base*2)+(altura*2);
}
public void resultados() {
super.resultados();
}

}
