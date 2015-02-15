// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team4930.robot;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainPWM0;
    public static SpeedController driveTrainPWM1;
    public static SpeedController driveTrainPWM8;
    public static SpeedController driveTrainPWM9;
    public static RobotDrive driveTrainRobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainPWM0 = new TalonSRX(0);
        LiveWindow.addActuator("DriveTrain", "PWM0", (TalonSRX) driveTrainPWM0);
        
        driveTrainPWM1 = new TalonSRX(1);
        LiveWindow.addActuator("DriveTrain", "PWM1", (TalonSRX) driveTrainPWM1);
        
        driveTrainPWM8 = new TalonSRX(8);
        LiveWindow.addActuator("DriveTrain", "PWM8", (TalonSRX) driveTrainPWM8);
        
        driveTrainPWM9 = new TalonSRX(9);
        LiveWindow.addActuator("DriveTrain", "PWM9", (TalonSRX) driveTrainPWM9);
        
        driveTrainRobotDrive = new RobotDrive(driveTrainPWM0, driveTrainPWM1,
              driveTrainPWM8, driveTrainPWM9);
        
        driveTrainRobotDrive.setSafetyEnabled(true);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(1.0);
        driveTrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        driveTrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        driveTrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        driveTrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
