package org.usfirst.frc.team2642.robot.commands;

import org.usfirst.frc.team2642.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveOneEncoder extends Command {
	double forward, turn, distance;
    public DriveOneEncoder(double forward, double turn, double distance) {
    	this.forward = forward;
       	this.turn = turn;
       	this.distance = distance;
       	requires(Robot.drivetrain);
       	requires(Robot.rEncoder);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.rEncoder.resetREncoder();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.drive(forward, turn);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(distance >= Robot.rEncoder.getREncoder()){
        return true;
    	}else{
    		return false;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
