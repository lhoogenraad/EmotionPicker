package EmotionPicker;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

// https://childhood101.com/helping-children-manage-big-emotions-printable-emotions-cards/
// Images were pulled from this website.
/**
 * An app designed for children to be able to easily describe their emotions,
 * and choose what they want to do about those emotions.
 *
 * @author Leon Hoogenraad, Dunedin, NZ, 2020
 */
public class EmotionPicker extends Frame{
    private static Image img;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
    }
    
    private static Image getImageFromFile(String filename) {
        Image img = null;

        ImageIcon icon = new ImageIcon(filename);
        img = icon.getImage();
        return img;
    }
}
