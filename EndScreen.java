import javax.swing.*;
import java.awt.*;

/**
 *
 * @author The Gibbon
 */
public class EndScreen extends JPanel{
    public EndScreen(String emotion, String action){
        String finalString = "I am " + emotion + ", so I want to " + action.toLowerCase();
        JLabel finalLabel = new JLabel(finalString);
        finalLabel.setPreferredSize(new Dimension(780, 500));
	finalLabel.setFont(new Font("Serif", Font.PLAIN, 35));
        add(finalLabel);
    }
}
