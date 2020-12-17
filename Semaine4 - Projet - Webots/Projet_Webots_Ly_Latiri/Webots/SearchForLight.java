/* Welcome to the search for light mission. */

import com.cyberbotics.webots.controller.Robot;
import com.cyberbotics.webots.controller.DistanceSensor;
import com.cyberbotics.webots.controller.LightSensor;
import com.cyberbotics.webots.controller.Motor;

public class SearchForLight {

	public static void main(String[] args) {
	
		Robot robot = new Robot();
		
		double MAX_SPEED = 6.28;
		
		int TIME_STEP = 64;
		
		DistanceSensor[] ps = new DistanceSensor[8];
		String[] psNames = new String[8];
		
		LightSensor[] ls = new LightSensor[8];
		String[] lsNames = new String[8];
			
		psNames[0] = "ps0";
		psNames[1] = "ps1";
		psNames[2] = "ps2";
		psNames[3] = "ps3";
		psNames[4] = "ps4";
		psNames[5] = "ps5";
		psNames[6] = "ps6";
		psNames[7] = "ps7";
		lsNames[0] = "ls0"; 
		lsNames[1] = "ls1"; 
		lsNames[2] = "ls2"; 
		lsNames[3] = "ls3"; 
		lsNames[4] = "ls4"; 
		lsNames[5] = "ls5"; 
		lsNames[6] = "ls6"; 
		lsNames[7] = "ls7"; 
		
		for (int i = 0; i < 8; i++) {
	        ps[i] = robot.getDistanceSensor(psNames[i]);
	        
	        
	        ps[i].enable(TIME_STEP);
	      
	        ls[i] = robot.getLightSensor(lsNames[i]);
	        ls[i].enable(TIME_STEP);
	    }
	    
		Motor leftMotor = robot.getMotor("left wheel motor");
	    	
	    Motor rightMotor = robot.getMotor("right wheel motor");   
		
		leftMotor.setPosition(Double.POSITIVE_INFINITY);
		rightMotor.setPosition(Double.POSITIVE_INFINITY);
		leftMotor.setVelocity(0.0);
		rightMotor.setVelocity(0.0);
		 
		while (robot.step(TIME_STEP) != -1) {
			double[] psValues = {0, 0, 0, 0, 0, 0, 0, 0};
		 	double[] lsValues = {0, 0, 0, 0, 0, 0, 0, 0};
		 	
		    for (int i = 0; i < 8 ; i++){
		        psValues[i] = ps[i].getValue();
		        lsValues[i] = ls[i].getValue();
		 	}
		 	
		 	boolean right_obstacle =
		        psValues[0] > 80.0 ||
		        psValues[1] > 80.0 ||
		        psValues[2] > 80.0;

	       	boolean left_obstacle =
		        psValues[5] > 80.0 ||
		        psValues[6] > 80.0 ||
		        psValues[7] > 80.0;

		    boolean right_light =
		        lsValues[0] < 80.0 ||
		        lsValues[1] < 80.0 ||
		        lsValues[2] < 80.0 ||
		        lsValues[3] < 80.0;

		    boolean left_light = 
 		        lsValues[4] < 80.0 ||
		        lsValues[5] < 80.0 ||
		        lsValues[6] < 80.0 ||
		        lsValues[7] < 80.0;

		    double leftSpeed  = 0.5 * MAX_SPEED;
    		double rightSpeed = 0.5 * MAX_SPEED;
    		
    		if (left_obstacle || right_obstacle){
		    	if (left_obstacle) {
			        /* turning right */
			        leftSpeed  = 0.5 * MAX_SPEED;
			        rightSpeed = -0.5 * MAX_SPEED;
		    	}else if (right_obstacle) {
		        	/* turning left */
			        leftSpeed  = -0.5 * MAX_SPEED;
			        rightSpeed = 0.5 * MAX_SPEED;
			    }
		    }else{
		    	if (left_light){
			  		/* turning left */
			        leftSpeed  = -0.5 * MAX_SPEED;
			        rightSpeed = 0.5 * MAX_SPEED;
			    }else if (right_light) {
			        //turn right
			        leftSpeed  = 0.5 * MAX_SPEED;
			        rightSpeed = -0.5 * MAX_SPEED;
			    }if (left_light && right_light) {
			        leftSpeed  = 0.5 * MAX_SPEED;
			        rightSpeed  = 0.5 * MAX_SPEED;
			    }
			}
		    leftMotor.setVelocity(leftSpeed);
    		rightMotor.setVelocity(rightSpeed);
		 }
	}
}