package com.example.mechrevo.myapplication.statedesign;

public class TVController implements IPowerController {

    private ITVController itvController;

    public void setItvController(ITVController itvController) {
        this.itvController = itvController;
    }

    @Override
    public void powerOn() {
        itvController.turnDown();
    }

    @Override
    public void powerOff() {
        itvController.turnUp();
    }

}
