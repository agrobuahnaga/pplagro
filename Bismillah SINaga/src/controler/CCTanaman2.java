/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.VCTanaman1;
import view.VCTanaman2;
import view.VCTanaman3;

/**
 *
 * @author Danu
 */
public class CCTanaman2 {
    
    VCTanaman2 CTanaman2;
    
    public CCTanaman2(VCTanaman2 CTanaman){
        this.CTanaman2=CTanaman;
        this.CTanaman2.setVisible(true);
        this.CTanaman2.back_action(new back());
        this.CTanaman2.tdksehat_action(new tdksehat());
        
    }
    
    private class back implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            new CCTanaman1(new VCTanaman1());
            CTanaman2.dispose();             
        }
    }
    
    private class tdksehat implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            new CCTanaman3(new VCTanaman3());
            CTanaman2.dispose();             
        }
    }
    
    
}
