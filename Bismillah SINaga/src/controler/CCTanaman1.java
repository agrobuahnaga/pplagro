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
import view.VHome;

/**
 *
 * @author Danu
 */
public class CCTanaman1 {
    VCTanaman1 CTanaman;
        
     public CCTanaman1(VCTanaman1 CTanaman){
        this.CTanaman=CTanaman;
        this.CTanaman.setVisible(true);
        this.CTanaman.back_action(new back());
        this.CTanaman.cek_action(new cek());
        
    }
     
     private class back implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            new CHome(new VHome());
            CTanaman.dispose();             
        }
    }
     
     private class cek implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            new CCTanaman2(new VCTanaman2());
            CTanaman.dispose();             
        }
    }
}
