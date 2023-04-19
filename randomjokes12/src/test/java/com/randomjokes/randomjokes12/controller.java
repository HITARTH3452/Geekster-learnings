package com.randomjokes.randomjokes12;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
@PostMapping(value= "/randomjokes")
public String randomjokes(@RequestBody String requestData) throws JSONException {
    JSONObject jsonobj = new JSONObject(requestData);
    String type = jsonobj.getString("type");
    String setup = jsonobj.getString("setup");
    String punchline = jsonobj.getString("punchline");
    int id = jsonobj.getInt("id");
    System.out.println(type+" "+setup+" "+" "+punchline+" "+id);
    return "Saved- " + requestData;
}
}
