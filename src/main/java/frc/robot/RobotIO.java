/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * Add your docs here.
 */
public class RobotIO {
    public static CANSparkMax leftMotor1 = new CANSparkMax(RobotSettings.LEFT_MOTOR_1_ID, MotorType.kBrushless);
    public static CANSparkMax leftMotor2 = new CANSparkMax(RobotSettings.LEFT_MOTOR_2_ID, MotorType.kBrushless);
    public static CANSparkMax leftMotor3 = new CANSparkMax(RobotSettings.LEFT_MOTOR_3_ID, MotorType.kBrushless);
    public static CANSparkMax rightMotor1 = new CANSparkMax(RobotSettings.RIGHT_MOTOR_1_ID, MotorType.kBrushless);
    public static CANSparkMax rightMotor2 = new CANSparkMax(RobotSettings.RIGHT_MOTOR_2_ID, MotorType.kBrushless);
    public static CANSparkMax rightMotor3 = new CANSparkMax(RobotSettings.RIGHT_MOTOR_3_ID, MotorType.kBrushless);
    public static Encoder leftEncoder = new Encoder(RobotSettings.LEFT_ENCODER_ID_A, RobotSettings.LEFT_ENCODER_ID_B);
    public static Encoder rightEncoder = new Encoder(RobotSettings.RIGHT_ENCODER_ID_A, RobotSettings.RIGHT_ENCODER_ID_B);
    public static Joystick driverStick = new Joystick(RobotSettings.DRIVER_STICK_ID);
    public static DifferentialDrive difDrive = new DifferentialDrive(leftMotor1, rightMotor2);

}
