package com.company;

public class Cellphone {
    private boolean smartphone;
    private String operationSystem;
    private float screenSize;

    public Cellphone(){
    }
    public Cellphone(boolean smartphone, String operationSystem){
        this.smartphone = smartphone;
        this.operationSystem = operationSystem;
    }

    public Cellphone(boolean smartphone, String operationSystem, float screenSize){
        this.smartphone = smartphone;
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
    }

    public boolean getSmartphone(){
        return smartphone;
    }
    public String getOperationSystem() {
        return operationSystem;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setSmartphone(boolean smartphone){
        this.smartphone = smartphone;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isSmartphone(Cellphone cellphone){
        return cellphone.smartphone;
    }

    public String cellphoneSpecs(Cellphone cellphone){
        return("Smartphone = " + smartphone + ", OS = " + operationSystem + ", Screen size = " + screenSize);
    }
}
