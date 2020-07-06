package com.myproject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myproject.check.FormatChecker;
import com.myproject.convert.IConvertible;

import java.io.IOException;

/**
 * @author Kübra VARICI
 */
public class Operations {
    private FormatChecker formatChecker;
    private IConvertible convertible;

    public Operations(FormatChecker formatChecker, IConvertible convertible) {
        this.formatChecker = formatChecker;
        this.convertible = convertible;
    }

    public void islemYap(String value){
        if (formatChecker.check(value)){
            UserDto userDto = save(value);
            if (userDto != null){
                System.out.println(convertible.convert(userDto));
            }
        }
    }

    public UserDto save(String value){
        System.out.println("Kullanıcı kaydedildi.");

        ObjectMapper mapper = new ObjectMapper();
        try {
            UserDto userDto = mapper.readValue(value, UserDto.class);
            return userDto;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
