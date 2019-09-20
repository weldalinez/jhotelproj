package com.jhotel.jhotel_android_weldaline;

import com.android.volley.toolbox.StringRequest;
import com.android.volley.Response;

/**
 * Created by Weldaline Zafira on 5/6/2018.
 */

public class PesananFetchRequest extends StringRequest
{
    private static final String Fetch_URL = "http://192.168.43.18:8080/pesanancustomer/";

    public PesananFetchRequest(int id_cust, Response.Listener<String> listener) {
        super(Method.GET, Fetch_URL + id_cust, listener, null);
    }
}
