package org.example.task3;

import org.json.JSONObject;

public class Facade {
    public static Company getInfo(Reader reader) throws Exception {
        JSONObject jsonObject = reader.GetInfo();
        String name = jsonObject.optString("name");
        String description = jsonObject.optString("description");
        String logo = jsonObject.optString("logo");
        return new  Company(name, description, logo);
    }
}
