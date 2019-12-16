package com.devices;

import java.util.ArrayList;
import java.util.List;

import com.devices.model.Desktop;
import com.devices.model.Laptop;
import com.devices.model.Smartphone;
import com.devices.model.Tablet;
import com.devices.utilities.Prompts;

public class Main {

	public static void main(String[] args) {

		// list of all model class / devices
		List<Class<?>> deviceModels = new ArrayList<>();

		deviceModels.add(Tablet.class);
		deviceModels.add(Smartphone.class);
		deviceModels.add(Desktop.class);
		deviceModels.add(Laptop.class);

		for (Class<?> cls : deviceModels) {
			System.out.println("cls: " + cls.getSimpleName() + " " + deviceModels.indexOf(cls));
		}

		Prompts.startSystem(deviceModels);

	}

}
