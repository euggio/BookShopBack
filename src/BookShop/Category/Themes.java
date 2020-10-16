/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookShop.Category;

import java.util.Vector;

/**
 *
 * @author bolem
 */
public class Themes {

    public Themes(String themeLabel) {
        this.themeLabel = themeLabel;
    }

    public String getThemeLabel() {
        return themeLabel;
    }
    
    public Vector getVector() {
        Vector v = new Vector();
            v.add(themeLabel);  
            return v;
    }
    
    private String themeLabel;
}
