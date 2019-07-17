/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
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
    public static Joystick driverStick = new Joystick(RobotSettings.DRIVER_STICK_PORT);
    public static Joystick operatorStickBall = new Joystick(RobotSettings.BALL_STICK_PORT);
    public static Joystick operatorStickHatch = new Joystick(RobotSettings.HATCH_STICK_PORT);
    public static DifferentialDrive difDrive = new DifferentialDrive(leftMotor1, rightMotor2);
    public static DoubleSolenoid frontSolenoid = new DoubleSolenoid(RobotSettings.FRONT_CLIMBER_SOLENOID_FORWARD_ID, RobotSettings.FRONT_CLIMBER_SOLENOID_REVERSE_ID);
    public static DoubleSolenoid backSolenoid = new DoubleSolenoid(RobotSettings.BACK_CLIMBER_SOLENOID_FORWARD_ID, RobotSettings.BACK_CLIMBER_SOLENOID_REVERSE_ID);
    public static JoystickButton driveButton1 = new JoystickButton(driverStick, RobotSettings.DRIVERSTICK_BUTTON_1_ID);
    public static JoystickButton driveButton2 = new JoystickButton(driverStick, RobotSettings.DRIVERSTICK_BUTTON_2_ID);
    public static JoystickButton driveButton3 = new JoystickButton(driverStick, RobotSettings.DRIVERSTICK_BUTTON_3_ID);
    public static JoystickButton driveButton4 = new JoystickButton(driverStick, RobotSettings.DRIVERSTICK_BUTTON_4_ID);
    public static JoystickButton driveButton5 = new JoystickButton(driverStick, RobotSettings.DRIVERSTICK_BUTTON_5_ID);
    public static JoystickButton frontClimbButton = new JoystickButton(driverStick, RobotSettings.DRIVERSTICK_BUTTON_6_ID);
    public static JoystickButton backClimbButton = new JoystickButton(driverStick, RobotSettings.DRIVERSTICK_BUTTON_7_ID);
    public static JoystickButton driveButton8 = new JoystickButton(driverStick, RobotSettings.DRIVERSTICK_BUTTON_8_ID);
    public static JoystickButton driveButton9 = new JoystickButton(driverStick, RobotSettings.DRIVERSTICK_BUTTON_9_ID);
    public static JoystickButton driveButton10 = new JoystickButton(driverStick, RobotSettings.DRIVERSTICK_BUTTON_10_ID);
    public static JoystickButton driveButton11 = new JoystickButton(driverStick, RobotSettings.DRIVERSTICK_BUTTON_11_ID);
    public static JoystickButton ballStickButton1 = new JoystickButton(operatorStickBall, RobotSettings.BALLSTICK_BUTTON_1_ID);
    public static JoystickButton ballStickButton2 = new JoystickButton(operatorStickBall, RobotSettings.BALLSTICK_BUTTON_2_ID);
    public static JoystickButton ballStickButton3 = new JoystickButton(operatorStickBall, RobotSettings.BALLSTICK_BUTTON_3_ID);
    public static JoystickButton ballStickButton4 = new JoystickButton(operatorStickBall, RobotSettings.BALLSTICK_BUTTON_4_ID);
    public static JoystickButton ballStickButton5 = new JoystickButton(operatorStickBall, RobotSettings.BALLSTICK_BUTTON_5_ID);
    public static JoystickButton ballStickButton6 = new JoystickButton(operatorStickBall, RobotSettings.BALLSTICK_BUTTON_6_ID);
    public static JoystickButton ballStickButton7 = new JoystickButton(operatorStickBall, RobotSettings.BALLSTICK_BUTTON_7_ID);
    public static JoystickButton ballStickButton8 = new JoystickButton(operatorStickBall, RobotSettings.BALLSTICK_BUTTON_8_ID);
    public static JoystickButton ballStickButton9 = new JoystickButton(operatorStickBall, RobotSettings.BALLSTICK_BUTTON_9_ID);
    public static JoystickButton ballStickButton10 = new JoystickButton(operatorStickBall, RobotSettings.BALLSTICK_BUTTON_10_ID);
    public static JoystickButton ballStickButton11 = new JoystickButton(operatorStickBall, RobotSettings.BALLSTICK_BUTTON_11_ID);
    public static JoystickButton ballStickButton12 = new JoystickButton(operatorStickBall, RobotSettings.BALLSTICK_BUTTON_12_ID);
    public static JoystickButton hatchStickButton1 = new JoystickButton(operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_1_ID);
    public static JoystickButton hatchStickButton2 = new JoystickButton(operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_2_ID);
    public static JoystickButton hatchStickButton3 = new JoystickButton(operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_3_ID);
    public static JoystickButton hatchStickButton4 = new JoystickButton(operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_4_ID);
    public static JoystickButton hatchStickButton5 = new JoystickButton(operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_5_ID);
    public static JoystickButton hatchStickButton6 = new JoystickButton(operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_6_ID);
    public static JoystickButton hatchStickButton7 = new JoystickButton(operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_7_ID);
    public static JoystickButton hatchStickButton8 = new JoystickButton(operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_8_ID);
    public static JoystickButton hatchStickButton9 = new JoystickButton(operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_9_ID);
    public static JoystickButton hatchStickButton10 = new JoystickButton(operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_10_ID);
    public static JoystickButton hatchStickButton11 = new JoystickButton(operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_11_ID);
    public static JoystickButton hatchStickButton12 = new JoystickButton(operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_12_ID);
    



}
