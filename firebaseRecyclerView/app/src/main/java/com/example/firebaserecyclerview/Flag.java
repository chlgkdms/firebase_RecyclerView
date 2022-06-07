package com.example.firebaserecyclerview;

public class Flag {
    private String flag;
    private String flagName;
    private String capital;

    public Flag(){}

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getFlagName() {
        return flagName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Flag(String flag, String flagName, String capital) {
        this.flag = flag;
        this.flagName = flagName;
        this.capital = capital;
    }
}
