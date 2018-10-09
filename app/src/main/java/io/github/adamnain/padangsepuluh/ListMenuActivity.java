package io.github.adamnain.padangsepuluh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
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
    @BindView(R.id.btn_plusNasi)
    Button btnPlusNasi;
    @BindView(R.id.btn_minNasi)
    Button btnMinNasi;
    @BindView(R.id.btn_plusRendang)
    Button btnPlusRendang;
    @BindView(R.id.btn_minRendang)
    Button btnMinRendang;
    @BindView(R.id.btn_plusAyam)
    Button btnPlusAyam;
    @BindView(R.id.btn_minAyam)
    Button btnMinAyam;
    @BindView(R.id.btn_plusIkan)
    Button btnPlusIkan;
    @BindView(R.id.btn_minIkan)
    Button btnMinIkan;
    @BindView(R.id.btn_plusTeh)
    Button btnPlusTeh;
    @BindView(R.id.btn_minTeh)
    Button btnMinTeh;

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

        backButton();
        //register contex menu
        registerForContextMenu(btnPlusNasi);
        registerForContextMenu(btnMinNasi);
        registerForContextMenu(btnPlusRendang);
        registerForContextMenu(btnMinRendang);
        registerForContextMenu(btnPlusAyam);
        registerForContextMenu(btnMinAyam);
        registerForContextMenu(btnPlusIkan);
        registerForContextMenu(btnMinIkan);
        registerForContextMenu(btnPlusTeh);
        registerForContextMenu(btnMinTeh);
    }

    //override context menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        //menu.setHeaderTitle("Context Menu");
        menu.add(0, v.getId(), 0, "1");
        menu.add(0, v.getId(), 0, "2");
        menu.add(0, v.getId(), 0, "3");
        menu.add(0, v.getId(), 0, "4");
        menu.add(0, v.getId(), 0, "5");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int angkaContexMenu = Integer.valueOf(item.getTitle().toString());
        item.getItemId();
        if (item.getItemId() == R.id.btn_plusNasi){
            int harga = 3000*angkaContexMenu;
            jumNasi = jumNasi+angkaContexMenu;
            tvJumNasi.setText(""+jumNasi);
            setTextTotalHarga(totalHarga(harga));
        }
        else if ((item.getItemId() == R.id.btn_minNasi)){
            if(Integer.valueOf(tvJumNasi.getText().toString())-angkaContexMenu < 0){
                Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
            }
            else{
                int harga = -3000*angkaContexMenu;
                jumNasi = jumNasi-angkaContexMenu;
                tvJumNasi.setText(""+jumNasi);
                setTextTotalHarga(totalHarga(harga));
            }

        }
        else if (item.getItemId() == R.id.btn_plusRendang){
            int harga = 7000*angkaContexMenu;
            jumRendang = jumRendang+angkaContexMenu;
            tvJumRendang.setText(""+jumRendang);
            setTextTotalHarga(totalHarga(harga));
        }
        else if ((item.getItemId() == R.id.btn_minRendang)){
            if(Integer.valueOf(tvJumRendang.getText().toString())-angkaContexMenu < 0){
                Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
            }
            else{
                int harga = -7000*angkaContexMenu;
                jumRendang = jumRendang-angkaContexMenu;
                tvJumRendang.setText(""+jumRendang);
                setTextTotalHarga(totalHarga(harga));
            }
        }
        else if (item.getItemId() == R.id.btn_plusAyam){
            int harga = 7000*angkaContexMenu;
            jumAyam = jumAyam+angkaContexMenu;
            tvJumAyam.setText(""+jumAyam);
            setTextTotalHarga(totalHarga(harga));
        }
        else if ((item.getItemId() == R.id.btn_minAyam)){
            if(Integer.valueOf(tvJumAyam.getText().toString())-angkaContexMenu < 0){
                Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
            }
            else{
                int harga = -7000*angkaContexMenu;
                jumAyam = jumAyam-angkaContexMenu;
                tvJumAyam.setText(""+jumAyam);
                setTextTotalHarga(totalHarga(harga));
            }
        }
        else if (item.getItemId() == R.id.btn_plusIkan){
            int harga = 7000*angkaContexMenu;
            jumIkan = jumIkan+angkaContexMenu;
            tvJumIkan.setText(""+jumIkan);
            setTextTotalHarga(totalHarga(harga));
        }
        else if ((item.getItemId() == R.id.btn_minIkan)){
            if(Integer.valueOf(tvJumIkan.getText().toString())-angkaContexMenu < 0){
                Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
            }
            else{
                int harga = -7000*angkaContexMenu;
                jumIkan = jumIkan-angkaContexMenu;
                tvJumIkan.setText(""+jumIkan);
                setTextTotalHarga(totalHarga(harga));
            }
        }
        else if (item.getItemId() == R.id.btn_plusTeh){
            int harga = 4000*angkaContexMenu;
            jumTeh = jumTeh+angkaContexMenu;
            tvJumTeh.setText(""+jumTeh);
            setTextTotalHarga(totalHarga(harga));
        }
        else if ((item.getItemId() == R.id.btn_minTeh)){
            if(Integer.valueOf(tvJumTeh.getText().toString())-angkaContexMenu < 0){
                Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
            }
            else{
                int harga = -4000*angkaContexMenu;
                jumTeh = jumTeh-angkaContexMenu;
                tvJumTeh.setText(""+jumTeh);
                setTextTotalHarga(totalHarga(harga));
            }
        }
        return true;
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

    //untuk enampilkan back button
    public void backButton(){
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Daftar Menu");
    }

    //fungsi back ketika tombol back diklik
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
