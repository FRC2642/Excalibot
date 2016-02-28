package org.usfirst.frc.team2642.robot.commands;

import org.usfirst.frc.team2642.robot.OI;
import org.usfirst.frc.team2642.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ArcadeDrive extends Command {

    public ArcadeDrive() {
    	requires(Robot.drivetrain);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.oi.getxbox().getRawAxis(2) > .45){
    		Robot.drivetrain.drive(Robot.oi.getxbox().getRawAxis(1), Robot.oi.getxbox().getRawAxis(0));
    	}else{
    		Robot.drivetrain.drive(Robot.oi.getxbox().getRawAxis(1)*.7, Robot.oi.getxbox().getRawAxis(0)*.7);

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
