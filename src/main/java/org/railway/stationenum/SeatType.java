package org.railway.stationenum;

public enum SeatType {
    HARD_SEAT("1"),
    SOFT_SEAT("2"),
    SOFT_SEAT_WITH_AIR_CONDITIONER("3");
    private final String value;

    public String getValue() {
        return value;
    }

    SeatType(String value) {
        this.value = value;
    }
}
