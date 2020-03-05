package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	//2. create an array of 5 robots.
	Robot [] robots;
	robots = new Robot[10];
	//3. use a for loop to initialize the robots.
	for(int i = 0; i<10; i++) {
		robots[i]= new Robot();
		//4. make each robot start at the bottom of the screen, side by side, facing up
		robots[i].setX((i*100)+100);
		robots[i].setY(500);
		robots[i].setAngle(0);
		robots[i].setSpeed(100);
	}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	Random randy = new Random();
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	boolean keepGoing = true;
	int winner = 0;
	while(keepGoing==true) {
		for(int i = 0; i<10; i ++) {
			robots[i].move(randy.nextInt(50));
		if(robots[i].getY()<=0) {
			keepGoing = false;
			winner = i+1;
			break;
		}
		}
	}
	//7. declare that robot the winner and throw it a party!
	System.out.println("The winner is robot #" + winner);
	//8. try different races with different amounts of robots.
	//9. make the robots race around a circular track.

}
}
