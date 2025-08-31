package com.sang.saquarium.repo;

import java.util.ArrayList;
import java.util.List;

import com.sang.saquarium.model.Fish;

public class FishPool {

	 public static List<Fish> fishes=new ArrayList<>();
	    static{
	        fishes.addAll(List.of(new Fish("GaGaLaLa", "red", "blue"), new Fish("Bill", "blue", "blue"), new Fish("Pikachu", "yellow", "yellow")));
	    }

	    public static void addFish(Fish e){
	        fishes.add(e);
	    }
	    
	    public static void updateFish(Fish e) {
	        for (Fish f : fishes) {
	            if (f.getName().equals(e.getName())) {
	                f.setBodyColor(e.getBodyColor());
	                f.setHeadColor(e.getHeadColor());
	            }
	        }
	    }
	    
	    public static void removeFish(String e) {
	        Fish fish = null;
	        for (Fish f : fishes) {
	            if (f.getName().equals(e)) {
	                fish = f;
	            }
	        }
	        
	        if (fish != null) fishes.remove(fish);
	    }
	
}
