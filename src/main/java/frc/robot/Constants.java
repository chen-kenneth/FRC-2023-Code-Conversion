// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    int state=0;
    int debounceCount=0;
    double onChargeStationDegree = 13.0;
    double debounceTime = 0.2;
    double robotSpeedSlow=0.325;
    double robotSpeedFast=0.65;
    double levelDegree=6.0;
    boolean toggle = false;
    boolean up = false;
    boolean down = false;
    int autoCounter=0;
    final double kp=0.01;
    final double ki=0.00;
    final double iLimit = 2;
    final double kd=0.00;
    double dt = 0.0;
    double sensorposition = 0.0;
    double error = 0.0;
    double errorSum = 0.0;
    double errorRate = 0.0;
    double lasterror = 0.0;
    double lastTimestamp = 0.0;
    double lastpitch = 0.0;
    boolean mid = false;
    double slowdrive = 1.0;
    double slowturn = 1.0;
    double high = -219;
    double middle = -116;
    int angle = 5;
    boolean turn = false;
    boolean align = false;
    double turnsetpoint = 0.0;
    private static final String kDefaultAuto = "Cube + Engage";
    private static final String kCustomAuto = "Cube + Mobility";
    private static final String kCustomAuto1 = "Cone + Mobility";

    private String m_autoSelected;
    private final SendableChooser<String> m_chooser = new SendableChooser<>();

    private final Timer timer = new Timer();
    private final Timer intaketimer = new Timer();
    private final Timer elevatortimer = new Timer();



    final Joystick JOYSTICK = new Joystick(0);
    final Joystick JOYSTICK2 = new Joystick(1);


    final WPI_VictorSPX FRONT_LEFT = new WPI_VictorSPX(4);
    final WPI_VictorSPX FRONT_RIGHT = new WPI_VictorSPX(6);
    final WPI_VictorSPX BACK_LEFT = new WPI_VictorSPX(12);
    final WPI_VictorSPX BACK_RIGHT = new WPI_VictorSPX(5);
    final WPI_VictorSPX ROTATION = new WPI_VictorSPX(13);


    final MotorControllerGroup LEFT_DRIVE = new MotorControllerGroup(FRONT_LEFT, BACK_LEFT);
    final MotorControllerGroup RIGHT_DRIVE = new MotorControllerGroup(FRONT_RIGHT, BACK_RIGHT);
    final Encoder encoderA = new Encoder(1, 2);
    // final Encoder encoderB = new Encoder(2, 3);

    final DifferentialDrive ROBOT_DRIVE = new DifferentialDrive(LEFT_DRIVE, RIGHT_DRIVE);

    final CANSparkMax m_leftElevator = new CANSparkMax(1, MotorType.kBrushless);
    final CANSparkMax m_rightElevator = new CANSparkMax(2, MotorType.kBrushless);
    final CANSparkMax INTAKE = new CANSparkMax(3, MotorType.kBrushless);

    final RelativeEncoder m_elevatorEncoder = m_rightElevator.getEncoder();


    final MotorControllerGroup m_elevator = new MotorControllerGroup(m_leftElevator, m_rightElevator);
    final AHRS gyro = new AHRS(SPI.Port.kMXP);
    final DigitalInput toplimitswitch = new DigitalInput(0);
}
