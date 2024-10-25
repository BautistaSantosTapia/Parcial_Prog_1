
package santostapia_parcial;

public class Arbol extends Planta{
    private double altura_max; 

    public Arbol(double altura_max, String nombre, String ubicacion, String clima) {
        super(nombre, ubicacion, clima);
        this.altura_max = altura_max;
    }
    
    @Override
    public void podar(){
        System.out.println("Se podo el arbol");
    }

    @Override
    public String toString() {
        return super.toString() + " altura_max=" + altura_max + '}';
    }
    
    
}
