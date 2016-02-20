package org.usfirst.frc.team4915.stronghold.commands.IntakeLauncher;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team4915.stronghold.Robot;

public class IntakeBallCommand extends Command {

    // this command spins the intake flywheels inward to retrieve the ball
    public IntakeBallCommand() {
        requires(Robot.intakeLauncher);
    }

    @Override
    protected void initialize() {
        System.out.println("Intake Ball Command");
        setTimeout(10); //TODO finalize time
    }

    @Override
    protected void execute() {
        Robot.intakeLauncher.setSpeedIntake();
        SmartDashboard.putString("Flywheels spinning ", "inward");
    }

    @Override
    protected boolean isFinished() {
        // ends once the ball is in the basket and presses the limit switch or
        // the stop wheels button is pressed
        return (Robot.intakeLauncher.boulderSwitch.get() || isTimedOut());
    }

    @Override
    protected void end() {
        SmartDashboard.putString("Boulder in Basket: ", "Yes");
        Robot.intakeLauncher.stopWheels();
    }

    @Override
    protected void interrupted() {
        end();
    }
}
