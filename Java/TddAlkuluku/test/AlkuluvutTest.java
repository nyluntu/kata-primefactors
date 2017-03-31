/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author tnylund1
 * 
 * TDD harjoitus
 * 
 * Tehtävänä on luoda ohjelma, jolle annetaan parametrina luku ja se palauttaa
 * luvusta alkuvut. 
 * 
 * 1 = ei ole
 * 2 = on
 * 3 = on
 * 4 = 2, 2 
 * 5 = 5
 * 6 = 2 x 3
 * 
 * [2, 5] = Alkuluvut.luo(10);
 * 
 */
public class AlkuluvutTest {
    
    public AlkuluvutTest() {
    }

    @Test
    public void kokeileLukuYksi() {
        assertEquals(lista(), Alkuluvut.luo(1));
    }
    
    @Test
    public void kokeileLukuKaksi() {
        assertEquals(lista(2), Alkuluvut.luo(2));
    }
    
    @Test
    public void kokeileLukuKolme() {
        assertEquals(lista(3), Alkuluvut.luo(3));
    }
    
    @Test
    public void kokeileLukuNelja() {
        assertEquals(lista(2, 2), Alkuluvut.luo(4));
    }
    
    @Test
    public void kokeileLukuViisi() {
        assertEquals(lista(5), Alkuluvut.luo(5));
    }
    
    @Test
    public void kokeileLukuKuusi() {
        assertEquals(lista(2, 3), Alkuluvut.luo(6));
    }
    
    @Test
    public void kokeileLukuSeitseman() {
        assertEquals(lista(7), Alkuluvut.luo(7));
    }
    
    @Test
    public void kokeileLukuKahdeksan() {
        assertEquals(lista(2,2,2), Alkuluvut.luo(8));
    }
    
    @Test
    public void kokeileLukuYhdeksan() {
        assertEquals(lista(3,3), Alkuluvut.luo(9));
    }
    
    @Test
    public void kokeileLukuKymmenen() {
        assertEquals(lista(2,5), Alkuluvut.luo(10));
    }
    
     @Test
    public void kokeileLukuKaksitoista() {
        assertEquals(lista(2, 2, 3), Alkuluvut.luo(12));
    }
     
    @Test
    public void kokeileLukuSata() {
        assertEquals(lista(2, 2, 5, 5), Alkuluvut.luo(100));
    }
      
    @Test
    public void kokeileLuku1024() {
        assertEquals(lista(2,2,2,2,2,2,2,2,2,2), Alkuluvut.luo(1024));
    }
    
    @Test
    public void kokeileLuku123456789() {
        assertEquals(lista(3,3,3607,3803), Alkuluvut.luo(123456789));
    }
    
    
    
    
    
    
    
    
    
    
    private ArrayList<Integer> lista(int... luvut) {
        ArrayList<Integer> alkuluvut = new ArrayList<Integer>();
        for (int luku : luvut) {
            alkuluvut.add(luku);
        }
        return alkuluvut;
    }
}