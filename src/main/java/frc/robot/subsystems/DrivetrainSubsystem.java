package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Joystick;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Encoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class DrivetrainSubsystem extends SubsystemBase {
    private final WPI_VictorSPX FRONT_LEFT = new WPI_VictorSPX(4);
    private final WPI_VictorSPX FRONT_RIGHT = new WPI_VictorSPX(6);
    private final WPI_VictorSPX BACK_LEFT = new WPI_VictorSPX(12);
    private final WPI_VictorSPX BACK_RIGHT = new WPI_VictorSPX(5);
    private final WPI_VictorSPX ROTATION = new WPI_VictorSPX(13);
    private final MotorControllerGroup LEFT_DRIVE = new MotorControllerGroup(FRONT_LEFT, BACK_LEFT);
    private final MotorControllerGroup RIGHT_DRIVE = new MotorControllerGroup(FRONT_RIGHT, BACK_RIGHT);
    private final DifferentialDrive ROBOT_DRIVE = new DifferentialDrive(LEFT_DRIVE, RIGHT_DRIVE);
    private final Encoder encoderA = new Encoder(1, 2);

    private final double SLOW_SPEED = 0.5;
    private final double SLOW_TURN = 0.8;


  /** Creates a new Drivetrain Subsystem. */
  public Drivetrain() {

  }

  public void engageAuto() {
        while (encoderA.getDistance()>-1240) {
            ROBOT_DRIVE.arcadeDrive(0.65, 0.0);
          }
        ROBOT_DRIVE.arcadeDrive(0.55, 0.0);
          }
          else {
            ROBOT_DRIVE.arcadeDrive(0.0, 0.0);
            timer.reset();
            autoCounter++;
          }
        }
    
  }

  public void drive(double speed, double rotation) {
      ROBOT_DRIVE.arcadeDrive(speed, rotation)
  }

  public void slowDrive(double speed, double rotation) {
      ROBOT_DRIVE.arcadeDrive(speed * SLOW_SPEED, rotation * SLOW_TURN)
  }

  public void stop() {
      ROBOT_DRIVE.arcadeDrive(0,0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
