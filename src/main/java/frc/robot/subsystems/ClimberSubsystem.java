package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ClimberSubsystem extends SubsystemBase {
    private final SparkMax climberMotor;

    public ClimberSubsystem(int motorPort, int controllerPort) {
        climberMotor = new SparkMax(13, MotorType.kBrushless); // CAN ID 13
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    public void climbUp() {
        climberMotor.set(1.0); // Set motor to full speed up
    }

    public void climbDown() {
        climberMotor.set(-1.0); // Set motor to full speed down
    }

    public void stopClimb() {
        climberMotor.set(0); // Stop the motor
    }
}