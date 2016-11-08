/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.VHome;
import view.VPanen;

/**
 *
 * @author Danu
 */
public class CPanen {
    
    VPanen panen;
    
    public CPanen(VPanen panen){
        this.panen=panen;
        this.panen.setVisible(true);
        this.panen.back_action(new back());
    }
    
    private class back implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            new CHome(new VHome());
            panen.dispose();             
        }
    }
}
