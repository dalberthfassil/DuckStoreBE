package com.ducks.store.domain.enums;

public enum ProtectionType {
    ABSORBENT_BALLS("Bolitas absorventes de humedad"),
    BUBBLE_BAG("Bolsas con burbujas"),
    PLASTOFORM_BALLS("Bolitas de plastoformo");

    private final String value;

    ProtectionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
