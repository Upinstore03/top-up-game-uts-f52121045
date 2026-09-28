package com.farhat_arif_ghozi_f52121045.aplikasi_uts;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] namaGame = {
            "Mobile Legends",
            "PUBG Mobile",
            "Genshin Impact",
            "Minecraft",
            "Valorant"
    };

    String[] jenisGame = {
            "MOBA • Mobile",
            "Battle Royale • Mobile",
            "RPG • Mobile",
            "Sandbox • PC & Mobile",
            "FPS • PC"
    };

    String[] layananGame = {
            "Top Up Diamond",
            "Top Up UC",
            "Top Up Genesis Crystal",
            "Top Up Minecoins",
            "Top Up Valorant Points"
    };

    int[] gambarGame = {
            R.drawable.mobile_legends,
            R.drawable.pubg_mobile,
            R.drawable.genshin_impact,
            R.drawable.minecraft,
            R.drawable.valorant
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listGame = findViewById(R.id.listGame);

        GameAdapter adapter = new GameAdapter(
                this,
                namaGame,
                jenisGame,
                layananGame,
                gambarGame
        );

        listGame.setAdapter(adapter);

        listGame.setOnItemClickListener((parent, view, position, id) ->
                Toast.makeText(
                        MainActivity.this,
                        namaGame[position] + " dipilih",
                        Toast.LENGTH_SHORT
                ).show()
        );
    }
}