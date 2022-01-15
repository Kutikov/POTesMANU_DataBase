package com.damirkut.pdb_lib;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public class Core {
    @Contract(pure = true)
    public static int countSum(int a, int b){
        return a + b;
    }


    @Contract(pure = true)
    @NotNull
    public static String getStrByKey(String json, String key){
        try{
            return new JSONObject(json).getString(key);
        }
        catch (JSONException ex){
            return ex.getMessage();
        }
    }
}