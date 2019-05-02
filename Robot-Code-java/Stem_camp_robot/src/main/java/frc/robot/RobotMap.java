/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // Defined pdp --> Can Id 
  public static int pdpCAN = 6;
  
  // Defined xbox Controller 1 --> port 0
  public static int controllerOnePort = 0;
  
  // Defined all TallonSrx Motor controllers --> Can Id's 4 - 15
  public static int leftFrontDriveCAN = 15; 
  public static int leftCenterDriveCAN = 11;
  public static int leftBackDriveCAN = 12;
  public static int rightFrontDriveCAN = 4;
  public static int rightCenterDriveCAN = 13;
  public static int rightBackDriveCAN = 14;

}
