package org.usfirst.frc.team2642.robot.commands;

import org.usfirst.frc.team2642.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTwoEncoders extends Command {
	double forward, turn, distance;
    public DriveTwoEncoders(double forward, double turn, double distance) {
    	this.forward = forward;
    	this.turn = turn;
    	this.distance = distance;
    	requires(Robot.drivetrain);
    	requires(Robot.rEncoder);
    	requires(Robot.lEncoder);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.rEncoder.resetREncoder();
    	Robot.lEncoder.resetLEncoder();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.rEncoder.getREncoder() > (Robot.lEncoder.getLEncoder() + 1000)){
    		Robot.drivetrain.drive(forward, (turn - .05));
    	}else if(Robot.rEncoder.getREncoder() < (Robot.lEncoder.getLEncoder() - 1000)){
    		Robot.drivetrain.drive(forward, (turn + .05));
    	}else{
    		Robot.drivetrain.drive(forward,  turn);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if((Robot.rEncoder.getREncoder() >= distance) && (Robot.lEncoder.getLEncoder() >= distance)){
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
