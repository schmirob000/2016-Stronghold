package org.usfirst.frc.team4915.stronghold.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4915.stronghold.RobotMap;
import org.usfirst.frc.team4915.stronghold.subsystems.Scaler;
import org.usfirst.frc.team4915.stronghold.subsystems.Scaler.State;

public class ScalerCommand extends Command {

    public static final double MOTOR_SPEED = 0.25;
    public static final double WINCH_SPEED = -0.25;
    private final Scaler.State target;

    public ScalerCommand(State target) {
        this.target = target;
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        switch (target) {
            case LIFTING:
                RobotMap.scalingMotor.set(0);
                RobotMap.scalingWinch.set(WINCH_SPEED);
                break;
            case REACHING:
                RobotMap.scalingWinch.set(0);
                RobotMap.scalingMotor.set(MOTOR_SPEED);
                break;
            default:
                System.out.println("Invalid scaler state " + target);
        }
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        RobotMap.scalingWinch.set(0);
        RobotMap.scalingWinch.set(0);
    }

    @Override
    protected void interrupted() {
        end();
    }

}