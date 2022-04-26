package com.flowerbouquet.test;
import java.util.ArrayList;
import java.util.List;

import com.flowerbouquet.excercise01.*;

public class FlowerBouquet {

	List<Flowers> list = new ArrayList<>();
	
	public List<Flowers> addFlowersIntoBouquet(Flowers flowers) {
		list.add(flowers);
		return list;
	}
	
	int bouquetCost = 0;
	
	public int getBouquetCost() {
		for (int flowerCount = 0; flowerCount < list.size(); flowerCount++) {
			bouquetCost = bouquetCost + list.get(flowerCount).getCost();
		    }
		    return bouquetCost;
	}
	
	public static void main(String args[]) {
		FlowerBouquet fb = new FlowerBouquet();
		fb.addFlowersIntoBouquet(new RoseFlower());
		fb.addFlowersIntoBouquet(new JasmineFlower());
		fb.addFlowersIntoBouquet(new LillyFlower());
		int flowerBoquetCost = fb.getBouquetCost();
		
		System.out.println("Cost of the flower bouquet is " + flowerBoquetCost);
		
	}
	
}
