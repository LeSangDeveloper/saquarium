package com.sang.saquarium.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sang.saquarium.model.Fish;
import com.sang.saquarium.repo.FishPool;

@RestController
public class FishController {

    @GetMapping("/api/fishes")
    public List<Fish> getFishes(){
        return FishPool.fishes;
    }
    
    @PostMapping("/api/fish")
    public void addFish(@RequestBody Fish fish){

        FishPool.addFish(fish);
    }
    
    @PutMapping("/api/fish")
    public void updateFish(@RequestBody Fish fish){
       FishPool.updateFish(fish);
    }
    
    @DeleteMapping("/api/fish/name/{name}")
    public void removeFish(@PathVariable String name){
        FishPool.removeFish(name);
    }
	
}
