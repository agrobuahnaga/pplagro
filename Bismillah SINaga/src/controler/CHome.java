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
    
}
