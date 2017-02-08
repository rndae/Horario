import java.util.ArrayList;
/**
 * Write a description of class Camarilla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camarilla
{
    private Grafo grafo;
    private int nv; //numero de vertices
    private Combinacion combinador;
    
    public Camarilla(Grafo g){
        grafo = g;
        //nv = g.numVertices();
        combinador = new Combinacion();
    }
    
    public ArrayList<ArrayList<Vertice>> getConjuntosCamarilla(int clique){
        ArrayList<ArrayList<Vertice>> camarillas = new ArrayList<>();
        ArrayList<Vertice> verticesIni = grafo.getVertices(0);//obtenemos los vertices de color 0
        for(Vertice vo : verticesIni){
            ArrayList<Vertice> vecinos = grafo.vecinos(vo);
            ArrayList<ArrayList<Vertice>> grupos = combinador.combinar(vecinos, clique - 1);
            for(ArrayList<Vertice> gr : grupos){
                gr.add(vo);
                if(verificarRelaciones(gr)){
                    camarillas.add(gr);
                }
            }
        }
        return camarillas;
    }
    
    private boolean verificarRelaciones(ArrayList<Vertice> grupo){
        boolean exito = true;
        int i = 0; int j = i+1;
        while(exito && i < grupo.size()-1){//comparamos cada par de vertices del grupo
            Vertice vo = grupo.get(i);
            Vertice vf = grupo.get(j);
            if(!grafo.existeArista(vo, vf)){
                exito = false;
            }
            j++;
            if(j >= grupo.size()){
                i++; j = i+1;
            }
        }
        return exito;
    }
}
