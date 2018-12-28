package com.panyu.panyuprojectims.entity;
public class Garrison {
    private String garrisonId;
    private String garrisonName;

    public Garrison() {
        super();
    }
    public Garrison(String garrisonId,String garrisonName) {
        super();
        this.garrisonId = garrisonId;
        this.garrisonName = garrisonName;
    }
    public String getGarrisonId() {
        return this.garrisonId;
    }

    public void setGarrisonId(String garrisonId) {
        this.garrisonId = garrisonId;
    }

    public String getGarrisonName() {
        return this.garrisonName;
    }

    public void setGarrisonName(String garrisonName) {
        this.garrisonName = garrisonName;
    }

    @Override
    public String toString() {
        return "Garrison{" +
                "garrisonId='" + garrisonId + '\'' +
                ", garrisonName='" + garrisonName + '\'' +
                '}';
    }
}
