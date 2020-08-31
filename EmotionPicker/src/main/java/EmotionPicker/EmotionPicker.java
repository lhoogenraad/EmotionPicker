package EmotionPicker;

import java.awt.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

// https://childhood101.com/helping-children-manage-big-emotions-printable-emotions-cards/
// Images were pulled from this website.
/**
 * An app designed for children to be able to easily describe their emotions,
 * and choose what they want to do about those emotions.
 *
 * @author Leon Hoogenraad, Dunedin, NZ, 2020
 */
public class EmotionPicker extends JPanel {
    
    private static JFrame frame;
    
    public EmotionPicker() {

        // JPanel panel = new JPanel();
        Image sadImg = getImage("resources/Images/sad.PNG");
        ImageIcon sadIcon = new ImageIcon(sadImg);

        JLabel sad = new JLabel();
        sad.setIcon(sadIcon);
        
        add(sad);
        addListener(sad);
    }

    public static void main(String[] args) {
        frame = new JFrame();
        frame.getContentPane().add(new EmotionPicker());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    public static Image getImage(String filepath) {
        Image picture = null;
        try {
            picture = ImageIO.read(new File(filepath));
        } catch (IOException e) {
            String workingDir = System.getProperty("user.dir");
            System.out.println("Current working directory : " + workingDir);
            e.printStackTrace();
        }
        return picture;
    }
    
    public static void addListener(JLabel label){
        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                System.out.println("label clicked!");
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
    }
}
