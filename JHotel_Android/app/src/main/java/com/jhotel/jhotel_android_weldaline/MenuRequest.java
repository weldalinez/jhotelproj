package com.jhotel.jhotel_android_weldaline;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import org.json.*;

/**
 * Created by Weldaline Zafira on 5/3/2018.
 */

public class MenuRequest extends StringRequest {

    private static final String Vacant_URL = "http://10.5.79.67:8080/vacantrooms";

    public MenuRequest(Response.Listener<String> listener) {
        super(Method.GET, Vacant_URL, listener, null);
    }
}
