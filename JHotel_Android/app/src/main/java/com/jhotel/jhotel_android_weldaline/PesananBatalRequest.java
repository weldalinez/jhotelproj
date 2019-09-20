package com.jhotel.jhotel_android_weldaline;

import com.android.volley.toolbox.StringRequest;
import com.android.volley.Response;
import java.util.*;

/**
 * Created by Weldaline Zafira on 5/6/2018.
 */

public class PesananBatalRequest extends StringRequest
{
    private static final String Cancel_URL = "http://192.168.43.18:8080/cancelpesanan";
    private Map<String, String> params;

    public PesananBatalRequest(int id_pesanan, Response.Listener<String> listener) {
        super(Method.POST, Cancel_URL, listener, null);
        params = new HashMap<>();
        params.put("id pesanan", String.valueOf(id_pesanan));
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
