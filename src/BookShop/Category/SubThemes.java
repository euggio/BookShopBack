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
public class SubThemes {

    public SubThemes(String subThemeLabel) {
        this.subThemeLabel = subThemeLabel;
    }

    public String getThemeLabel() {
        return subThemeLabel;
    }
    
    public Vector getVector() {
        Vector v = new Vector();
            v.add(subThemeLabel);  
            return v;
    }
    
    private String subThemeLabel;
}
