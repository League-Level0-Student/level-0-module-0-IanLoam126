import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String args[]) {
		Robot draw = new Robot();
		draw.setSpeed(10);
		draw.moveTo(100,100);
		draw.setPenColor(255, 0, 0);
		draw.penDown();
		draw.move(50);
		draw.moveTo(50, 50);
		draw.turn(90);
		draw.move(100);
		draw.moveTo(50, 100);
		draw.move(100);
		draw.moveTo(180, 100);
		draw.turn(275);
		draw.move(50);
		draw.turn(150);
		draw.move(50);
		draw.turn(180);
		draw.move(25);
		draw.turn(270);
		draw.move(15);
		draw.moveTo(230, 100);
		draw.turn(-250);
		draw.move(50);
		draw.turn(135);
		draw.move(50);
		draw.turn(225);
		draw.move(50);
		draw.moveTo(230, 1000);
		
		
	}
}
