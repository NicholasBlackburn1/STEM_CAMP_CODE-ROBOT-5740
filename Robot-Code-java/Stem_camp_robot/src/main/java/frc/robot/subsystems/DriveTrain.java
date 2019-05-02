package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.*;

public class DriveTrain{
    // Inits --> Drive system
public  static void Init(){
    // Controls speed of Left Motor Group
    final SpeedControllerGroup leftDriveGroup = new SpeedControllerGroup( OI.leftCenterDriveMotor, OI.leftBackDriveMotor, OI.leftFrontDriveMotor);
    // Controls speed of Right Motor Group
    final SpeedControllerGroup rightDriveGroup = new SpeedControllerGroup(OI.rightFrontDriveMotor, OI.rightCenterDriveMotor,OI.rightBackDriveMotor);
     // Sets Drive train Type to Differential Drive --> tank drive
    final DifferentialDrive drive = new DifferentialDrive(leftDriveGroup, rightDriveGroup);
    }
  
}