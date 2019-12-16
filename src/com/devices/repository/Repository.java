package com.devices.repository;

import java.util.ArrayList;
import java.util.Map;

import com.devices.model.Device;
import com.devices.model.Sale;

public interface Repository {

	public Device addAnItemToStock();

	public double checkAvailableStock(int deviceId);

	public Sale recordASale(Sale aSale);

	public void displayLowStocks();

	public void displayAvailableItemsAndGroupByCategory(int indexOfArrayListInMap);

	public void printAllSales();
	
	public Map<Integer,ArrayList<Device>> findAllDevicesMappedToTheirIndicesInAList();

}
