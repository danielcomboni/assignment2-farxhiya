/**
 * @author Farhiya Ahmed
 * 
 *         This class implements the Repository interface
 * 
 */
package com.devices.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.devices.model.Device;
import com.devices.model.Sale;

public abstract class RepositoryImplementation implements Repository {

	@Override
	public Device addAnItemToStock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double checkAvailableStock(int deviceId) {

		int size = 0;
		if (this.findAllDevicesMappedToTheirIndicesInAList().size() != 0) {

			if (this.findAllDevicesMappedToTheirIndicesInAList().get(deviceId).size() != 0) {

				size = this.findAllDevicesMappedToTheirIndicesInAList().get(deviceId).size();

			}

		}

		return size;
	}

	@Override
	public Sale recordASale(Sale aSale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayLowStocks() {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayAvailableItemsAndGroupByCategory(int indexOfArrayListInMap) {

		if (this.findAllDevicesMappedToTheirIndicesInAList().size() > 0) {

			if (this.findAllDevicesMappedToTheirIndicesInAList().get(indexOfArrayListInMap).size() > 0) {

				this.findAllDevicesMappedToTheirIndicesInAList().get(indexOfArrayListInMap).forEach(e -> {
					System.out.println(e);
				});
			}

		}

	}

	@Override
	public void printAllSales() {
		// TODO Auto-generated method stub

	}

	private static Map<Integer, ArrayList<Device>> theMapOfAllDevices;

	public static Map<Integer, ArrayList<Device>> getTheMapOfAllDevices() {
		return theMapOfAllDevices;
	}

	public static void setTheMapOfAllDevices(Map<Integer, ArrayList<Device>> theMapOfAllDevices) {
		RepositoryImplementation.theMapOfAllDevices = theMapOfAllDevices;
	}

	@Override
	public Map<Integer, ArrayList<Device>> findAllDevicesMappedToTheirIndicesInAList() {

		if (RepositoryImplementation.getTheMapOfAllDevices() == null) {
			Map<Integer, ArrayList<Device>> map = new HashMap<>();
			RepositoryImplementation.setTheMapOfAllDevices(map);

		}

		return RepositoryImplementation.getTheMapOfAllDevices();
	}

}
