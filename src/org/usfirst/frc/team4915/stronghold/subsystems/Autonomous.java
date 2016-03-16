package org.usfirst.frc.team4915.stronghold.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Autonomous extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {

    }

    public static enum Type {
        LOWBAR,
        MOAT,
        ROUGH_TERRAIN,
        ROCK_WALL,
        PORTCULLIS

    }

    public static enum Strat {
        NONE,
        DRIVE_ACROSS,
        DRIVE_ACROSS_BACKWARD,
        DRIVE_SHOOT_VISION,
        DRIVE_SHOOT_NO_VISION
    }

    public static enum Position {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE
    }
}
