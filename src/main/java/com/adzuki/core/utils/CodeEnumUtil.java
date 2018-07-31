package com.adzuki.core.utils;

public class CodeEnumUtil {

	 public static <E extends Enum<?> & BaseCodeEnum> E codeOf(Class<E> enumClass, int code) {
	        E[] enumConstants = enumClass.getEnumConstants();
	        for (E e : enumConstants) {
	            if (e.getCode() == code)
	                return e;
	        }
	        return null;
	    }
}
