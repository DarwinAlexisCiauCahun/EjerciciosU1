
package practicanum2poo;

public class cuadrado extends figuras{
     
    private double lado; 
    
    public cuadrado (double l){
    super ("Cuadrado");
    lado=l;
    } 
        
    public void setArea() {
     this.area=lado*lado;
  
    
    }
    
    public  void setPerimetro() {
        
     this.perimetro=lado*4;
    }
    
    public void resultados () {
    super.resultados();
    }   
}
