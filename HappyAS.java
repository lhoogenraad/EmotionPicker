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
import java.awt.Font;

/**
 *
 * @author The Gibbon
 */
public class HappyAS  extends JPanel implements ActionScreen    {
    private static JFrame frame, endFrame = new JFrame();
    Border bl = BorderFactory.createLineBorder(Color.black);
    public HappyAS(JFrame parentFrame) {

        frame = parentFrame;
        String title = "I am happy, so I want to...";
	    JLabel titleLabel = new JLabel(title);
	    titleLabel.setPreferredSize(new Dimension(780, 50));
	    titleLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        add(titleLabel);
        ArrayList<JLabel> labels = new ArrayList<>();

        labels.add(new JLabel("Chat"));
        labels.add(new JLabel("Play"));
        labels.add(new JLabel("Go for a walk"));
        labels.add(new JLabel("Do some baking"));

        for (int i = 0; i < labels.size(); i++) {
            JLabel label = labels.get(i);
	    
            label.setPreferredSize(new Dimension(350, 100));
            label.setBorder(bl);
	        label.setFont(new Font("Serif", Font.PLAIN, 15));
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
                endFrame.getContentPane().add(new EndScreen("happy", labelText));
                endFrame.setVisible(true);
            }
        });
        
    }
}
