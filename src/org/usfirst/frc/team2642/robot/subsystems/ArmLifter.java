package org.usfirst.frc.team2642.robot.subsystems;

import org.usfirst.frc.team2642.robot.RobotMap;
import org.usfirst.frc.team2642.robot.commands.ArmRotateOff;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArmLifter extends Subsystem {
	Relay armwinch = new Relay(RobotMap.bigArmWinch);
	
	public void forward(){
		armwinch.set(Relay.Value.kForward);
	}
	public void reverse(){
		armwinch.set(Relay.Value.kReverse);
	}
	public void off(){
		armwinch.set(Relay.Value.kOff);
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new ArmRotateOff());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

