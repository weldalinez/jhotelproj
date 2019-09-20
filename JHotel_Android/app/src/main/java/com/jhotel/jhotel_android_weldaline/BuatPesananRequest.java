package com.jhotel.jhotel_android_weldaline;

import com.android.volley.toolbox.StringRequest;
import java.util.*;
import com.android.volley.*;
/**
 * Created by Weldaline Zafira on 5/6/2018.
 */

public class BuatPesananRequest extends StringRequest
{
    private static final String Book_URL = "http://192.168.43.4/bookpesanan";
    private Map<String, String> params;

    public BuatPesananRequest(int jumlah_hari, int id_customer, int id_hotel,
                              String nomor_kamar, Response.Listener<String> listener) {
        super(Method.POST, Book_URL, listener, null);
        params = new HashMap<>();
        params.put("jumlah hari",String.valueOf(jumlah_hari));
        params.put("id customer",String.valueOf(id_customer));
        params.put("id hotel",String.valueOf(id_hotel));
        params.put("nomor kamar", nomor_kamar);
    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}


