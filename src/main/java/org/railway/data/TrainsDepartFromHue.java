package org.railway.data;

public enum TrainsDepartFromHue {
    HUE_TO_SAI_GON("Huế to Sài Gòn"),
    HUE_TO_NHA_TRANG("Huế to Nha Trang"),
    HUE_TO_DA_NANG("Huế to Đà Nẵng"),
    HUE_TO_QUANG_NGAI("Huế to Quảng Ngãi");
    private final String value;

    public String getValue() {
        return value;
    }

    TrainsDepartFromHue(String value) {
        this.value = value;
    }
}
