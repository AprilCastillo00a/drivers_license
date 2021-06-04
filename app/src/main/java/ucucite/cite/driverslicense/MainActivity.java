package ucucite.cite.driverslicense;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editName;
    EditText editNationality;
    EditText editSex;
    EditText editDate;
    EditText editWeight;
    EditText editHeight;
    EditText editAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editName);
        editNationality = findViewById(R.id.editNationality);
        editSex = findViewById(R.id.editSex);
        editDate = findViewById(R.id.editDate);
        editWeight = findViewById(R.id.editWeight);
        editHeight = findViewById(R.id.editHeight);
        editAddress = findViewById(R.id.editAddress);


    }

    public void btnFunction(View view) {
        String name = editName.getText().toString();
        String code = editNationality.getText().toString();
        String sex = editSex.getText().toString();
        String date = editDate.getText().toString();
        String weight = editWeight.getText().toString();
        String height = editHeight.getText().toString();
        String add = editAddress.getText().toString();


        if (name.isEmpty() || code.isEmpty() || sex.isEmpty() || date.isEmpty() || weight.isEmpty() || height.isEmpty() || add.isEmpty())
        {
            Toast.makeText(getBaseContext(), "No Data has been entered!", Toast.LENGTH_SHORT).show();


        } else {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Confirmation");
            builder.setMessage("Do you want to proceed with the changes?");
            builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int i) {

                    Intent intent = new Intent(MainActivity.this, Output.class);
                    intent.putExtra("NAME", name);
                    intent.putExtra("CODE", code);
                    intent.putExtra("SEX", sex);
                    intent.putExtra("DATE", date);
                    intent.putExtra("TABA", weight);
                    intent.putExtra("TAAS", height);
                    intent.putExtra("ADD", add);
                    startActivity(intent);

                }
            });
            builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            builder.show();


        }
    }
}