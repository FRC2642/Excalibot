package org.usfirst.frc.team2642.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;
import org.usfirst.frc.team2642.robot.RobotMap;
import org.usfirst.frc.team2642.robot.commands.ArcadeDrive;

/**
 *
 */
public class DriveTrain extends Subsystem {
	RobotDrive mydrive = new RobotDrive(RobotMap.frontleft, RobotMap.rearleft, RobotMap.frontright, RobotMap.rearright);
	
	public void drive(double y, double x){
		mydrive.arcadeDrive(-y, -x);
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new ArcadeDrive());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

