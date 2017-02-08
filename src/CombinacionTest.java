

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * The test class CombinacionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CombinacionTest
{
    /**
     * Default constructor for test class CombinacionTest
     */
    public CombinacionTest()
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
    public void test1(){
        Combinacion cmbn = new Combinacion();
        Vertice a = new Vertice(0,'a');
        Vertice b = new Vertice(1,'b');
        Vertice c = new Vertice(0,'c');
        Vertice d = new Vertice(2,'d');
        Vertice e = new Vertice(2,'e');
        ArrayList<Vertice> v = new ArrayList<>();
        v.add(a);v.add(b);v.add(c);v.add(d);v.add(e);
        
        ArrayList<ArrayList<Vertice>> resEsperada = new ArrayList<>();
        ArrayList<Vertice> gt = new ArrayList<>();
        
        gt.add(a);gt.add(b);gt.add(d);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(a);gt.add(b);gt.add(e);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(b);gt.add(c);gt.add(d);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(b);gt.add(c);gt.add(e);
        resEsperada.add(gt);
        assertEquals(resEsperada, cmbn.combinar(v, 3));
    }
    
    @Test
    public void test2(){
        Combinacion cmbn = new Combinacion();
        Vertice a = new Vertice(0,'a');
        Vertice b = new Vertice(1,'b');
        Vertice c = new Vertice(2,'c');
        Vertice d = new Vertice(1,'d');
        Vertice e = new Vertice(0,'e');
        Vertice f = new Vertice(1,'f');
        Vertice g = new Vertice(2,'g');
        
        ArrayList<Vertice> v = new ArrayList<>();
        v.add(a);v.add(b);v.add(c);v.add(d);v.add(e);v.add(f);v.add(g);
        
        ArrayList<ArrayList<Vertice>> resEsperada = new ArrayList<>();
        ArrayList<Vertice> gt = new ArrayList<>();
        
        gt.add(a);gt.add(b);gt.add(c);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(a);gt.add(b);gt.add(g);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(a);gt.add(c);gt.add(d);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(a);gt.add(c);gt.add(f);
        resEsperada.add(gt);gt = new ArrayList<>();
        gt.add(a);gt.add(d);gt.add(g);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(a);gt.add(f);gt.add(g);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(b);gt.add(c);gt.add(e);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(b);gt.add(e);gt.add(g);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(c);gt.add(d);gt.add(e);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(c);gt.add(e);gt.add(f);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(d);gt.add(e);gt.add(g);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(e);gt.add(f);gt.add(g);
        resEsperada.add(gt);
        assertEquals(resEsperada, cmbn.combinar(v, 3));
    }
    @Test
    public void test3(){
        Combinacion cmbn = new Combinacion();
        Vertice a = new Vertice(0,'a');
        Vertice b = new Vertice(1,'b');
        Vertice c = new Vertice(0,'c');
        Vertice d = new Vertice(2,'d');
        Vertice e = new Vertice(2,'e');
        ArrayList<Vertice> v = new ArrayList<>();
        v.add(a);v.add(b);v.add(c);v.add(d);v.add(e);
        
        ArrayList<ArrayList<Vertice>> resEsperada = new ArrayList<>();
        ArrayList<Vertice> gt = new ArrayList<>();
        
        gt.add(a);gt.add(b);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(a);gt.add(d);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(a);gt.add(e);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(b);gt.add(c);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(b);gt.add(d);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(b);gt.add(e);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(c);gt.add(d);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(c);gt.add(e);
        resEsperada.add(gt);
        assertEquals(resEsperada, cmbn.combinar(v, 2));
    }
    
    @Test
    public void test4(){
        Combinacion cmbn = new Combinacion();
        Vertice a = new Vertice(0,'a');
        Vertice b = new Vertice(1,'b');
        Vertice c = new Vertice(2,'c');
        Vertice d = new Vertice(1,'d');
        Vertice e = new Vertice(0,'e');
        Vertice f = new Vertice(3,'f');
        Vertice g = new Vertice(2,'g');
        
        ArrayList<Vertice> v = new ArrayList<>();
        v.add(a);v.add(b);v.add(c);v.add(d);v.add(e);v.add(f);v.add(g);
        
        ArrayList<ArrayList<Vertice>> resEsperada = new ArrayList<>();
        ArrayList<Vertice> gt = new ArrayList<>();
        
        gt.add(a);gt.add(b);gt.add(c);gt.add(f);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(a);gt.add(b);gt.add(f);gt.add(g);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(b);gt.add(c);gt.add(e);gt.add(f);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(c);gt.add(d);gt.add(e);gt.add(f);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(d);gt.add(e);gt.add(f);gt.add(g);
        resEsperada.add(gt); gt = new ArrayList<>();
        
        assertEquals(resEsperada, cmbn.combinar(v, 4));
    }
    
    @Test
    public void test5(){
        Combinacion cmbn = new Combinacion();
        Vertice a = new Vertice(0,'a');
        Vertice b = new Vertice(1,'b');
        Vertice c = new Vertice(2,'c');
        Vertice d = new Vertice(3,'d');
        Vertice e = new Vertice(0,'e');
        ArrayList<Vertice> v = new ArrayList<>();
        v.add(a);v.add(b);v.add(c);v.add(d);v.add(e);
        
        ArrayList<ArrayList<Vertice>> resEsperada = new ArrayList<>();
        ArrayList<Vertice> gt = new ArrayList<>();
        
        gt.add(a);gt.add(b);gt.add(c);gt.add(d);
        resEsperada.add(gt); gt = new ArrayList<>();
        gt.add(b);gt.add(c);gt.add(d);gt.add(e);
        resEsperada.add(gt); gt = new ArrayList<>();
        
        assertEquals(resEsperada, cmbn.combinar(v, 4));
    }
}
