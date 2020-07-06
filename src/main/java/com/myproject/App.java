package com.myproject;

import com.myproject.check.JsonFormatChecker;
import com.myproject.convert.XmlConverter;

/**
 * @author Kübra VARICI
 */
public class App {
    public static void main( String[] args )
    {
        String value =   "{" +
                "\"username\":\"test\"," +
                "\"password\":\"1234" +
                "\"}";

        JsonFormatChecker jsonFormatChecker = new JsonFormatChecker();
        XmlConverter xmlConverter = new XmlConverter();
//      JsonConverter jsonConverter = new JsonConverter();

//		produces/consumes mantığı ile input'un json, output'un xml olmasını istiyoruz.
        Operations operations = new Operations(jsonFormatChecker, xmlConverter);
        operations.islemYap(value);
    }
}
