package io.github.adamnain.padangsepuluh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ListMenuActivity extends AppCompatActivity {

    @BindView(R.id.tv_jumNasi)
    TextView tvJumNasi;
    @BindView(R.id.tv_jumRendang)
    TextView tvJumRendang;
    @BindView(R.id.tv_jumAyam)
    TextView tvJumAyam;
    @BindView(R.id.tv_jumIkan)
    TextView tvJumIkan;
    @BindView(R.id.tv_jumTeh)
    TextView tvJumTeh;
    @BindView(R.id.tv_totalHarga)
    TextView tvTotalHarga;

    int totalHarga, jumNasi, jumRendang, jumAyam, jumIkan, jumTeh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);

        ButterKnife.bind(this);
        totalHarga = 0;
        jumNasi = 0;
        jumRendang = 0;
        jumAyam = 0;
        jumIkan = 0;
        jumTeh = 0;
    }

    private int totalHarga(int harga){
        totalHarga = totalHarga+harga;
        return totalHarga;
    }

    private void setTextTotalHarga(int harga){
        tvTotalHarga.setText(""+harga);
    }

    @OnClick(R.id.btn_plusNasi)
    public void plusNasi(){
        int harga = 3000;
        jumNasi = jumNasi+1;
        tvJumNasi.setText(""+jumNasi);
        setTextTotalHarga(totalHarga(harga));
    }

    @OnClick(R.id.btn_minNasi)
    public void minNasi(){
        if(Integer.valueOf(tvJumNasi.getText().toString()) > 0){
            int harga = -3000;
            jumNasi = jumNasi-1;
            tvJumNasi.setText(""+jumNasi);
            setTextTotalHarga(totalHarga(harga));
        }
        else{
            Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.btn_plusRendang)
    public void plusRendang(){
        int harga = 7000;
        jumRendang = jumRendang+1;
        tvJumRendang.setText(""+jumRendang);
        setTextTotalHarga(totalHarga(harga));
    }

    @OnClick(R.id.btn_minRendang)
    public void minRendang(){
        if(Integer.valueOf(tvJumRendang.getText().toString()) > 0){
            int harga = -7000;
            jumRendang = jumRendang-1;
            tvJumRendang.setText(""+jumRendang);
            setTextTotalHarga(totalHarga(harga));
        }
        else{
            Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.btn_plusAyam)
    public void plusAyam(){
        int harga = 7000;
        jumAyam = jumAyam+1;
        tvJumAyam.setText(""+jumAyam);
        setTextTotalHarga(totalHarga(harga));
    }

    @OnClick(R.id.btn_minAyam)
    public void minAyam(){
        if(Integer.valueOf(tvJumAyam.getText().toString()) > 0){
            int harga = -7000;
            jumAyam = jumAyam-1;
            tvJumAyam.setText(""+jumAyam);
            setTextTotalHarga(totalHarga(harga));
        }
        else{
            Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.btn_plusIkan)
    public void plusIkan(){
        int harga = 7000;
        jumIkan = jumIkan+1;
        tvJumIkan.setText(""+jumIkan);
        setTextTotalHarga(totalHarga(harga));
    }

    @OnClick(R.id.btn_minIkan)
    public void minIkan(){
        if(Integer.valueOf(tvJumIkan.getText().toString()) > 0){
            int harga = -7000;
            jumIkan = jumIkan-1;
            tvJumIkan.setText(""+jumIkan);
            setTextTotalHarga(totalHarga(harga));
        }
        else{
            Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.btn_plusTeh)
    public void plusTeh(){
        int harga = 4000;
        jumTeh = jumTeh+1;
        tvJumTeh.setText(""+jumTeh);
        setTextTotalHarga(totalHarga(harga));
    }

    @OnClick(R.id.btn_minTeh)
    public void minTeh(){
        if(Integer.valueOf(tvJumTeh.getText().toString()) > 0){
            int harga = -4000;
            jumTeh = jumTeh-1;
            tvJumTeh.setText(""+jumTeh);
            setTextTotalHarga(totalHarga(harga));
        }
        else{
            Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.btn_pesan)
    public void pesan(){
        Intent i = new Intent(getApplicationContext(), PesanActivity.class);
        i.putExtra("totalHarga", tvTotalHarga.getText().toString());
        startActivity(i);
    }
}
