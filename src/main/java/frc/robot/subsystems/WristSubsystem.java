package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class WristSubsystem extends SubsystemBase {
   
    private final SparkMax wristMotor;

    public WristSubsystem() {
        wristMotor = new SparkMax(16, MotorType.kBrushless); // CAN ID 16

        // Set the secondary motor to hold its position when not moving
        wristMotor.configure(new SparkMaxConfig().idleMode(IdleMode.kBrake), ResetMode.kNoResetSafeParameters, PersistMode.kPersistParameters);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    public void wristUp(double speed) {
        wristMotor.set(speed); // Set motor to speed up
    }
        
    public void wristDown(double speed) {
        wristMotor.set(-speed); // Set motor to speed down
    }
        
    public void stop() {
        wristMotor.set(0); // Stop the motor
    }
}