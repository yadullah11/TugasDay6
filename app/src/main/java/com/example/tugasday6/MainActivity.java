package com.example.tugasday6;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private com.example.tugasday6.AdapterJam adapterJam;
    private ArrayList<MerkJam> merkjam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.cars);
        adapterJam = new AdapterJam(merkjam);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterJam);

        adapterJam.setOnItemClickListener(new com.example.tugasday6.AdapterJam.OnItemClickListener() {
            @Override
            public void onItemClick(MerkJam merk) {

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);

                intent.putExtra("nama_barang", merk.getNamaJam());
                intent.putExtra("deskripsi_barang", getDeskripsiJam(merk.getNamaJam()));
                intent.putExtra("harga_barang", getHargaJam(merk.getNamaJam()));
                intent.putExtra("gambar_barang", merk.getGambarJam());
                startActivity(intent);
            }
        });
    }

    private void getData() {
        merkjam = new ArrayList<>();
        merkjam.add(new MerkJam("Alexandre Christhie 6653MC", R.drawable.ac_mc, "Kronograf,Casing dan Tali Baja Tahan Karat,Diameter Kasus 45 mm,Gesper Pengaman,5 ATM.", 1430000));
        merkjam.add(new MerkJam("Alexandre Christhie 6609MD", R.drawable.ac_md, "Kronograf,Casing Stainless Steel dan Tali Kulit,Diameter Kasus 46mm,Gesper Pin,5 ATM. ", 1300000));
        merkjam.add(new MerkJam("Alexandre Christhie 8694MEN", R.drawable.ac_men, "3 Hands dengan Indikator Tanggal,Casing dan Tali Baja Tahan Karat,Diameter Kasus 39 mm,Ketebalan Casing 6,8 mm,Gesper Pin 3 ATM.", 1200000));
        merkjam.add(new MerkJam("Alexandre Christhie 8693MFL", R.drawable.ac_mfl, "3 Hands dengan Indikator Tanggal,Casing Stainless Steel ABS dengan Tali Silikon,Diameter Kasus 44 mm,Gesper Pin,3 ATM. ", 880000));
        merkjam.add(new MerkJam("Alexandre Christhie 9397MPR", R.drawable.ac_mpr, "3 Hands,Casing ABS + Bezel Baja IPGun dan Tali Silikon,Diameter Kasus 40 mm,Sekrup Back,Gesper Pin,Ukuran Lug : 20 mm,3 ATM.", 9000000));
        merkjam.add(new MerkJam("HUBLOT ENERGY SYSTEM TITANIUM", R.drawable.hublot_energysystem, "Hublot MP-10 Tourbillon Weight Energy System Titanium dirancang menggunakan micro-blasted titanium case dengan bentuk persegi panjang.Case-nya memiliki lebar 41,5 mm, panjang 54,1 mm, dan tebal  22,4 mm. Selain itu, jam tangan ini juga memiliki ketahanan air hingga 30 meter sehingga masih tetap aman dipakai walaupun terkena cipratan air.", 420000000));
        merkjam.add(new MerkJam("HUBLOT TAKASHI MURAKAMI TOURBILLON SAPPHIRE", R.drawable.hublot_flower, "Hublot MP-15 Takashi Murakami Tourbillon Sapphire dilengkapi strap yang tampak mirip dengan versi Only Watch. Strap-nya terbuat dari rubber transparan dengan titanium folding clasp yang dihiasi sapphire insert.", 490000000));
        merkjam.add(new MerkJam("HUBLOT INTEGRATED TOURBILLON FULL CARBON", R.drawable.hublot_fullcarbon, "Hublot Big Bang Integrated Tourbillon Full Carbon tampil sedikit lebih kecil dari ukurannya yang 43 mm berkat casing dan gelang berwarna abu-abu muda monokromatik. Jam tangan baru ini sangat ringan berkat konstruksi serat karbon dan tesalium, dan untuk harganya, mempertimbangkan penggunaan bahan inovatif dan mesin jam tourbillon yang indah, jam tangan ini sangat cocok untuk harganya. Big Bang Integrated Tourbillon Full Carbon tersedia dalam edisi terbatas 50 buah yang sangat eksklusif. ", 990000000));
        merkjam.add(new MerkJam("HUBLOT UNICO TITANIUM RAINBOW", R.drawable.hublot_rainbow, "Set Titanium Selesai Satin dan Dipoles dengan 162 Rubi, Safir Merah Muda, Batu Kecubung, Safir Biru, Topaz Biru, Tsavorit, Safir Kuning dan Oranye dan bingkainya Set Emas Putih 18K berlapis satin dan dipoles dengan 48 Batu Permata Berwarna potongan Baguette.", 740000000));
        merkjam.add(new MerkJam("HUBLOT ORIGINAL TITANIUM", R.drawable.hublot_titanium, "Jam ini sudah dilengkapi dengan Gesper Gesper Penyebaran Khusus Titanium dan Lapis Hitam dan juga dilengkapi dengan titanium berlapis satin yang dipoles. ", 90000000));
        merkjam.add(new MerkJam("ROLEX DAYTONA", R.drawable.rolex_daytona, "Cosmograph Daytona 116518LN dihadirkan dengan casing emas kuning 40 mm. Pelat jam meteorit dengan sub pelat jam berwarna hitam dilengkapi dengan jarum detik sapuan tengah yang memungkinkan pembacaan akurat 1/8 detik, sedangkan dua penghitung pada pelat jam menampilkan waktu yang telah berlalu dalam jam dan menit.", 880000000));
        merkjam.add(new MerkJam("ROLEX DEEPSEA", R.drawable.deepsea, "Simbol dari sejarah yang lama dilalui bersama antara Rolex dan para penjelajah laut dalam, Rolex Deepsea adalah jam tangan penyelam profesional yang ‘tahan banting’. Jam-jam tangan ini kedap air hingga kedalaman 3.900 meter (12.800 kaki) untuk Rolex.", 235000000));
        merkjam.add(new MerkJam("ROLEX HULK SUBMARINE", R.drawable.hulk, "Sisipan Cerachrom Hijau Bingkai Bingkai Keramik,Terukir Skala 60 Menit dan Graduasi pada Bezel Angka dan Graduasi Dilapisi Platinum.", 418000000));
        merkjam.add(new MerkJam("ROLEX GMT MASTER-II PEPSI ", R.drawable.rolex_pepsi, "Casing baja tahan karat 40 mm dengan casing tengah monoblok Oystersteel, kenop berulir, bingkai cincin graduasi 24 jam yang dapat diputar dua arah dengan sisipan Cerachrom merah dan biru serta angka terukir, kristal safir anti gores dengan lensa cyclops penunjuk tanggal.", 402000000));
        merkjam.add(new MerkJam("ROLEX STEEL AND YELLOW GOLD", R.drawable.steel, "Rolesor Kuning 41 mm dengan casing tengah monoblok baja 904L, bagian belakang baja yang disekrup, kenop sekrup di bawah emas kuning 18K, bingkai cincin bergalur emas kuning 18K , kristal safir anti-reflektif ganda anti gores dengan lensa cyclops pada tanggal, pelat jam hitam. ", 298000000));
    }

    private String getDeskripsiJam(String namaJam) {
        for (MerkJam jam : merkjam) {
            if (jam.getNamaJam().equals(namaJam)) {
                return jam.getDeskripsiJam();
            }
        }
        return "";
    }

    private double getHargaJam(String namaJam) {
        for (MerkJam jam : merkjam) {
            if (jam.getNamaJam().equals(namaJam)) {
                return jam.getHargaJam();
            }
        }
        return 0.0;
    }
}