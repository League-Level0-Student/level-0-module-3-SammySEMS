package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		
	
	String answer = JOptionPane.showInputDialog("Are you Happy? Yes or No?");
	if (answer.equalsIgnoreCase("Yes")){
		JOptionPane.showMessageDialog(null, "Keep doing what your doing");
	}
	else if (answer.equalsIgnoreCase("No")) {
		String happy = JOptionPane.showInputDialog("Do you want to be happy?");
		if (happy.equalsIgnoreCase("No")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you doing.");	
		}
		else if (happy.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Change something, make your self happy!");;
		}
	}
	
}}
