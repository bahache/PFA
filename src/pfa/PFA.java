/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pfa;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
/**
 *
 * @author Compaq
 */
public class PFA extends SingleFrameApplication{
/**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
 //       show(new GererView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of Gerer_Application
     */
    public static PFA getApplication() {
        return Application.getInstance(PFA.class);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        launch(PFA.class, args);
    }
    
}
