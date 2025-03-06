package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController.Axis;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;

import java.util.function.DoubleSupplier;

public class CommandXboxController {
    /* Axes */
    public final DoubleSupplier leftVerticalJoystick;
    public final DoubleSupplier leftHorizontalJoystick;
    public final DoubleSupplier rightHorizontalJoystick;
    public final DoubleSupplier rightVerticalJoystick;

    /* Controllers */
    public final Joystick joystick;

    /* Triggers */
    public final JoystickButton leftTrigger;
    public final JoystickButton rightTrigger;

    /* Bumpers */
    public final JoystickButton leftBumper;
    public final JoystickButton rightBumper;

    /* Buttons */
    public final JoystickButton aButton;
    public final JoystickButton bButton;
    public final JoystickButton xButton;
    public final JoystickButton yButton;
    public final JoystickButton startButton;

    /* D-Pad */
    public final Trigger dUp;
    public final Trigger dRight;
    public final Trigger dDown;
    public final Trigger dLeft;

    /* Touchpad */
    public JoystickButton touchpadButton;

    public CommandXboxController(int port) {
        joystick = new Joystick(port);

        leftVerticalJoystick = () -> -joystick.getRawAxis(Axis.kLeftY.value);
        leftHorizontalJoystick = () -> -joystick.getRawAxis(Axis.kLeftX.value);
        rightHorizontalJoystick = () -> -joystick.getRawAxis(Axis.kRightX.value);
		rightVerticalJoystick = () -> -joystick.getRawAxis(Axis.kRightY.value);

        leftTrigger = new JoystickButton(joystick, Axis.kLeftTrigger.value);
        rightTrigger = new JoystickButton(joystick, Axis.kRightTrigger.value);

        leftBumper = new JoystickButton(joystick, Button.kLeftBumper.value);
        rightBumper = new JoystickButton(joystick, Button.kRightBumper.value);

        aButton = new JoystickButton(joystick, Button.kA.value);
        bButton = new JoystickButton(joystick, Button.kB.value);
        xButton = new JoystickButton(joystick, Button.kX.value);
        yButton = new JoystickButton(joystick, Button.kY.value);

        startButton = new JoystickButton(joystick, Button.kStart.value);

        dUp = new Trigger(() -> joystick.getPOV() == 0.0);
        dRight = new Trigger(() -> joystick.getPOV() == 90.0);
        dDown = new Trigger(() -> joystick.getPOV() == 180.0);
        dLeft = new Trigger(() -> joystick.getPOV() == 270.0);

        touchpadButton = new JoystickButton(joystick, 14);
    }
}
