
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
	
		//3. Set the pen width to 10
		rob.penDown();
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String answer =JOptionPane.showInputDialog("What color pen would you like the robot to draw with?");
		
		//5. Use an if/else statement to set the pen color that the user requested
		if (answer.equals("red"))
		{
			rob.setPenColor(Color.red);
		}
		else if (answer.equals("yellow"))
		{
			rob.setPenColor(Color.yellow);
		}
		else if (answer.equals("orange"))
		{
			rob.setPenColor(Color.orange);
		}
		else if (answer.equals("green"))
		{
			rob.setPenColor(Color.green);
		}
		else if (answer.equals("blue"))
		{
			rob.setPenColor(Color.blue);
		}
		else if (answer.equals("pink"))
		{
			rob.setPenColor(Color.pink);
		}
		else {
			rob.setRandomPenColor();
		}
        //6. If the user doesn't enter anything, choose a random color
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		for (int i = 0; i < 4; i++) {
			rob.setSpeed(20);
			rob.move(200);
			rob.turn(90);
		}

		



	}
}
