import java.util.ArrayList;
/**
 * Write a description of class Combinacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Combinacion
{
    public ArrayList<ArrayList<Vertice>> combinar(ArrayList<Vertice> vertices, int m){
        ArrayList<ArrayList<Vertice>> grupos = new ArrayList<>();
        ArrayList<Vertice> grupoM;
        Vertice vi, vj;
        ArrayList<Integer> colores;//para controlar los colores del grupoM
        for(int i = 0; i < vertices.size()-(m-1); i++){
            vi = vertices.get(i);
            grupoM  = new ArrayList<>();
            colores = new ArrayList<>();
            grupoM.add(vi);
            colores.add(vi.getColor());
            int t = i+1;
            for(int j = i+1; j < vertices.size(); j++){
                vj = vertices.get(j);
                if(!colores.contains(vj.getColor())){//verificamos que existan colores diferentes
                    grupoM.add(vj);
                    colores.add(vj.getColor());
                    if(grupoM.size() == m){
                        agregarGrupo(grupos, grupoM); //para no tener problemas de referencia
                        //grupos.add(grupoM);
                        grupoM.remove(grupoM.size()-1);
                        colores.remove(colores.size()-1);
                    }
                }
                if(j+1 == vertices.size()){
                    grupoM.remove(grupoM.size()-1);
                    colores.remove(colores.size()-1);
                    j = t;
                    t = t + 1;
                }
            }
        }
        return grupos;
    }
    private void agregarGrupo(ArrayList<ArrayList<Vertice>> grupos, ArrayList<Vertice> gr){
        if(!grupos.contains(gr)){
            ArrayList<Vertice> grupotmp = new ArrayList<>();
            for(Vertice v : gr){
                grupotmp.add(v);
            }
            grupos.add(grupotmp);
        }//else
           // System.out.println(gr);
    }
}
