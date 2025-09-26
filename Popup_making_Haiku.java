/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.popup_making_haiku;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class Popup_making_Haiku {

    public static void main(String[] args) {
        
        //1ST DIALOGUE START
        int start = JOptionPane.showConfirmDialog(
            null,
            "We gon make haiku for ur crush, let’s go?",
            "Haiku Generator",
            JOptionPane.YES_NO_OPTION
        );
        
        //STOP PROGRAM
        if (start == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Alright, have a nice day!");
            return;
        } else if (start == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "Alright, have a nice day!");
            return;
        }
        //1ST DIALOGUE END
        
        //ASK NAME
        String name = JOptionPane.showInputDialog("Enter your name:");

        //2ND DIALOGUE START
        //ETO UNG LIST OPTION
        String[] categories = {"Sun", "Star", "Flower"};
        String choice = (String) JOptionPane.showInputDialog(
            null,
            "Where do you most likely associate them?",
            "Choose One",
            JOptionPane.QUESTION_MESSAGE,
            null,
            categories,
            categories[0]
        );
        //2ND DIALOGUE END
        
        String haiku = "";//DECLARE HAIKU

        //3RD DIALOGUES, DEPENDS ON 2ND DIALOGUE CHOICE
        switch (choice) {
            case "Sun":
                String quality = JOptionPane.showInputDialog("What is their brightest quality?");
                String feeling = JOptionPane.showInputDialog("What feeling do you get when you see it?");
                //premade template
                haiku = "Like the sun above,\n"
                      + "Your " + quality + " warms my spirit,\n"
                      + "I feel " + feeling + " rise.";
                break;

            case "Star":
                String dream = JOptionPane.showInputDialog("What dream of theirs inspires you?");
                String future = JOptionPane.showInputDialog("One word for how you see their future?");
                
                haiku = "A star lights the skies,\n"
                      + "Your dream of " + dream + " shines far,\n"
                      + "Future feels " + future + ".";
                break;

            case "Flower":
                String flower = JOptionPane.showInputDialog("What kind of flower reminds you of them?");
                String aura = JOptionPane.showInputDialog("One word to describe their aura?");
                
                haiku = "A " + flower + " blooms soft,\n"
                      + "Your aura feels like " + aura + ",\n"
                      + "Nature sings your name.";
                break;
        }//3RD DIALOGUE END

        //DISPLAY DIALOGUE
        JOptionPane.showMessageDialog(
            null,
            "Here’s your haiku, " + name + ":\n\n" + haiku,
            "Your Haiku",
            JOptionPane.PLAIN_MESSAGE
        );
    }
}
