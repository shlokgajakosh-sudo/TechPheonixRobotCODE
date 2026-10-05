package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="kb auto")
public class KitbotAuto extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        // Declare our motors
        // Make sure your IDs match your configuration
        DcMotor frontLeftMotor = hardwareMap.dcMotor.get("frontLeftMotor"); // declares frontLeftMotor
        DcMotor backLeftMotor = hardwareMap.dcMotor.get("backLeftMotor"); // declares backLeftMotor
        DcMotor frontRightMotor = hardwareMap.dcMotor.get("frontRightMotor"); // declares frontRightMotor
        DcMotor backRightMotor = hardwareMap.dcMotor.get("backRightMotor"); // declares backRightMotor

        DcMotor intake = hardwareMap.dcMotor.get("intakeMotor");
        CRServo intakeServo1 = hardwareMap.get(CRServo.class, "intakeServo1");
        CRServo intakeServo2 = hardwareMap.get(CRServo.class, "intakeServo2");

        ElapsedTime autoTimer = new ElapsedTime();
        autoTimer.reset();

        DcMotor shooter = hardwareMap.dcMotor.get("shooter1");
        //Reverse the right-side motors. This may be wrong for your setup.
        // If your robot moves backwards when commanded to go forwards,
        //Reverse the left side instead.
        // See the note about this earlier on this page.
        frontRightMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        backRightMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        if (isStopRequested()) return;

        while (opModeIsActive()) {
            frontRightMotor.setPower(0.5); //declares power frontRightMotor autonomous
            backRightMotor.setPower(-0.5); //declares power of backRightMotor autonomous
            frontLeftMotor.setPower(-0.5); //declares power of frontLeftMotor autonomous
            backLeftMotor.setPower(0.5); //declares power of backLeftMotor autonomous

            if (autoTimer.seconds() < 1) continue; // stops the timer but continues through the code

            frontRightMotor.setPower(0); // stops frontRightMotor
            backRightMotor.setPower(0);  // stops backRightMotor
            frontLeftMotor.setPower(0); // stops frontLeftMotor
            backLeftMotor.setPower(0); // stops backLeftMotor

            shooter.setPower(0.5); // starts the shooter motor

            autoTimer.reset();
            frontRightMotor.setPower(0.5);
            frontLeftMotor.setPower(-0.5);
            backRightMotor.setPower(-0.5);
            backLeftMotor.setPower(0.5);

            autoTimer.reset();

            intakeMotor.setPower(0.5);

            frontRightMotor.setPower(0.5);
            frontLeftMotor.setPower(0.5);
            backRightMotor.setPower(0.5);
            backLeftMotor.setPower(0.5);

            autoTimer.reset();

            frontRightMotor.setPower(-0.5);
            frontLeftMotor.setPower(-0.5);
            backRightMotor.setPower(-0.5);
            backLeftMotor.setPower(-0.5);

            autoTimer.reset();

            frontRightMotor.setPower(-0.5);
            frontLeftMotor.setPower(0.5);
            backRightMotor.setPower(0.5);
            backLeftMotor.setPower(-0.5);
            shooter.setPower(1);

            autoTimer.reset();
            
            frontRightMotor.setPower(0.5);
            frontLeftMotor.setPower(-0.5);
            backRightMotor.setPower(-0.5);
            backLeftMotor.setPower(0.5);
            if (autoTimer.seconds() < 0.5)  continue;

            frontRightMotor.setPower(0);
            frontLeftMotor.setPower(0);
            backRightMotor.setPower(0);
            backLeftMotor.setPower(0);

            autoTimer.reset();
            
            intakeServo1.setPower(1);
            frontRightMotor.setPower(0.5);
            frontLeftMotor.setPower(0.5);
            backRightMotor.setPower(0.5);
            backLeftMotor.setPower(0.5);
 
            if (autoTimer.seconds() < 0.5) continue;

            frontRightMotor.setPower(0);
            frontLeftMotor.setPower(0);
            backRightMotor.setPower(0);
            backLeftMotor.setPower(0);

            autoTimer.reset();

            frontRightMotor.setPower(-0.5);
            frontLeftMotor.setPower(0.5);
            backRightMotor.setPower(-0.5);
            backLeftMotor.setPower(0.5);

            if (autoTimer.seconds() < 0.3) continue;

            frontRightMotor.setPower(0);
            frontLeftMotor.setPower(0);
            backRightMotor.setPower(0);
            backLeftMotor.setPower(0);

            autoTimer.reset();

            intakeMotor.setPower(1);

            frontRightMotor.setPower(
            
            
        }
    }
}

package org.firstinspires.ftc.teamcode.game;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class MecanumTeleOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        // Declare our motors
        // Make sure your ID's match your configuration
        DcMotor frontLeftMotor = hardwareMap.dcMotor.get("frontLeftMotor");
        DcMotor backLeftMotor = hardwareMap.dcMotor.get("backLeftMotor");
        DcMotor frontRightMotor = hardwareMap.dcMotor.get("frontRightMotor");
        DcMotor backRightMotor = hardwareMap.dcMotor.get("backRightMotor");

        DcMotor intake = hardwareMap.dcMotor.get("intakeMotor");
        CRServo intakeServo1 = hardwareMap.get(CRServo.class, "intakeServo1");
        CRServo intakeServo2 = hardwareMap.get(CRServo.class, "intakeServo2");

        DcMotor shooter = hardwareMap.dcMotor.get("shooter1");
        // Reversea the right side motors. This may be wrong for your setup.
        // If your robot moves backwards when commanded to go forwards,
        // reverse the left side instead.
        // See the note about this earlier on this page.
        frontRightMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        backRightMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        if (isStopRequested()) return;

        while (opModeIsActive()) {
            double y = -gamepad1.left_stick_y; // Remember, Y stick value is reversed
            double x = gamepad1.left_stick_x * 1.1; // Counteract imperfect strafing
            double rx = gampad1.right_stick_x;

            if (gamepad1.a) {
                intake.setPower(0.5);
            } else {
                intake.setPower(0);
            }

            if (gamepad1.b) {
                intakeServo1.setPower(1);
                intakeServo2.setPower(1);
            } else {
                intakeServo1.setPower(0);
                intakeServo2.setPower(0);
            }
            if (gamepad1.b) {
                intakeServo1.setPower(1);
            } else {
                intakeServo1.setPower(0);
            }
            if (gamepad1.x) {
                intakeServo2.setPower(1);
            } else {
                intakeServo2.setPower(0);
            }
            if (gamepad1.y) {
                shooter.setPower(0.5);
            } else {
                shooter.setPower(0);
            }

            // Denominator is the largest motor power (absolute value) or 1
            // This ensures all the powers maintain the same ratio,
            // but only if at least one is out of the range [-1, 1]
            double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);
            double frontLeftPower = (y + x + rx) / denominator;
            double backLeftPower = (y - x + rx) / denominator;
            double frontRightPower = (y - x - rx) / denominator;
            double backRightPower = (y + x - rx) / denominator;

            frontLeftMotor.setPower(frontLeftPower);
            backLeftMotor.setPower(backLeftPower);
            frontRightMotor.setPower(frontRightPower);
            backRightMotor.setPower(backRightPower);
        }
    }
}
