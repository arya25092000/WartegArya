package com.sefrianarya.wartegarya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<ModelMenu> mList;
    private AdapterMenu mAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mList = new ArrayList<>();
        mList.add(
                new ModelMenu(
                        R.drawable.telurdadar,
                        "Telur Dadar",
                        "Makanan yang menggunakan telur lalu ditambah dengan sayuran dan cabai sebagai penambah pedas.",
                        5000));
        mList.add(
                new ModelMenu(
                        R.drawable.osengkentang,
                        "Oseng-Oseng Kentang",
                        "Makanan yang menggunakan kentang dengan cabai beserta sayuran. Ditambah lagi bisa ditambahkan dengan protein lain yaitu ati ampela.",
                        4000));
        mList.add(
                new ModelMenu(
                        R.drawable.sayurasem,
                        "Sayur Asem",
                        "Makanan berkuah dengan rasa asam ditambah dengan cabai agar ada asam pedasnya. Tidak hanya itu, ada sayuran pelengkap seperti jagung, lodeh, labu siam,dll.",
                        4000));
        mList.add(
                new ModelMenu(
                        R.drawable.perkedel,
                        "Perkedel",
                        "Gorengan dengan menggunakan bahan utama kentang yang ditumbuk kemudian dicampur dengan sayuran atau daging.",
                        1000));
        mList.add(new ModelMenu(
                R.drawable.sopayam,
                "Sop Ayam",
                "Makanan berkuah dengan daging ayam beserta kaldu ayam yang enak. Ditambah dengan sayurang seperti wortel dll untuk menemani kehangatan.",
                7000));
        mList.add(new ModelMenu(
                R.drawable.tahucampur,
                "Tahu Campur",
                "Makanan khas Surabaya berbahan dasar tahu. Ditambah dengan taoge, mie, dan saus kacang beserta kerupuk warna warni sebagai pelengkap.",
                3500));
        mList.add(new ModelMenu(
                R.drawable.rendang,
                "Rendang Sapi",
                "Masakan khas Padang yang sangat populer hingga sekarang dengan bahan utama sapi. Dengan bumbu tradisional beserta kuah kari yang sedap.",
                12000));

        mAdapter = new AdapterMenu(this, mList);
        recyclerView.setAdapter(mAdapter);
    }
}