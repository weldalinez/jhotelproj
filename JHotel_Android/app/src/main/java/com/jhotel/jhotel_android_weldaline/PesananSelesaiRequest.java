package com.jhotel.jhotel_android_weldaline;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Weldaline Zafira on 5/6/2018.
 */

public class PesananSelesaiRequest extends StringRequest
{
    private static final String Selesai_URL = "http://192.168.43.18:8080/finishpesanan";
    private Map<String, String> params;

    public PesananSelesaiRequest(int id_pesanan, Response.Listener<String> listener) {
        super(Method.POST, Selesai_URL, listener, null);
        params = new HashMap<>();
        params.put("id pesanan", String.valueOf(id_pesanan));
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
