package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.*;

public class DriveTrain{
  // Inits --> Drive system
public void Init(){} 
  public static SpeedControllerGroup leftDriveGroup = new SpeedControllerGroup( OI.leftCenterDriveMotor, OI.leftBackDriveMotor, OI.leftFrontDriveMotor);
  public static SpeedControllerGroup rightDriveGroup = new SpeedControllerGroup(OI.rightFrontDriveMotor, OI.rightCenterDriveMotor,OI.rightBackDriveMotor);
  public static DifferentialDrive drive = new DifferentialDrive(leftDriveGroup, rightDriveGroup);
  
  
}