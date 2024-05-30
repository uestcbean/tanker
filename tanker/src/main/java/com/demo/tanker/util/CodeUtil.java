package com.demo.tanker.util;

import lombok.SneakyThrows;

public class CodeUtil {

    @SneakyThrows
    public static <T> T checkNotNull(T t, Object errorMsg){
        if (t == null){
            throw new Exception(String.valueOf(errorMsg));
        }
        return t;
    }
}
