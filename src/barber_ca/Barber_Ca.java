/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barber_ca;

import views.Frame;
import views.client.Barber.Barberpanel;
import views.client.clientPanel;
import views.loginComponents.LoginPanel;

/**
 *
 * @author User
 */
public class Barber_Ca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//     LoginPanel loginPanel = new LoginPanel();
//      clientPanel ClientPanel = new clientPanel();
      //  Frame mywindowFrame = new Frame( 300, 400, loginPanel);
        // Frame mywindowFrame = new Frame( 300, 400, ClientPanel);
//       
          Barberpanel barberPanel = new Barberpanel();
         Frame mywindowFrame = new Frame( 400, 400, barberPanel);
//        
        // TODO code application losyougic here

        
    }   
    
}
