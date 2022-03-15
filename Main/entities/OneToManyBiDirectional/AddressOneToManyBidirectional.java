package com.example.demo.entities.OneToManyBiDirectional;

import javax.persistence.Embeddable;

@Embeddable
public class AddressOneToManyBidirectional {
    private String streetnumber;
    private String location;
    private String state;

    public String getStreetnumber() {
        return streetnumber;
    }

    public void setStreetnumber(String streetnumber) {
        this.streetnumber = streetnumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
