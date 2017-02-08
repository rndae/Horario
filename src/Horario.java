import java.util.ArrayList;

public class Horario implements Comparable<Horario>
{
    ArrayList<Vertice> materias;
    byte puentes, choques;
    
    public Horario(ArrayList<Vertice> m){
        materias=m;
    }
    
    @Override
    public int compareTo(Horario b){ //por defecto
        //return -1;
        
        //return 1;
        
        return 0;
    }
    
    public int compareToP(Horario b){ //por puentes
        //return -1;
        
        //return 1;
        
        return 0;
    }
    
    public int compareToC(Horario b){ //por choques
        //return -1;
        
        //return 1;
        
        return 0;
    }
    
    public int compareToD(Horario b){ //por calidad de docentes
        //return -1;
        
        //return 1;
        
        return 0;
    }
    
    public void desecharDisp(double a, double b){ //desecha por turno
        //foreach...
    }
}
