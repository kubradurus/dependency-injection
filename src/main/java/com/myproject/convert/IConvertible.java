package com.myproject.convert;

import com.myproject.UserDto;

/**
 * @author Kübra VARICI
 */
public interface IConvertible {
    String convert(UserDto userDto);
}