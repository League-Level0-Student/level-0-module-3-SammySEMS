package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "The three little pigs....but with a twist");
	JOptionPane.showMessageDialog(null, "Once upon a time, there were three little pigs Bacon, Ham, and Spam.");
	JOptionPane.showMessageDialog(null, "These pigs decided to go live in their own houses so they all moved out");
		
	String answer = JOptionPane.showInputDialog("Where did they go? The Forest? The Country Side? Or America?");
			
			if (answer.equalsIgnoreCase("America")){
				JOptionPane.showMessageDialog(null, "They went to America where they drank coke and became really thicc. So they all had to go to the gym to work out...");
				String workout = JOptionPane.showInputDialog("What did they work on? treadmeel? weights? squats?");
	if workout.egualsIgnoreCase("Squats"){
		JOptionPane.showMessageDialog(null, "The tree little pigs had enough leg strenght to become national soccer players.They were the soccer pig trio! (People were like, Omg bacon! I'm your biggest fan!) The End.");
	}
	
			}
	
	
}
}
