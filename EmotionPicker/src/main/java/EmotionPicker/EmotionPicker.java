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
import EmotionPicker.ActionScreens.*;
import javax.swing.border.Border;

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
    private static JFrame actionFrame;

    public EmotionPicker() {
        Border bl = BorderFactory.createLineBorder(Color.black);
        // This is obviously a suboptimal way of doing this, but
        // I can't be bothered seperating this into another file (though i may)
        Image sadImg = getImage("resources/Images/sad.PNG").getScaledInstance(145, 185, Image.SCALE_DEFAULT);
        Image angryImg = getImage("resources/Images/angry.PNG").getScaledInstance(145, 185, Image.SCALE_DEFAULT);
        Image embarrassedImg = getImage("resources/Images/embarrassed.PNG").getScaledInstance(145, 185, Image.SCALE_DEFAULT);
        Image excitedImg = getImage("resources/Images/excited.PNG").getScaledInstance(145, 185, Image.SCALE_DEFAULT);
        Image happyImg = getImage("resources/Images/happy.PNG").getScaledInstance(145, 185, Image.SCALE_DEFAULT);
        Image hurtImg = getImage("resources/Images/hurt.PNG").getScaledInstance(145, 185, Image.SCALE_DEFAULT);
        Image scaredImg = getImage("resources/Images/scared.PNG").getScaledInstance(145, 185, Image.SCALE_DEFAULT);
        Image surprisedImg = getImage("resources/Images/surprised.PNG").getScaledInstance(145, 185, Image.SCALE_DEFAULT);
        Image worriedImg = getImage("resources/Images/worried.PNG").getScaledInstance(145, 185, Image.SCALE_DEFAULT);

        ImageIcon sadIcon = new ImageIcon(sadImg);
        ImageIcon angryIcon = new ImageIcon(angryImg);
        ImageIcon embarrassedIcon = new ImageIcon(embarrassedImg);
        ImageIcon excitedIcon = new ImageIcon(excitedImg);
        ImageIcon happyIcon = new ImageIcon(happyImg);
        ImageIcon hurtIcon = new ImageIcon(hurtImg);
        ImageIcon scaredIcon = new ImageIcon(scaredImg);
        ImageIcon surprisedIcon = new ImageIcon(surprisedImg);
        ImageIcon worriedIcon = new ImageIcon(worriedImg);

        JLabel sad = new JLabel();
        JLabel angry = new JLabel();
        JLabel embarrassed = new JLabel();
        JLabel excited = new JLabel();
        JLabel happy = new JLabel();
        JLabel hurt = new JLabel();
        JLabel scared = new JLabel();
        JLabel surprised = new JLabel();
        JLabel worried = new JLabel();

        sad.setIcon(sadIcon);
        angry.setIcon(angryIcon);
        embarrassed.setIcon(embarrassedIcon);
        excited.setIcon(excitedIcon);
        happy.setIcon(happyIcon);
        hurt.setIcon(hurtIcon);
        scared.setIcon(scaredIcon);
        surprised.setIcon(surprisedIcon);
        worried.setIcon(worriedIcon);

        add(sad);
        add(angry);
        add(embarrassed);
        add(excited);
        add(happy);
        add(hurt);
        add(scared);
        add(surprised);
        add(worried);

        addListener(sad, 1);
        addListener(angry, 2);
        addListener(embarrassed, 3);
        addListener(excited, 4);
        addListener(happy, 5);
        addListener(hurt, 6);
        addListener(scared, 7);
        addListener(surprised, 8);
        addListener(worried, 9);
        
        angry.setBorder(bl);
    }

    public static void main(String[] args) {
        frame = new JFrame();
        frame.getContentPane().add(new EmotionPicker());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(780, 500));
        frame.setVisible(true);

        actionFrame = new JFrame();
        actionFrame.setVisible(false);
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

    public static void addListener(JLabel label, int selector) {
        System.out.println("selector = " + selector);
        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("label clicked!");
                frame.dispose();
                
                switch(selector){
                    case 1:
                        actionFrame.getContentPane().add(new SadAS(actionFrame));
                        break;
                    case 2:
                        actionFrame.getContentPane().add(new AngryAS(actionFrame));
                        break;
                    case 3:
                        actionFrame.getContentPane().add(new EmbarrassedAS(actionFrame));
                        break;
                    case 4:
                        actionFrame.getContentPane().add(new ExcitedAS(actionFrame));
                        break;
                    case 5:
                        actionFrame.getContentPane().add(new HappyAS(actionFrame));
                        break;
                    case 6:
                        actionFrame.getContentPane().add(new HurtAS(actionFrame));
                        break;
                    case 7:
                        actionFrame.getContentPane().add(new ScaredAS(actionFrame));
                        break;
                    case 8:
                        actionFrame.getContentPane().add(new SurprisedAS(actionFrame));
                        break;
                    case 9:
                        actionFrame.getContentPane().add(new WorriedAS(actionFrame));
                        break;
                    default:
                        System.out.println("uh oh, something went horribly wrong\nSelector = " + selector);
                        System.exit(ERROR);
                        break;
                }
                
                actionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                actionFrame.setSize(780, 500);
                actionFrame.setVisible(true);
            }
        });
    }
}
