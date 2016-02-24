package org.usfirst.frc.team2642.robot.commands;

import org.usfirst.frc.team2642.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Shoot extends Command {

    public Shoot() {
    	requires(Robot.intake);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.oi.xboxIntake.get() || Robot.oi.armIntake.get()){						//Intake
    		Robot.intake.shooter(-.65);	
    		Robot.intake.kick(false);
    	}else if(Robot.oi.xboxSpinUp.get() || Robot.oi.auxSpinUp.get()){				//Shoot	
    		Robot.intake.shooter(1);
    		if((Robot.oi.getxbox().getRawAxis(3) > .45) || Robot.oi.auxFire.get()){
    			Robot.intake.kick(true);
    		}else{
    			Robot.intake.kick(false);
    		}
    	}else if(Robot.oi.xboxRelease.get() || Robot.oi.auxSlow.get()){
    		Robot.intake.shooter(60);
    		if((Robot.oi.getxbox().getRawAxis(3) > .45) || Robot.oi.auxFire.get()){
    			Robot.intake.kick(true);
    		}else{
    			Robot.intake.kick(false);
    		}
    	}else{																			//Idle
    		Robot.intake.shooter(0);
    		Robot.intake.kick(false);
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
