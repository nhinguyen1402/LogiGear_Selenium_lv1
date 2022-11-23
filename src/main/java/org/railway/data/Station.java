package org.railway.data;

public enum Station {
    SAI_GON("Sài Gòn"),
    NHA_TRANG("Nha Trang"),
    HUE("Huế");

    private final String value;

    public String getValue() {
        return value;
    }
    Station(String value) {
        this.value = value;
    }
}
