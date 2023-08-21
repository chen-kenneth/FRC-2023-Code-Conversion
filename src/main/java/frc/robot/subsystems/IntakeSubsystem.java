package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    private final CANSparkMax INTAKE = new CANSparkMax(3, MotorType.kBrushless);
    private final Timer elevatortimer = new Timer();

    private final double INTAKE_CONE_STALL_VAL = -0.2;
    private final double INTAKE_CUBE_IN_VAL = 0.4;
    private final double INTAKE_CUBE_OUT_VAL = -0.5;
    private final double INTAKE_CUBE_STALL_VAL = 0.2;
  /** Creates a new ExampleSubsystem. */
    public Intake() {
    }

    public void intakeConeStall() {
        INTAKE.set(INTAKE_CONE_STALL_VAL);
    }

    public void intakeCubeIn() {
        INTAKE.set(INTAKE_CUBE_IN_VAL);
    }

    public void intakeCubeOut() {
        INTAKE.set(INTAKE_CUBE_OUT_VAL);
    }

    public void intakeCubeStall() {
        INTAKE.set(INTAKE_CUBE_STALL_VAL);
    }

    public void intakeOn(double speed) {
      INTAKE.set(speed);
    }
    
    public void intakeOff() {
      INTAKE.set(0.0);
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


