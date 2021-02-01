package _02_loop_variables._4_99_bottles.bottles;

import javax.swing.JOptionPane;

public class MilkOnTheWall {
public static void main(String[] args) {
	for (int i = 100; i > 1; i--) {
		System.out.println(i + " bottles of milk on the wall " + i + " bottles of milk, take one down, pass it around, " + (i-1) + " bottles of milk on the wall.");
	}	
}
}
