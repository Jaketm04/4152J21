// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
    public final class Constants {
    
     public static class Controls {
        //Drive controls
        public static final Hand DRIVE = Hand.kLeft;
        public static final int RUN_INTAKE_FWD = Button.kBumperRight.value;
        public static final int RUN_INTAKE_RVS = Button.kBumperLeft.value;
        public static final int TOGGLE_INTAKE_RAISED = Button.kX.value;
        public static final int TOGGLE_BALL_GATE = Button.kB.value;
        public static final int SHOOT_BALL = Button.kA.value;
        public static final int SHOOT_BALL_MANUAL = 7;

        // Operator controls:
        public static final Hand ROTATE_TURRET = Hand.kright;
        public static final int TOGGLE_LIMELIGHT_ZOOM = Button.kB.value;
        public static final int INC_RPM_OFFSET = Button.kBumperRight.value;
        public static final int DEC_RPM_OFFSET = Button.kBumperLeft.value;
        }//end of Controls class
    
    //USB ids
    public static final int DRIVER = 0;

    // CANbus ids
    public static final int FRONT_LEFT_DRIVE = 31;//check what the PDP uses
    public static final int FRONT_RIGHT_DRIVE = 30;
    public static final int INTAKE = 32;
    public static final int SHOOTER = 33;
    //DriveBase
    public static final double CONTROL_DEADBAND = 0.10;
    
}//end of Constants class - don't put code after this!
