
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tnylund1
 */
public class Alkuluvut {
    
    public static ArrayList<Integer> luo(int luku) {
        ArrayList<Integer> alkuluvut = new ArrayList<Integer>();
        
        for(int jakaja = 2; luku > 1; jakaja++)
            for(; luku % jakaja == 0; luku /= jakaja) 
                alkuluvut.add(jakaja);
        
        return alkuluvut;
    }
}
