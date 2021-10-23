package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.FtcDashboard;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class TestDashboard extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        motor_ motor = new motor_(hardwareMap);
        FtcDashboard dashboard = FtcDashboard.getInstance();
        telemetry = dashboard.getTelemetry();

        waitForStart();

        while (opModeIsActive()) {
            motor.motor.setPower(motor.get_speed());
            telemetry.addData("motor speed", motor.get_speed());
            telemetry.update();
        }
    }
}
