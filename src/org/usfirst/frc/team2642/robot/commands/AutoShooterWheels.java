package org.usfirst.frc.team2642.robot.commands;

import org.usfirst.frc.team2642.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoShooterWheels extends Command {
	double speed, time, timer;
    public AutoShooterWheels(double speed, double time) {
    	requires(Robot.intake);
    	this.speed = speed;
    	this.time = time;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	timer = 0;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.intake.shooter(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(timer > time){
    		return true;
    	}else{
    		timer++;
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
