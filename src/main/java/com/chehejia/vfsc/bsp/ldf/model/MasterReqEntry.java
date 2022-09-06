package com.chehejia.vfsc.bsp.ldf.model;

public class MasterReqEntry extends ScheduleTableEntry {
    @Override
    public String toString() {
        return "MasterReq delay " + getFrameTime() + " ms;";
    }
}
