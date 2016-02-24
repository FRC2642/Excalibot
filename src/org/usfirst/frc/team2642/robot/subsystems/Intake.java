package org.usfirst.frc.team2642.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team2642.robot.RobotMap;
import org.usfirst.frc.team2642.robot.commands.Shoot;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Talon;

/**
 *
 */
public class Intake extends Subsystem {
    Talon leftin = new Talon(RobotMap.intakeleft);
    Talon rightin = new Talon(RobotMap.intakeright);
    Servo kicker = new Servo(RobotMap.kicker);
    
    public void shooter(double speed){
    	leftin.set(speed);
    	rightin.set(-speed);
    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new Shoot());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
	public void kick(boolean whack) {
		if(whack){
    		kicker.set(0.45);
    	}else{
    		kicker.set(0);
    	}
		
	}
}

