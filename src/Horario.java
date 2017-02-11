import java.util.ArrayList;
import java.util.Comparator;

public class Horario
{
    private ArrayList<Vertice> materias;
    private final Byte puentes, choques, dias; //dias=>libres
    
    public static final Comparator<Horario> POR_PUENTES = new PorPuentes();
    public static final Comparator<Horario> POR_DIAS = new PorDias();
    public static final Comparator<Horario> POR_CHOQUES = new PorChoques();
    
    public Horario(ArrayList<Vertice> m){
        materias = m;
        puentes = analizarP();
        choques = analizarC();
        dias = analizarD();
    }
    
    private static class PorPuentes implements Comparator<Horario>{
        public int compare(Horario v, Horario w)
        {     return v.puentes.compareTo(w.puentes);}
    }
    
    private static class PorDias implements Comparator<Horario>{
        public int compare(Horario v,Horario w)
        { return v.dias.compareTo(w.dias);}
    }
    
    private static class PorChoques implements Comparator<Horario>{
        public int compare(Horario v, Horario w)
            {return v.choques.compareTo(w.choques);}
    }
    
    private Byte analizarP(){
        
        return null;
    }
    
    private Byte analizarD(){
        
        return null;
    }
    
    private Byte analizarC(){
        
        return null;
    }
    
    public void desecharTurno(double a, double b){ //desecha por turno
        //dentro del foreach principal de añadiduras
    }
}
