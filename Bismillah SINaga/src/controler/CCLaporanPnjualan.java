/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.VHome;
import view.VLaporanPnjualan;
/**
 *
 * @author Danu
 */
public class CCLaporanPnjualan {
    
    VLaporanPnjualan lapjual;
    
    public CCLaporanPnjualan(VLaporanPnjualan lapjual){
        this.lapjual=lapjual;
        this.lapjual.setVisible(true);
        this.lapjual.back_action(new back());
    }
    private class back implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            new CHome(new VHome());
            lapjual.dispose();             
        }
    }
}
