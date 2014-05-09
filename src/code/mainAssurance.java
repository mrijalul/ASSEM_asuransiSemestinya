/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import javax.swing.JFrame;
import view.GUIAssurance;

/**
 *
 * @author BUNTORO
 */
public class mainAssurance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUIAssurance gui = new GUIAssurance();
        //gui.setExtendedState(gui.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        gui.setVisible(true);
    }
}
