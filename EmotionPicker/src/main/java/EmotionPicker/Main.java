package EmotionPicker;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * An app designed for children to be able to easily describe their emotions,
 * and choose what they want to do about those emotions.
 *
 * @author Leon Hoogenraad, Dunedin, NZ, 2020
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("gr");

        Frame uiFrame = new Frame();
        uiFrame.setSize(200, 200);

        Panel panel = new Panel();
        panel.setSize(150, 150);

        uiFrame.add(panel);
        uiFrame.setVisible(true);

        uiFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        }
        );
    }

}
