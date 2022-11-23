package org.railway.stationenum;

public enum Station {
    SAIGON("Sài Gòn"),
    NHATRANG("Nha Trang"),
    HUE("Huế");

    private final String value;

    public String getValue() {
        return value;
    }
    Station(String value) {
        this.value = value;
    }
}
