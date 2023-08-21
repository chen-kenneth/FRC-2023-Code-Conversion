package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ElevatorSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public Elevator() {
    final CANSparkMax m_leftElevator = new CANSparkMax(1, MotorType.kBrushless);
    final CANSparkMax m_rightElevator = new CANSparkMax(2, MotorType.kBrushless);
    final MotorControllerGroup m_elevator = new MotorControllerGroup(m_leftElevator, m_rightElevator);
    final RelativeEncoder m_elevatorEncoder = m_rightElevator.getEncoder();
    final DigitalInput toplimitswitch = new DigitialInput(0);

    private final Timer elevatortimer = new Timer();
  }

  @Override
  public void robotInit() {
      m_rightElevator.setInverted(true);
  }

  public void elevatorStop() {
      m_elevator.set;
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
