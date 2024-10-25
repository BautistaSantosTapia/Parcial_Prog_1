
package santostapia_parcial;

public class Flor extends Planta{
    private Florecimiento florecimiento;

    public Flor(Florecimiento florecimiento, String nombre, String ubicacion, String clima) {
        super(nombre, ubicacion, clima);
        this.florecimiento = florecimiento;
    }

    @Override
    public String toString() {
        return super.toString() + " florecimiento=" + florecimiento + '}';
    }
    
    
    @Override
    public void podar(){
        System.out.println("Una flor no puede ser podada");
    }
}
