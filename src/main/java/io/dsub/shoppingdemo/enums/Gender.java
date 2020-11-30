package io.dsub.shoppingdemo.enums;

import io.dsub.shoppingdemo.converter.StringToEnumConverter;

public enum Gender {
    MALE, FEMALE, UNKNOWN;

    public static Gender fromValue(String value) {
        return StringToEnumConverter.getEnumFromString(Gender.class, value);
    }

    public String toJson() {
        return name().toLowerCase();
    }
}
