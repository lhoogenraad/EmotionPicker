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
/**
 *
 * @author The Gibbon
 */
public class SadAS  extends JPanel implements ActionScreen {
    private static JFrame frame, endFrame = new JFrame();
    Border bl = BorderFactory.createLineBorder(Color.black);
    public SadAS(JFrame parentFrame) {

        frame = parentFrame;
        String title = "I am sad, so I want to...";
        add(new JLabel(title));
        ArrayList<JLabel> labels = new ArrayList<>();

        labels.add(new JLabel("a"));
        labels.add(new JLabel("b"));
        labels.add(new JLabel("c"));
        labels.add(new JLabel("d"));
        labels.add(new JLabel("e"));
        labels.add(new JLabel("f"));

        for (int i = 1; i < labels.size(); i++) {
            JLabel label = labels.get(i);
            label.setSize(new Dimension(100, 100));
            label.setBorder(bl);
            label.setForeground(Color.red);
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
                endFrame.getContentPane().add(new EndScreen("sad", labelText));
                endFrame.setVisible(true);
            }
        });
        
    }
}
