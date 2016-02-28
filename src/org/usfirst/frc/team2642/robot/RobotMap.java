package org.usfirst.frc.team2642.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static int frontleft = 0, rearleft = 1, frontright = 2, rearright = 3;	//Drive
	public static int intakeleft = 4, intakeright = 5, kicker = 6;					//Shooter
	public static int roller = 9;													//Roller
	public static int cammount = 11;
	public static int bigArmWinch = 0;
	public static int bigArmExtend = 10;
	public static int btnBigArmExtend = 11;
	public static int btnBigArmRetract = 10;

	/***************************************************/
	public static int btnShooterTurretUp = 2;
	public static int btnShooterTurretDown = 3;
	//public static int btnRollerArmUp = 5;
	//public static int btnRollerArmDown = 4;
	
	public static int rollerArmMotor = 8;
	public static int rollerArmPot = 1;
	public static int rollerArmUpperLimitSwitch = 3;
	public static int rollerArmLowerLimitSwitch = 2;
	public static double rollerArmMotorSpeed = .7;
	public static int shootermotor = 7;
	public static int shooterpot = 0;
	/****************************************************/
	
	
 
	
	
}
	// For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;

