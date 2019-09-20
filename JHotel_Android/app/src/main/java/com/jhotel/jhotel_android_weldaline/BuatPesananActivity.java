package com.jhotel.jhotel_android_weldaline;

import android.support.v7.app.AppCompatActivity;
import android.os.*;
import android.view.View;
import android.widget.*;
import com.android.volley.*;
import android.content.*;
import org.json.*;
import android.app.*;
import com.android.volley.toolbox.*;

public class BuatPesananActivity extends AppCompatActivity {
    private int currentUserId;
    private int banyakHari;
    private int idHotel;
    private double tariff;
    private String roomNumber;
    private double total_biaya = tariff*banyakHari;

/**    View.OnClickListener listener1 = null;
    View.OnClickListener listener2 = null;
    final TextView textViewRoomNumber = findViewById(R.id.room_number);
    final TextView textViewTariff = findViewById(R.id.tariff);
    final TextView textViewTotalBiaya = findViewById(R.id.total_biaya);
    final EditText durasiInput = findViewById(R.id.durasi_hari);
    final Button pesanButton = findViewById(R.id.pesan);
    final Button hitungButton = findViewById(R.id.hitung);
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_pesanan);

        final TextView total_biaya = (TextView) findViewById(R.id.total_biaya);
        final TextView tarif = (TextView) findViewById(R.id.tariff);
        final TextView room_number = (TextView) findViewById(R.id.room_number);
        final EditText durasi_hari = (EditText) findViewById(R.id.durasi_hari);
        final Button hitung = (Button) findViewById(R.id.hitung);
        final Button pesan = (Button) findViewById(R.id.pesan);

        hitung.setVisibility(View.VISIBLE);
        pesan.setVisibility(View.INVISIBLE);
        room_number.setText(roomNumber);
        tarif.setText(Double.toString(tariff));
        total_biaya.setText("0");

        Intent orderInt = getIntent();
        currentUserId = orderInt.getIntExtra("id customer",0);
        roomNumber = orderInt.getStringExtra("nomor kamar");
        idHotel = orderInt.getIntExtra("id hotel",0);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung.setVisibility(View.INVISIBLE);
                pesan.setVisibility(View.VISIBLE);

                banyakHari = Integer.parseInt(durasi_hari.getText().toString());
                total_biaya.setText(Double.toString(tariff*banyakHari));

                Response.Listener<String> responseListener = new Response.Listener<String> () {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonResponse = new JSONObject(response);
                            if(jsonResponse!=null) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(BuatPesananActivity.this);
                                builder.setMessage("Booking Success.")
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(BuatPesananActivity.this);
                            builder.setMessage("Booking Failed.")
                                    .create()
                                    .show();
                        }
                    }
                };

                BuatPesananRequest bookRequest = new BuatPesananRequest(banyakHari, currentUserId, idHotel,
                        roomNumber, responseListener);
                RequestQueue queue = Volley.newRequestQueue(BuatPesananActivity.this);
                queue.add(bookRequest);

            }
        });
    }
}
