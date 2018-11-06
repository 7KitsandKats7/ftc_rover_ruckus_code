package org.firstinspires.ftc.teamcode.mecanum.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="BlueTurn", group="Mecanum")
public class BlueAutoTurn extends BaseAuto {

    @Override
    public void runOpMode() throws InterruptedException {
        setTeamColor(BLUE);

        super.runOpMode();
    }

    protected void alignToCryptobox() {
        autoDrive(26.5, 0.3, 8); // drive forward until robot is off of the platform.

        autoTurn(90, 0.3, 8, true);
        sleep(100);
        autoTurn(90, 0.4, 1, true);

        sleep(100);
        telemetry.log().add("%.2f", angles.firstAngle);
    }
}
