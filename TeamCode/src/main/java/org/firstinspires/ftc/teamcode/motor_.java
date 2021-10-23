package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.acmerobotics.dashboard.config.Config;

@Config
public class motor_ {
    public static double speed = 0.4;
    public DcMotor motor;

    public motor_ (HardwareMap hardwareMap) {
        this.motor  = hardwareMap.get(DcMotor.class, "motor");
    }

    public double  get_speed(){
        return this.speed;
    }

}