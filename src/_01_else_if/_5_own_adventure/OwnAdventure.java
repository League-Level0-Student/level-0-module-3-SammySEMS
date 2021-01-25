package _01_else_if._5_own_adventure;

import java.lang.reflect.Method;

import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "The three little pigs....but with a twist");
	JOptionPane.showMessageDialog(null, "Once upon a time, there were three little pigs Bacon, Ham, and Spam.");
	JOptionPane.showMessageDialog(null, "These pigs decided they were old enough to go live in their own houses so they all moved out");
		
	String answer = JOptionPane.showInputDialog("Where did they go? The Forest? The Country Side? Or America?");
			
			if (answer.equalsIgnoreCase("America")){
				JOptionPane.showMessageDialog(null, "They went to America where they drank coke, ate pancakes and became really thicc. So they all had to go to the gym to work out...");
				String workout = JOptionPane.showInputDialog("What did they work do? Lifted wights or ran on the treadmill?");
			 if (workout.equalsIgnoreCase("treadmill")){
		JOptionPane.showMessageDialog(null, "They were really fast runners. In fact they were so proud they challenged to raced Sonic. Sonic won because they were not THAT FAST obviously . They no longer cared to go to the gym. In the end they went back to the pancake house to get thicc again. The End.");
	}
			 else if (workout.equalsIgnoreCase("weights")) {
				 JOptionPane.showMessageDialog(null, "The pigs lifted weights every single day. Eventually they became really buff. Then one day Bacon conviced his brothers how awesome it was eating pancakes all day. They stopped going to the gym and became thicc....but happy. The End");
			 }
			}
			else if (answer.equalsIgnoreCase("forest")) {
				JOptionPane.showMessageDialog(null, "The pigs remebered the story of their cousins (the other three little pigs) they remebered this is were the big bad wolf lived. Even though their cousins were smart to protect themselves, they knew they were not. So to protect them they...."); 
				String undercover = JOptionPane.showInputDialog("Became ninjas or becames spies?");
				if (undercover.equalsIgnoreCase("ninjas")) {
					JOptionPane.showMessageDialog(null, "They wore their most black outfits and snuck around the forest. They used their ninja skills to scare away the wolf. They lived peacfully in the forest with no harm done. The End");
				}
				else if(undercover.equalsIgnoreCase("spies")) {
					JOptionPane.showMessageDialog(null, "They stayed undercover and after a few weeks found out where their cousins lived. They ran over there and the entire pig family lived together, Bacom, Ham, Spam, Bob, Josh, and Joe. The End");
				}
			}
			else if (answer.equalsIgnoreCase("Country Side")) {
				JOptionPane.showMessageDialog(null, "They became friends with a farmer. They all played lots of video games like online obstacle courses. Ham and Spam loved this farmer except Bacon did not trust him.");
				String trust = JOptionPane.showInputDialog("Should he trust him?");
				if (trust.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Bacon let go of his suspicions and laid back, until the farmer came over trying to EAT them! Oh no! Luckily they were really good at obstacle courses and managed to escape the Evil farmer! Phew! The End");
				
				}
				else if (trust.equalsIgnoreCase("no")){
					JOptionPane.showMessageDialog(null, "Bacon spied on this farmer and turns out he was right! He was gonna eat them. Ohh that EVIL farmer! Bacon took his brothers and they ran away. They were safe, phew! The End");
				}
			
	
}
}}
