/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.VPenanaman1;
import view.VPenanaman2;

/**
 *
 * @author Danu
 */
public class Cpenanaman2 {
    
     VPenanaman2 penanaman2;
    
    public Cpenanaman2(VPenanaman2 penanaman2){
        this.penanaman2=penanaman2;
        this.penanaman2.setVisible(true);
        this.penanaman2.back_action(new back());
    }
    
    private class back implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            new CPenanaman1(new VPenanaman1());
            penanaman2.dispose();             
        }
    }
}
