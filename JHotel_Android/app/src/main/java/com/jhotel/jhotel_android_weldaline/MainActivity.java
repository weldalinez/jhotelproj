package com.jhotel.jhotel_android_weldaline;

import java.util.*;
import android.os.*;
import android.support.v7.app.AppCompatActivity;
import com.android.volley.*;
import org.json.*;
import android.widget.*;
import android.content.*;
import android.view.*;


public class MainActivity extends AppCompatActivity {

    private ArrayList<Hotel> listHotel = new ArrayList<>();
    private ArrayList<Room> listRoom = new ArrayList<>();
    private HashMap<Hotel, ArrayList<Room>> childMapping = new HashMap<>();
    private int currentUserId;
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RefreshList();

        MenuListAdapter listAdapter;
        ExpandableListView expListView;
        expListView = (ExpandableListView) findViewById(R.id.lvExp);


        listAdapter = new MenuListAdapter(MainActivity.this, listHotel, childMapping);
        expListView.setAdapter(listAdapter);

        Intent mIntent = getIntent();
        currentUserId = mIntent.getIntExtra("id customer", 0);

        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                Room selected = childMapping.get(listHotel.get(groupPosition)).get(childPosition);
                Hotel hotel = listHotel.get(groupPosition);
                String nomor_kamar = selected.getRoomNumber();
                Intent childIntent = new Intent(MainActivity.this, BuatPesananActivity.class);
                childIntent.putExtra("id customer", currentUserId);
                childIntent.putExtra("nomor kamar", nomor_kamar);
                childIntent.putExtra("id hotel", hotel.getID());
                startActivity(childIntent);
                return true;
            }
        });

        Button pesananbtn = (Button) findViewById(R.id.buttonPesanan);
        pesananbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent selesaiIntent = new Intent(MainActivity.this, SelesaiPesananActivity.class);
                selesaiIntent.putExtra("id customer", currentUserId);
                startActivity(selesaiIntent);
            }
        });

    }

    public void RefreshList() {
        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONArray jsonResponse = new JSONArray(response);
                    JSONObject e = jsonResponse.getJSONObject(0).getJSONObject("hotel");
                    JSONObject lokasi = e.getJSONObject("lokasi");
                    JSONObject room = e.getJSONObject("room");
                    listHotel.add(new Hotel(e.getInt("id"),e.getString("nama"),
                            new Lokasi(lokasi.getDouble("x_coord"),lokasi.getDouble("y_coord"),
                                    lokasi.getString("deskripsi")), e.getInt("bintang")));
                    listRoom.add(new Room(room.getString("roomNumber"),room.getString("statusKamar"),
                            room.getDouble("dailyTariff"),room.getString("tipeKamar")));
                    childMapping.put(listHotel.get(0), listRoom);

                }
                catch (JSONException e) {

                }
            }


        };
    }
}