/*
 * This file is part of LinkJVM.
 *
 * Java Framework for the KIPR Link
 * Copyright (C) 2014 LinkJVM
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package linkjvm;

import java.io.IOException;

import linkjvm.sensors.analog.AnalogSensor;
import linkjvm.sensors.buttons.AButton;
import linkjvm.sensors.buttons.BButton;
import linkjvm.sensors.buttons.ButtonController;
import linkjvm.sensors.buttons.CButton;

/**
 * 
 * @author Markus Klein
 * @version 2.1.0
 * @since 2.1.0
 */
public class Botball {
	
	/**
	 * Lets the current thread sleep for a specified time.
	 * @param millis time in milliseconds
	 */
	public static void msleep(long millis){
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) { }
	}
	
	/**
	 * Waits for the light
	 * @param lightPort port of the light sensor
	 */
	public static void waitForLight(int lightPort){
		ButtonController.hideExtraButtons();
		new AButton().setText("-");
		new CButton().setText("-");
		BButton button = new BButton();
		AnalogSensor lightSensor = new AnalogSensor(lightPort);
		lightSensor.setPullup(true);
		try {
			Runtime.getRuntime().exec("clear");
		} catch (IOException e) {}
		button.setText("Light is On");
		int onValue, offValue;
		while(!button.isPressed()){
			try {
				Runtime.getRuntime().exec("clear");
			} catch (IOException e) {}
			System.out.println("Press when the light is ON!\n\tLight value: " + lightSensor.getValue());
			msleep(50);
		}
		onValue = lightSensor.getValue();
		msleep(200);
		try {
			Runtime.getRuntime().exec("clear");
		} catch (IOException e) {}
		button.setText("Light is OFF");
		while(!button.isPressed()){
			try {
				Runtime.getRuntime().exec("clear");
			} catch (IOException e) {}
			System.out.println("Press when the light is OFF!\n\tLight value: " + lightSensor.getValue());
			msleep(50);
		}
		try {
			Runtime.getRuntime().exec("clear");
		} catch (IOException e) {}
		offValue = lightSensor.getValue();
		System.out.println("Light on: " + onValue + "\nLightOff: " + offValue);
		if(offValue - onValue > 60){
			System.out.println("Good Calibration! Waiting for light...");
			while(lightSensor.getValue() > (offValue + onValue) / 2){
				msleep(20);
			}
			System.out.println("Start!");
		}
		else{
			System.out.println("BAD Calibration! Try again!");
			waitForLight(lightPort);
		}
		new AButton().setText("A");
		new CButton().setText("C");
		button.setText("B");
	}
}
