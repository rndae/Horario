
/**
 * Write a description of class Vertice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vertice
{
   private int color;
   private char nombre;
   public Vertice(int color, char n){
       this.color = color;
       nombre = n;
    }
   public int getColor(){
       return color;
    }
    
   public String toString(){
       return "" + nombre;
    }
}
