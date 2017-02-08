
public class Ordenes
{
    private Ordenes(){ 
        throw new RuntimeException("No es para crear instancia de"); }
    
    public Horario[] ordenar(Horario[] h){ //por defecto
        /* +Aqui se ordena+ */
        return h;
    }
}