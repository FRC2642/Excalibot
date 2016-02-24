package org.usfirst.frc.team2642.robot.subsystems;

import org.usfirst.frc.team2642.robot.RobotMap;
import org.usfirst.frc.team2642.robot.commands.MoveBigArm;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArmWinch extends Subsystem {
	Relay bigarmwinch = new Relay(RobotMap.bigArmWinch);
    
	public void raisearm(){
		bigarmwinch.set(Relay.Value.kForward);
	}
	public void lowerarm(){
		bigarmwinch.set(Relay.Value.kReverse);
	}
	public void idlearm(){
		bigarmwinch.set(Relay.Value.kOff);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new MoveBigArm());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

