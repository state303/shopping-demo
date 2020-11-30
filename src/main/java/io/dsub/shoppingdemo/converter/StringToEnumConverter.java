package io.dsub.shoppingdemo.converter;
public class StringToEnumConverter {
    public static <T extends Enum<T>> T getEnumFromString(Class<T> enumClass, String value) {

        if (enumClass == null) {
            throw new IllegalArgumentException("EnumClass value cannot be null");
        }

        for (Enum<?> enumValue : enumClass.getEnumConstants()) {
            if (enumValue.toString().equalsIgnoreCase(value)) {
                return (T) enumValue;
            }
        }

        StringBuilder sb = new StringBuilder();
        boolean bFirstTime = true;
        for (Enum<?> enumValue : enumClass.getEnumConstants()) {
            sb.append(bFirstTime ? "" : ", ").append(enumValue);
            bFirstTime = false;
        }
        throw new IllegalArgumentException(value + " is invalid value. Supported values are " + sb);
    }
}
