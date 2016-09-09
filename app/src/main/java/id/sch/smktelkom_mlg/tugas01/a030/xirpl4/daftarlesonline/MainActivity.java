package id.sch.smktelkom_mlg.tugas01.a030.xirpl4.daftarlesonline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNamaSiswa;
    EditText etNomor;
    EditText etEmail;
    EditText etNamaOrtu;
    EditText etNomorOrtu;
    EditText etAlamat;
    Button bOk;
    TextView tvHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNamaSiswa = (EditText) findViewById(R.id.editTextNama);
        etNomor = (EditText) findViewById(R.id.editTextNomor);
        etEmail = (EditText) findViewById(R.id.editTextEmail);
        etNamaOrtu = (EditText) findViewById(R.id.editTextNamaOrtu);
        etNomorOrtu = (EditText) findViewById(R.id.editTextNomorOrtu);
        etAlamat = (EditText) findViewById(R.id.editTextAlamat);

        bOk = (Button) findViewById(R.id.buttonOK);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

    }
}
