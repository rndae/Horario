import static org.mockito.Mockito.*;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestCamarilla.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestCamarilla
{
    /**
     * Default constructor for test class TestCamarilla
     */
    public TestCamarilla()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void test(){
        Vertice c = new Vertice(0,'c');
        Vertice d = new Vertice(1,'d');
        Vertice e = new Vertice(1,'e');
        Vertice h = new Vertice(2,'h');
        Vertice g = new Vertice(2,'g');
        Vertice j = new Vertice(3,'j');
        
        ArrayList<Vertice> vert = new ArrayList<>();//vertices de color 0
        vert.add(c);
        ArrayList<Vertice> vecinos = new ArrayList<>();
        vecinos.add(d); vecinos.add(e);vecinos.add(g);vecinos.add(h);vecinos.add(j);
        
        Grafo grafo = mock(Grafo.class);
        when(grafo.getVertices(0)).thenReturn(vert);
        when(grafo.vecinos(c)).thenReturn(vecinos);
        when(grafo.existeArista(d, e)).thenReturn(false);
        when(grafo.existeArista(d, h)).thenReturn(true);
        when(grafo.existeArista(d, g)).thenReturn(true);
        when(grafo.existeArista(d, j)).thenReturn(false);
        when(grafo.existeArista(d, c)).thenReturn(true);
        when(grafo.existeArista(e, h)).thenReturn(true);
        when(grafo.existeArista(e, g)).thenReturn(true);
        when(grafo.existeArista(e, j)).thenReturn(true);
        when(grafo.existeArista(e, c)).thenReturn(true);
        when(grafo.existeArista(h, g)).thenReturn(false);
        when(grafo.existeArista(h, j)).thenReturn(true);
        when(grafo.existeArista(h, c)).thenReturn(true);
        when(grafo.existeArista(g, j)).thenReturn(true);
        when(grafo.existeArista(g, c)).thenReturn(false);
        when(grafo.existeArista(j, c)).thenReturn(true);
        when(grafo.numVertices()).thenReturn(6);
        
        Camarilla camarilla = new Camarilla(grafo);
        
        ArrayList<ArrayList<Vertice>> resEsperada = new ArrayList<>();
        ArrayList<Vertice> conjCamarilla1 = new ArrayList<>();
        conjCamarilla1.add(e); conjCamarilla1.add(h);conjCamarilla1.add(j);conjCamarilla1.add(c);
        resEsperada.add(conjCamarilla1);
        
        assertEquals(resEsperada, camarilla.getConjuntosCamarilla(4));
    }
    
    @Test
    public void test2(){
       Vertice a = new Vertice(0,'a');
       Vertice b = new Vertice(1,'b');
       Vertice c = new Vertice(3,'c');
       Vertice d = new Vertice(2,'d');
       Vertice e = new Vertice(3,'e');
       Vertice f = new Vertice(2,'f');
       Vertice g = new Vertice(1,'g');
       Vertice h = new Vertice(0,'h');
       
       ArrayList<Vertice> vertIni = new ArrayList<>();//vertices de color 0
       vertIni.add(a);   vertIni.add(h);
       ArrayList<Vertice> vecinosA = new ArrayList<>();
       vecinosA.add(b);  vecinosA.add(d);  vecinosA.add(f); vecinosA.add(c); vecinosA.add(e);
       ArrayList<Vertice> vecinosH = new ArrayList<>();
       vecinosH.add(g); vecinosH.add(f); vecinosH.add(c); vecinosH.add(e);  
       
       Grafo grafo = mock(Grafo.class);
       when(grafo.getVertices(0)).thenReturn(vertIni);
       
       when(grafo.vecinos(a)).thenReturn(vecinosA);
       when(grafo.vecinos(h)).thenReturn(vecinosH);
       
       when(grafo.existeArista(b, d)).thenReturn(true);
       when(grafo.existeArista(b, c)).thenReturn(true);
       when(grafo.existeArista(b, a)).thenReturn(true);
       when(grafo.existeArista(d, c)).thenReturn(true);
       when(grafo.existeArista(d, a)).thenReturn(true);
       when(grafo.existeArista(c, a)).thenReturn(true);
       
       when(grafo.existeArista(b, e)).thenReturn(true);
       when(grafo.existeArista(d, e)).thenReturn(true);
       when(grafo.existeArista(e, a)).thenReturn(true);
       
       when(grafo.existeArista(b, f)).thenReturn(true);
       when(grafo.existeArista(f, c)).thenReturn(false);
       when(grafo.existeArista(f, a)).thenReturn(true);
       
       when(grafo.existeArista(f, e)).thenReturn(false);
       
       when(grafo.existeArista(g, f)).thenReturn(false);
       when(grafo.existeArista(g, c)).thenReturn(false);
       when(grafo.existeArista(g, h)).thenReturn(true);
       when(grafo.existeArista(f, h)).thenReturn(true);
       when(grafo.existeArista(c, h)).thenReturn(true);
       
       when(grafo.existeArista(g, e)).thenReturn(true);
       when(grafo.existeArista(e, h)).thenReturn(false);
         
        ArrayList<ArrayList<Vertice>> resEsperada = new ArrayList<>();
        
        ArrayList<Vertice> conjCamarilla1 = new ArrayList<>();
        conjCamarilla1.add(b); conjCamarilla1.add(d);conjCamarilla1.add(c);conjCamarilla1.add(a);
        resEsperada.add(conjCamarilla1);
        
        ArrayList<Vertice> conjCamarilla2 = new ArrayList<>();
        conjCamarilla2.add(b); conjCamarilla2.add(d);conjCamarilla2.add(e);conjCamarilla2.add(a);
        resEsperada.add(conjCamarilla2);
        
        Camarilla camarilla = new Camarilla(grafo);
        assertEquals(resEsperada, camarilla.getConjuntosCamarilla(4));
    }
}
