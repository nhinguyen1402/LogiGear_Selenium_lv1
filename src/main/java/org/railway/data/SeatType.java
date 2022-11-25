package org.railway.data;

public enum SeatType {
    HARD_SEAT("Hard seat", "HS"),
    SOFT_SEAT("Soft seat", "SS"),
    SOFT_SEAT_WITH_AIR_CONDITIONER("Soft seat with air conditioner", "SSC"),
    HARD_BED("Hard bed", "HB"),
    SOFT_BED("Soft bed", "SB"),
    SOFT_BED_WITH_AIR_CONDITIONER("Soft bed with air conditioner", "SBC");
    private final String value;
    private final String shortValue;

    public String getValue() {
        return value;
    }

    public String getShortValue() {
        return shortValue;
    }

    SeatType(String value, String shortValue) {
        this.value = value;
        this.shortValue = shortValue;
    }
}
