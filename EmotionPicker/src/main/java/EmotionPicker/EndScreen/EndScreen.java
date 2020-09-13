/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmotionPicker.EndScreen;

import javax.swing.*;

/**
 *
 * @author The Gibbon
 */
public class EndScreen extends JPanel{
    public EndScreen(String emotion, String action){
        String finalString = "I am " + emotion + ", so I want to " + action;
        JLabel finalLabel = new JLabel(finalString);
        
        add(finalLabel);
    }
}
