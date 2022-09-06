package com.chehejia.vfsc.bsp.ldf.model;

public class SlaveRespEntry extends ScheduleTableEntry {
    @Override
    public String toString() {
        return "SlaveResp delay " + getFrameTime() + " ms;";
    }
}
