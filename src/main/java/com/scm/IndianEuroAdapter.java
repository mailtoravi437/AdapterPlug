package com.scm;

public class IndianEuroAdapter implements EuroPlug{
    IndianPlug indianPlug;
    IndianEuroAdapter(IndianPlug indianPlug){
        this.indianPlug = indianPlug;
    }
    @Override
    public void plugin() {
        indianPlug.insert();
    }
}
