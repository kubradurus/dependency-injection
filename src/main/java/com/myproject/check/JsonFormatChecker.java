package com.myproject.check;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Kübra VARICI
 */
public class JsonFormatChecker extends FormatChecker {
    @Override
    public boolean check(String value) {
        try {
            new JSONObject(value);
        } catch (JSONException ex) {
            try {
                new JSONArray(value);
            } catch (JSONException ex1) {
                return false;
            }
        }
        return true;
    }
}