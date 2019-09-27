package com.muskan.studententry.percentage;

public class CalPercentage {
    private double amarks,imarks,wmarks;

    public CalPercentage(double amarks, double imarks, double wmarks) {
        this.amarks = amarks;
        this.imarks = imarks;
        this.wmarks = wmarks;
    }

    public double getAmarks() {
        return amarks;
    }

    public void setAmarks(double amarks) {
        this.amarks = amarks;
    }

    public double getImarks() {
        return imarks;
    }

    public void setImarks(double imarks) {
        this.imarks = imarks;
    }

    public double getWmarks() {
        return wmarks;
    }

    public void setWmarks(double wmarks) {
        this.wmarks = wmarks;
    }
    public double Cal(){
       Double per = (amarks + imarks + wmarks) /3;
       return per;
    }
}
