import java.util.ArrayList;
/**
 * Write a description of class Grafo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Grafo
{
    abstract public ArrayList<Vertice> getVertices(int color);
    abstract public ArrayList<Vertice> vecinos(Vertice v);
    abstract public boolean existeArista(Vertice vo, Vertice vf);
    abstract public int numVertices();
}
