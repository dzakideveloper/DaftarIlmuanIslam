package com.dzaki.sierra.daftarilmuanislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListIlmuwanActivity extends AppCompatActivity {

    String[] nama = {"Al Khawarizmi",
            "Al Zahrawi",
            "Ibnu al-Baithar",
            "Ibnu al-Nafis",
            "Ibnu Haitham",
            "Ibnu Khaldun",
            "Ibnu Sina",
            "Jabir Ibn- Hayyan",
            "Thbit ibn Qurra",
            "Umar Khayyam"};
    int[] gambar = {R.drawable.alkhawarizmi,
            R.drawable.alzahrawi,
            R.drawable.ibnualbhaitar,
            R.drawable.ibnualnafis,
            R.drawable.ibnuhaitman,
            R.drawable.ibnukhaldun,
            R.drawable.ibnusina,
            R.drawable.jabilibnhayyan,
            R.drawable.thbitibnqurra,
            R.drawable.umarkhayyam};

    String[] url = {"https://id.wikipedia.org/wiki/Mu%E1%B8%A5ammad_bin_M%C5%ABs%C4%81_al-Khaw%C4%81rizm%C4%A",

            "https://id.wikipedia.org/wiki/Abu_al-Qasim_al-Zahraw",

            "https://id.wikipedia.org/wiki/Ibnu_al-Baitha",

            "https://id.wikipedia.org/wiki/Ibnu_al-Nafi",

            "https://id.wikipedia.org/wiki/Ibnu_Haitha",

            "https://id.wikipedia.org/wiki/Ibnu_Khaldu",

            "https://id.wikipedia.org/wiki/Ibnu_Sin",

            "https://id.wikipedia.org/wiki/Abu_Musa_Jabir_bin_Hayya",

            "https://id.wikipedia.org/wiki/Tsabit_bin_Qurra",

            "https://id.wikipedia.org/wiki/Umar_Khayy%C4%81m"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ilmuwan);

        ListView listView = findViewById(R.id.listViewIlmuwan);
        CustomListVIewAdapter customListVIewAdapter = new CustomListVIewAdapter();
        listView.setAdapter(customListVIewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ListIlmuwanActivity.this, DetailIlmuanActivity.class);
                i.putExtra("putnama", nama[position]);
                i.putExtra("puturl", url[position]);
                startActivity(i);
            }
        });
    }

    class CustomListVIewAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return gambar.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.custom_listview, null);

            ImageView imageView = convertView.findViewById(R.id.imgIlmuwan);
            TextView textView = convertView.findViewById(R.id.txtIlmuawan);

            imageView.setImageResource(gambar[position]);
            textView.setText(nama[position]);

            return convertView;

        }
    }

}
