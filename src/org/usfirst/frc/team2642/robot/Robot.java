
package org.usfirst.frc.team2642.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team2642.robot.commands.CornerShotAuto;
import org.usfirst.frc.team2642.robot.commands.LowBarOnlyAuto;
import org.usfirst.frc.team2642.robot.commands.LowBarShootAuto;
import org.usfirst.frc.team2642.robot.commands.PorticullusAuto;
import org.usfirst.frc.team2642.robot.commands.PowerDefense;
import org.usfirst.frc.team2642.robot.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static final DriveTrain drivetrain = new DriveTrain();
	public static final Intake intake = new Intake();
	public static final Roller roller = new Roller();
	public static final CameraMount cameramount = new CameraMount();
	public static final RollerArm rollerArm = new RollerArm();
	public static final ShooterAim shooteraim = new ShooterAim();
	public static final ArmExtender armextender = new ArmExtender();
	public static final ArmLifter armlifter = new ArmLifter();
	public static final Kicker kicker = new Kicker();
	public static final REncoder rEncoder = new REncoder();
	public static final LEncoder lEncoder = new LEncoder();
	
	public static OI oi;

    Command autonomousCommand;
    SendableChooser chooser;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
	}
	
	/**
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
     */
    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString code to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the chooser code above (like the commented example)
	 * or additional comparisons to the switch structure below with additional strings & commands.
	 */
    public void autonomousInit() {
       
//		"Power Over Defense":
    	if(oi.auto2.get()){
			autonomousCommand = new PowerDefense();
    	}
//		"Low Bar":
    	else if(oi.auto3.get()){
			autonomousCommand = new LowBarOnlyAuto();
    	}
//		"Corner Shot":
    	else if(oi.auto4.get()){
			autonomousCommand = new CornerShotAuto();
    	}
//		"Porticullus Auto":
    	else if(oi.auto5.get()){
			autonomousCommand = new PorticullusAuto();
    	}
//		"Low Bar & Shoot":
    	else if(oi.auto6.get()){
			autonomousCommand = new LowBarShootAuto();
    	}
//		"Do Nothing":
    	else{
    		autonomousCommand = null;
    	}
    	
    	// schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        //SmartDashboard.putNumber("Potentiometer", Robot.aimer.aimpot.get());
        }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
