/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import view.VHome;
import view.VPenanaman1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.VCTanaman1;
import view.VPanen;
import view.VCekpupuk;
import view.VLaporanPnjualan;



/**
 *
 * @author Danu
 */
public class CHome {
    
    VHome home;
    
    public CHome(VHome home){
        this.home=home;
        this.home.setVisible(true);
        this.home.penanamanbaru_action(new penanamanbaru());
        this.home.cektanaman_action(new cektanaman());
        this.home.panen_action(new panen());
        this.home.cekpupuk_action(new cekpupuk());
        this.home.lapjual_action(new lapjual());
    }
    
    private class penanamanbaru implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            new CPenanaman1(new VPenanaman1());
            home.dispose();
            
        }
        
    }
    
    private class cektanaman implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            new CCTanaman1(new VCTanaman1());
            home.dispose();
            
        }
        
    }
    
    private class panen implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            new CPanen(new VPanen());
            home.dispose();
            
        }
        
    }
    
    private class cekpupuk implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            new CCekpupuk(new VCekpupuk());
            home.dispose();
            
        }
        
    }
    
    private class lapjual implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            new CCLaporanPnjualan(new VLaporanPnjualan());
            home.dispose();
            
        }
        
    }
}
