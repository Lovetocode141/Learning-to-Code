package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name= "Christian")
public class MainTeleOp extends LinearOpMode {
    private DcMotor LeftFront;
    private DcMotor LeftBack;
    private DcMotor RightFront;

    private DcMotor RightBack;
    private ElapsedTime RunTime = new ElapsedTime();
    @Override
    public void runOpMode() throws InterruptedException {
        LeftFront = hardwareMap.get(DcMotor.class,"LeftFront");
        LeftBack = hardwareMap.get(DcMotor.class,"LeftBack");
        RightFront = hardwareMap.get(DcMotor.class,"RightFront");
        RightBack = hardwareMap.get(DcMotor.class,"RightBack");

        waitForStart();
        RunTime.reset();

        while(opModeIsActive()){
            double LeftFrontPower;
            double LeftBackPower;
            double RightFrontPower;
            double RightBackPower;
        }
    public void loop() {

        }
    }
}

