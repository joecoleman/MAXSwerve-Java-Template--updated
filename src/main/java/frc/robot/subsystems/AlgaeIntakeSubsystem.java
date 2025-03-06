package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class AlgaeIntakeSubsystem extends SubsystemBase {
    private final SparkMax intakeMotor1;
    private final SparkMax intakeMotor2;

    public AlgaeIntakeSubsystem(int operatorControllerPort) {
        intakeMotor1 = new SparkMax(17, MotorType.kBrushless); // CAN ID 17
        intakeMotor2 = new SparkMax(27, MotorType.kBrushless); // CAN ID 27
    }

    @Override
    public void periodic() {
    }

    public void intake(double speed) {
        intakeMotor1.set(speed); // Set motor 1 to intake
        intakeMotor2.set(-speed); // Set motor 2 to intake in opposite direction
    }

    public void eject() {
        intakeMotor1.set(-1.0); // Set motor 1 to eject
        intakeMotor2.set(1.0); // Set motor 2 to eject in opposite direction
    }

    public void stop() {
        intakeMotor1.set(0); // Stop motor 1
        intakeMotor2.set(0); // Stop motor 2
    }
}