package org.usfirst.frc.team2642.robot.commands;

import org.usfirst.frc.team2642.robot.RobotMap;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LowBarToCorner extends CommandGroup {
    
    public  LowBarToCorner() {
    	addSequential(new AutoDrive(.7, 0, 156));
    	addSequential(new AutoDrive(0, -.7, -24));
    	addParallel(new SetShooterSetpoint(RobotMap.shootercorner));
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
