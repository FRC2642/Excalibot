package org.usfirst.frc.team2642.robot.subsystems;

import org.usfirst.frc.team2642.robot.RobotMap;
import org.usfirst.frc.team2642.robot.commands.StopArm;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArmExtender extends Subsystem {
	Talon armextend = new Talon(RobotMap.bigArmExtend);
	
	public void armExtend(){
		armextend.set(.5);
		}
	public void armRetract(){
		armextend.set(-.5);
		}
	public void armIdle(){
		armextend.set(0);	
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new StopArm());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

