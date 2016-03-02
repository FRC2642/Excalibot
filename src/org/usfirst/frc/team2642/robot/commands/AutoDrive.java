package org.usfirst.frc.team2642.robot.commands;

import org.usfirst.frc.team2642.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team2642.robot.subsystems.EncoderSubsystem;

/**
 *
 */
public class AutoDrive extends Command {
	double x;
	double y;
	double encoderDistance;
    public AutoDrive(double They, double Thex, double Distance) {
    	x = Thex;
    	y = They;
    	requires(Robot.theEncoder);
    	requires(Robot.drivetrain);
    	encoderDistance = Distance;
    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute () {
    	if(this.isFinished() != true){
    		Robot.drivetrain.drive(x,y);
    	}else{
    		Robot.theEncoder.resetEncoders();
    		this.end();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    //ifFinished() tells if the encoder has gone to its given value from above.
    protected boolean isFinished() {
    	boolean isGoingStraight;
    	boolean finished;
    	if(x == 0 && y > 0){
    		if(Robot.theEncoder.getRightDistanceTraveled() >= encoderDistance && Robot.theEncoder.getLeftDistanceTraveled()
    			>= encoderDistance){
    		finished = true;
    		}else{
    		finished = false;
    		}
    	}else if(x > 0 && y == 0){//This may need to be changed to x<0 if left and right are switched
    		if(Robot.theEncoder.getLeftDistanceTraveled() >= encoderDistance){
    		finished = true;}
    		else{
    			finished = false;
    		}
    	}else if(x<0 && y == 0){//This may need to be changed to x>0 if left and right are switched
    		if(Robot.theEncoder.getRightDistanceTraveled() >= encoderDistance){
    			finished = true;
    		}else{
    			finished = false;
    		}
    	}else{
    		finished = true;
    	}
    	return finished;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.drive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
