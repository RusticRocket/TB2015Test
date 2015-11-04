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

    	if(autoLoopCounter < 275) //Check if we've completed 1000 loops (approximately 2 seconds)
		{
			autoLoopCounter++;
 
			if(autoLoopCounter > 1 && autoLoopCounter < 25){myRobot.drive(-0.1,0);}
			if(autoLoopCounter > 25 && autoLoopCounter < 50){myRobot.drive(-0.2,0);}
			if(autoLoopCounter > 50 && autoLoopCounter < 75){myRobot.drive(-0.3,0);}
			if(autoLoopCounter > 75 && autoLoopCounter < 100){myRobot.drive(-0.4,0);}
			if(autoLoopCounter > 100 && autoLoopCounter < 125){myRobot.drive(-0.5,0);}
			if(autoLoopCounter > 125 && autoLoopCounter < 150){myRobot.drive(-0.6,0);}
			if(autoLoopCounter > 150 && autoLoopCounter < 175){myRobot.drive(-0.5,0);
			if(autoLoopCounter > 175 && autoLoopCounter < 200){myRobot.drive(-0.4,0);}
			if(autoLoopCounter > 200 && autoLoopCounter < 225){myRobot.drive(-0.3,0);}
			if(autoLoopCounter > 225 && autoLoopCounter < 250){myRobot.drive(-0.2,0);}
			if(autoLoopCounter > 250 && autoLoopCounter < 275){myRobot.drive(-0.1,0);}
			}

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
        myRobot.arcadeDrive(0,0);
        if(stick.getRawButton(1)){myRobot.drive(0.2, 0);}
        if(stick.getRawButton(2)){myRobot.drive(0.5, 0);
        
        }
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	LiveWindow.run();
    }
    
}
//
