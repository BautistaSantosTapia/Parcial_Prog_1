
package santostapia_parcial;

public class PlantaRepetidaException extends RuntimeException{
    public final static String MESSAGE = "No se puede agregar esta planta";

    public PlantaRepetidaException() {
        super(MESSAGE);
    }
    
}
