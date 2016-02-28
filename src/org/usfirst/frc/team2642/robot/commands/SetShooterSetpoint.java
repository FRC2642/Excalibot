package org.usfirst.frc.team2642.robot.commands;

import org.usfirst.frc.team2642.robot.Robot;
import org.usfirst.frc.team2642.robot.subsystems.ShooterAim;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SetShooterSetpoint extends Command {
	double setPoint;
	
    public SetShooterSetpoint(double setPoint) {
    	this.setPoint = setPoint;
    	requires(Robot.shooteraim);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.shooteraim.setSetpoint(setPoint);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	if(Robot.oi.xboxA.get()){
//    		Robot.shooteraim.shooterset = -1000;
//    		Robot.shooteraim.setSetpoint(Robot.shooteraim.shooterset);
//    		Robot.shooteraim.enable();
//    	}else if(Robot.oi.xboxY.get()){
//    		Robot.shooteraim.shooterset = -5000;
//    		Robot.shooteraim.setSetpoint(Robot.shooteraim.shooterset);
//    		Robot.shooteraim.enable();
//    	}else if(Robot.oi.xboxB.get()){
//    		Robot.shooteraim.shooterset = -9;
//    		Robot.shooteraim.setSetpoint(Robot.shooteraim.shooterset);
//    		Robot.shooteraim.enable();
//    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return Math.abs(Robot.shooteraim.getSetpoint() - Robot.shooteraim.getPosition()) < 0.01;
    	
//        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
