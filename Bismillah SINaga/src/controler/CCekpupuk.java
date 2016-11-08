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
import view.VHome;
/**
 *
 * @author Danu
 */
public class CCekpupuk {
    
    VCekpupuk cekpupuk;
    
    public CCekpupuk(VCekpupuk cekpupuk){
        this.cekpupuk=cekpupuk;
        this.cekpupuk.setVisible(true);
        this.cekpupuk.back_action(new back());
        this.cekpupuk.cek_action(new cek());
    }
    private class back implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            new CHome(new VHome());
            cekpupuk.dispose();             
        }
    }
    
    private class cek implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            new CCekpupuk1(new VCekpupuk1());
            cekpupuk.dispose();             
        }
    }
}
