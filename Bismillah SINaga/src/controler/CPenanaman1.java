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
import view.VHome;


/**
 *
 * @author Danu
 */
public class CPenanaman1 {
    
    VPenanaman1 penanaman1;
    
    public CPenanaman1(VPenanaman1 penanaman1){
        this.penanaman1=penanaman1;
        this.penanaman1.setVisible(true);
        this.penanaman1.simpan_action(new simpan());
        this.penanaman1.back_action(new back());
    }

    private class simpan implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            new Cpenanaman2(new VPenanaman2());
            penanaman1.dispose();             
        }
    }
    
    private class back implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            new CHome(new VHome());
            penanaman1.dispose();             
        }
    }
     
    
}
