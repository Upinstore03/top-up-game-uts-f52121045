package com.farhat_arif_ghozi_f52121045.aplikasi_uts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GameAdapter extends ArrayAdapter<String> {

    private Context context;
    private String[] namaGame;
    private String[] jenisGame;
    private String[] layananGame;
    private int[] gambarGame;

    public GameAdapter(Context context,
                       String[] namaGame,
                       String[] jenisGame,
                       String[] layananGame,
                       int[] gambarGame) {

        super(context, R.layout.item_game, namaGame);

        this.context = context;
        this.namaGame = namaGame;
        this.jenisGame = jenisGame;
        this.layananGame = layananGame;
        this.gambarGame = gambarGame;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.item_game, parent, false);
        }

        ImageView gambar = view.findViewById(R.id.imgGame);
        TextView nama = view.findViewById(R.id.txtNamaGame);
        TextView jenis = view.findViewById(R.id.txtJenisGame);
        TextView layanan = view.findViewById(R.id.txtLayananGame);

        gambar.setImageResource(gambarGame[position]);
        nama.setText(namaGame[position]);
        jenis.setText(jenisGame[position]);
        layanan.setText(layananGame[position]);

        return view;
    }
}