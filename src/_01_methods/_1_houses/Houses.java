package _01_methods._1_houses;
import java.awt.Color;
import java.util.Random;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot robot = new Robot();

	public void run() {
		robot.setX(15);
		robot.setY(500);
		robot.setAngle(0);
		robot.setSpeed(5);
		robot.penDown();

		drawHouse("small", Color.MAGENTA);
		drawHouse("medium", Color.RED);
		drawHouse("small", Color.BLUE);
		drawHouse("large", Color.PINK);
		drawHouse("medium", Color.GREEN);
		drawHouse("small", Color.CYAN);
		drawHouse("large", Color.BLUE);
		drawHouse("small", Color.YELLOW);
		drawHouse("medium", Color.GREEN);
		
	}

	void drawHouse(String height, Color color) {
		int go = 0;
		if(height.equalsIgnoreCase("small")) {
			go = 60;
		} else if(height.equalsIgnoreCase("medium")) {
			go = 120;
		} else if(height.equalsIgnoreCase("large")) {
			go = 250;
		}

		robot.setPenColor(color);
		robot.move(go - 37);
		if(height.equalsIgnoreCase("large")) {
			drawFlatRoof();
		} else {
			drawPointyRoof();
		}
		
		robot.move(go - 37);
		robot.turn(-90);
		robot.setPenColor(52, 135, 0);
		robot.move(38);
		robot.turn(-90);
	}

	void drawFlatRoof() {
		robot.move(37);
		robot.turn(90);
		robot.move(37);
		robot.turn(90);
		robot.move(37);
	}

	void drawPointyRoof() {
		robot.turn(45);
		robot.move(27);
		robot.turn(90);
		robot.move(27);
		robot.turn(45);
	}
}
