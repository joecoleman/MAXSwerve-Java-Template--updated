package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;


public class AlgaeIntake extends SubsystemBase {
    private final SparkMax intakeMotor1;
    private final SparkMax intakeMotor2;

    public AlgaeIntake() {
        intakeMotor1 = new SparkMax(17, MotorType.kBrushless); // CAN ID 17
        intakeMotor2 = new SparkMax(27, MotorType.kBrushless); // CAN ID 27
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
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
        intakeMotor1.stopMotor(); // Stop motor 1
        intakeMotor2.stopMotor(); // Stop motor 2
    }
}