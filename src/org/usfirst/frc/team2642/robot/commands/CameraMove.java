package org.usfirst.frc.team2642.robot.commands;

import org.usfirst.frc.team2642.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CameraMove extends Command {

    public CameraMove() {
    	requires(Robot.cameramount);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.cameramount.cammount.get() > .95){
    		Robot.cameramount.aimcam(.94);
    	}else if(Robot.cameramount.cammount.get() < .05){
    		Robot.cameramount.aimcam(.06);
    	}else{
    		Robot.cameramount.aimcam(Robot.cameramount.setangle);
    		if((Robot.oi.getxbox().getPOV() >= 316) && (Robot.oi.getxbox().getPOV() <= 45)){
    			Robot.cameramount.setangle += .01;
    		}else if((Robot.oi.getxbox().getPOV() >= 135) && (Robot.oi.getxbox().getPOV() <= 225)){
    			Robot.cameramount.setangle -= .01;
    		}
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
