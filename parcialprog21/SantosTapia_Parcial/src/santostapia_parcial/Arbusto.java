
package santostapia_parcial;

public class Arbusto extends Planta{
    private int densidad;
    public static final int DENSIDAD_MIN = 1;
    public static final int DENSIDAD_MAX = 10;

    public Arbusto(int densidad, String nombre, String ubicacion, String clima) {
        super(nombre, ubicacion, clima);
        validarDensidad(densidad);
        this.densidad = densidad;
    }
    
    @Override
    public void podar(){
        System.out.println("Se podo el arbusto");
    }

    @Override
    public String toString() {
        return super.toString() + " densidad=" + densidad + '}';
    }
    
    
    
    
    private void validarDensidad(int densidad){
        if(densidad < DENSIDAD_MIN || densidad > DENSIDAD_MAX){
            throw new IllegalArgumentException();
        }
    }
    
}