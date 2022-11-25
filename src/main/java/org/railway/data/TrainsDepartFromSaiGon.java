package org.railway.data;

public enum TrainsDepartFromSaiGon {
    SAI_GON_TO_PHAN_THIET("Sài Gòn to Phan Thiết"),
    SAI_GON_TO_NHA_TRANG("Sài Gòn to Nha Trang"),
    SAI_GON_TO_DA_NANG("Sài Gòn to Đà Nẵng"),
    SAI_GON_TO_HUE("Sài Gòn to Huế"),
    HUE_TO_QUANG_NGAI("Sài Gòn to Quảng Ngãi");
    private final String value;

    public String getValue() {
        return value;
    }

    TrainsDepartFromSaiGon(String value) {
        this.value = value;
    }
}
