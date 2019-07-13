package com.dkn199.encryptdecrypt.type;

import java.lang.reflect.Array;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class EnumUtils {

    public static <T, E extends Enum<E>> Function<T, E> lookupMap(Class<E> clazz, Function<E, T> mapper) {
        E[] emptyArray = (E[]) Array.newInstance(clazz, 0);
        return EnumUtils.lookupMap(EnumSet.allOf(clazz).toArray(emptyArray), mapper);
    }

    private static <T, E extends Enum<E>> Function<T, E> lookupMap(E[] values, Function<E, T> mapper) {
        Map<T, E> index = new HashMap<>(values.length);
        for (E value : values) {
            index.put(mapper.apply(value), value);
        }
        return (final T key) -> index.get(key);
    }

}
