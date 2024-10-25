
package santostapia_parcial;

public abstract class Planta {
    private String nombre;
    private String ubicacion;
    private String clima;

    public Planta(String nombre, String ubicacion, String clima) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.clima = clima;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    
    
    
    public void podar(){
        /*System.out.println("Se podo la planta")*/;
    }

    @Override
    public String toString() {
        return "Planta{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", clima=" + clima + ',';
    }
    
    
    
    
}
