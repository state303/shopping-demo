package io.dsub.shoppingdemo.converter;

import org.springframework.core.convert.converter.Converter;

public class GenderConverter<T extends Enum<T>> implements Converter<String, T> {
    @Override
    public T convert(String source) {
        return StringToEnumConverter.getEnumFromString(tEnum, source);
    }
}