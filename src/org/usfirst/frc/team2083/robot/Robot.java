//GRIFFIN CHANGED THIS!!!!!!!1
package org.usfirst.frc.team2083.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	RobotDrive myRobot;
	Joystick stick;
	int autoLoopCounter;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	myRobot = new RobotDrive(0,1);
    	stick = new Joystick(0);
    }
    
    /**
     * This function is run once each time the robot enters autonomous mode
     */
    public void autonomousInit() {
    	autoLoopCounter = 0;
    	
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    	if(autoLoopCounter < 1000) //Check if we've completed 1000 loops (approximately 2 seconds)
		{
			autoLoopCounter++;
 
			if(autoLoopCounter > 1 && autoLoopCounter < 100){myRobot.drive(-0.1,0);}
			if(autoLoopCounter > 100 && autoLoopCounter < 200){myRobot.drive(-0.2,0);}
			if(autoLoopCounter > 200 && autoLoopCounter < 300){myRobot.drive(-0.3,0);}
			if(autoLoopCounter > 300 && autoLoopCounter < 400){myRobot.drive(-0.4,0);}
			if(autoLoopCounter > 400 && autoLoopCounter < 500){myRobot.drive(-0.5,0);}
			if(autoLoopCounter > 500 && autoLoopCounter < 600){myRobot.drive(-0.6,0);}
			if(autoLoopCounter > 600 && autoLoopCounter < 800){myRobot.drive(-0.7,0);}
			if(autoLoopCounter > 700 && autoLoopCounter < 1000){myRobot.drive(0,0);}


		}
    }
    
    /**
     * This function is called once each time the robot enters tele-operated mode
     */
    public void teleopInit(){
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	if(autoLoopCounter < 500) {
    	
    	autoLoopCounter++;
    
    	
   //     myRobot.arcadeDrive(stick);
    	if(autoLoopCounter >1 && autoLoopCounter <500){myRobot.arcadeDrive(0.1, 1);}

       
    	}
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	LiveWindow.run();
    }
    
}
