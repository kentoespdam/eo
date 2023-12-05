package com.kentoes.eo.enums;

public enum EBatchProcessStatus {
    PENDING(0),
    PROCES_SEDANG_BERJALAN(1),
    MENUNGGU_VERIFIKASI_TAHAP_1(2),
    MENUNGGU_VERIFIKASI_TAHAP_2(3),
    MENUNGGU_APPROVAL(4),
    SELESAI(5),
    ERROR(99);

    private final int value;

    EBatchProcessStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
