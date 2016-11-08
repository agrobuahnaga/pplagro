/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.VCekpupuk;
import view.VCekpupuk1;
/**
 *
 * @author Danu
 */
public class CCekpupuk1 {
    
    VCekpupuk1 cekpupuk1;
    
    public CCekpupuk1(VCekpupuk1 cekpupuk1){
        this.cekpupuk1=cekpupuk1;
        this.cekpupuk1.setVisible(true);
        this.cekpupuk1.back_action(new back());
    }
    
    private class back implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            new CCekpupuk(new VCekpupuk());
            cekpupuk1.dispose();             
        }
    }
    
}
