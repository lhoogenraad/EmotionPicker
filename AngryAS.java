/**
 * This class will return
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Font;

/**
 *
 * @author The Gibbon
 */
public class AngryAS extends JPanel implements ActionScreen {

    private static JFrame frame, endFrame = new JFrame();
    private static Border bl = BorderFactory.createLineBorder(Color.black);
    
    
    
    public AngryAS(JFrame parentFrame) {        
        frame = parentFrame;
        String title = "I am angry, so I want to...";
	    JLabel titleLabel = new JLabel(title);
	    titleLabel.setPreferredSize(new Dimension(780, 50));
	    titleLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        add(titleLabel);
        ArrayList<JLabel> labels = new ArrayList<>();

        labels.add(new JLabel("Have some alone time"));
        labels.add(new JLabel("Go for a walk"));
        labels.add(new JLabel("Punch a pillow"));
        labels.add(new JLabel("Talk about what has made me angry"));

        for (int i = 0; i < labels.size(); i++) {
            JLabel label = labels.get(i);
	    
            label.setPreferredSize(new Dimension(250, 100));
            label.setBorder(bl);
	        label.setFont(new Font("Serif", Font.PLAIN, 25));
            addListener(label, i);
            add(label);
        }
        
        endFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        endFrame.setSize(780, 500);
        
    }

    
    public static void addListener(JLabel label, int selector){
        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                String labelText = label.getText();
                frame.dispose();
                endFrame.getContentPane().add(new EndScreen("angry", labelText));
                endFrame.setVisible(true);
            }
        });
        
    }
}
