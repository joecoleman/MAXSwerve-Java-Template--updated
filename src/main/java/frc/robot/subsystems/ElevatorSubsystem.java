package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class ElevatorSubsystem extends SubsystemBase {
    private final SparkMax elevatorMotor;

    public ElevatorSubsystem() {
        elevatorMotor = new SparkMax(14, MotorType.kBrushless); // CAN ID 14
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    public void moveUp(double speed) {
        elevatorMotor.set(speed); // Set motor to speed up
    }

    public void moveDown(double speed) {
        elevatorMotor.set(-speed); // Set motor to speed down
    }

    public void stop() {
        elevatorMotor.set(0); // Stop the motor
    }
}