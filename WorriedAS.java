import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.*;

/**
 *
 * @author The Gibbon
 */
public class WorriedAS  extends JPanel implements ActionScreen {
    private static JFrame frame, endFrame = new JFrame();
    Border bl = BorderFactory.createLineBorder(Color.black);
    public WorriedAS(JFrame parentFrame) {

        frame = parentFrame;
        String title = "I am worried, so I want to...";
	JLabel titleLabel = new JLabel(title);
	titleLabel.setPreferredSize(new Dimension(780, 50));
	titleLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        add(titleLabel);
        ArrayList<JLabel> labels = new ArrayList<>();

        labels.add(new JLabel("Have a chat"));
        labels.add(new JLabel("Go for a walk"));
        labels.add(new JLabel("Get a hug"));
        labels.add(new JLabel("Watch some TV"));
        labels.add(new JLabel("Get a snack"));

        for (int i = 1; i < labels.size(); i++) {
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
                endFrame.getContentPane().add(new EndScreen("worried", labelText));
                endFrame.setVisible(true);
            }
        });
        
    }
}