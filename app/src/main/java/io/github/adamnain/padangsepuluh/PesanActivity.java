package io.github.adamnain.padangsepuluh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PesanActivity extends AppCompatActivity {

    @BindView(R.id.tv_totalHargaPesan)
    TextView tvHargapesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);

        ButterKnife.bind(this);

        tvHargapesan.setText("Rp."+getIntent().getStringExtra("totalHarga"));
    }
}
