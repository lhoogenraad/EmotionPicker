package EmotionPicker;

import java.awt.*;
import javax.swing.*;

// https://childhood101.com/helping-children-manage-big-emotions-printable-emotions-cards/
// Images were pulled from this website.
/**
 * An app designed for children to be able to easily describe their emotions,
 * and choose what they want to do about those emotions.
 *
 * @author Leon Hoogenraad, Dunedin, NZ, 2020
 */
public class EmotionPicker extends JPanel{
    
    public EmotionPicker(){
        
       // JPanel panel = new JPanel();
        
        JLabel sad = new JLabel("EEEE", JLabel.LEFT);
//        panel.setLayout(new FlowLayout());
//        panel.add(sad);
        add(sad);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new EmotionPicker());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
