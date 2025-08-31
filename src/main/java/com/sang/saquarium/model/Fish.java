package com.sang.saquarium.model;

public class Fish {

    private String name=null;
    private String headColor=null;
    private String bodyColor=null;

    public Fish() {
    }
    
    public Fish(String name, String headColor, String bodyColor) {
        this.name=name;
        this.headColor=headColor;
        this.bodyColor=bodyColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    public String getHeadColor() {
        return headColor;
    }

    public void setHeadColor(String headColor) {
        this.headColor = headColor;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    @Override
    public String toString() {
        return "Fish{" + "name=" + name + ", headColor=" + headColor + ", bodyColor=" + bodyColor + '}';
    }
	
}
