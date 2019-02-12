package com.mayazdi.cp;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void TypeCharacter(char number) {
        try {
            Robot robot = new Robot();
            switch (number) {
                case '0':
                    robot.keyPress(KeyEvent.VK_0);
                    robot.keyRelease(KeyEvent.VK_0);
                    break;
                case '1':
                    robot.keyPress(KeyEvent.VK_1);
                    robot.keyRelease(KeyEvent.VK_1);
                    break;
                case '2':
                    robot.keyPress(KeyEvent.VK_2);
                    robot.keyRelease(KeyEvent.VK_2);
                    break;
                case '3':
                    robot.keyPress(KeyEvent.VK_3);
                    robot.keyRelease(KeyEvent.VK_3);
                    break;
                case '4':
                    robot.keyPress(KeyEvent.VK_4);
                    robot.keyRelease(KeyEvent.VK_4);
                    break;
                case '5':
                    robot.keyPress(KeyEvent.VK_5);
                    robot.keyRelease(KeyEvent.VK_5);
                    break;
                case '6':
                    robot.keyPress(KeyEvent.VK_6);
                    robot.keyRelease(KeyEvent.VK_6);
                    break;
                case '7':
                    robot.keyPress(KeyEvent.VK_7);
                    robot.keyRelease(KeyEvent.VK_7);
                    break;
                case '8':
                    robot.keyPress(KeyEvent.VK_8);
                    robot.keyRelease(KeyEvent.VK_8);
                    break;
                case '9':
                    robot.keyPress(KeyEvent.VK_9);
                    robot.keyRelease(KeyEvent.VK_9);
                    break;
                case 'T':
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_TAB);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void TypeCourse(String courseNumber, String courseGroup) {
        for (int i = 0; i < courseGroup.length(); i++)
            TypeCharacter(courseGroup.charAt(i));
        TypeCharacter('T');
        for (int i = 4; i < 7; i++)
            TypeCharacter(courseNumber.charAt(i));
        TypeCharacter('T');
        TypeCharacter('T');
        for (int i = 2; i < 4; i++)
            TypeCharacter(courseNumber.charAt(i));
        TypeCharacter('T');
        TypeCharacter('T');
        for (int i = 0; i < 2; i++)
            TypeCharacter(courseNumber.charAt(i));
        TypeCharacter('T');
        TypeCharacter('T');
        TypeCharacter('T');
    }

    public static void main(String[] args) {
        //Remove the following line if delay is not needed
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (Exception e) { }
        //Add enough Empty Lines
        //Put the curse on the group Field of first line
        //All courses must be available and status must be "ثبت"

        //Add courses in order below
        //First parameter is courseNumber and second one is course group
        //Example:
        TypeCourse("4302110", "02");
        TypeCourse("4303109", "01");
    }
}
