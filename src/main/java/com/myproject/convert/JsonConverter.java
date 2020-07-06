package com.myproject.convert;

import com.myproject.UserDto;
import org.json.JSONObject;

/**
 * @author Kübra VARICI
 */
public class JsonConverter implements IConvertible{
    @Override
    public String convert(UserDto userDto) {
        JSONObject jsonObj = new JSONObject(userDto);
        return jsonObj.toString();
    }
}
