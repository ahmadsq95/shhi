package s.ahmadsq.shhi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class manageActivity extends AppCompatActivity {

    private Button addAccountButt;
    private Button deleteAccountButt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage);
        addAccountButt = findViewById(R.id.addAccountButt);
        deleteAccountButt = findViewById(R.id.deleteAccountButt);

        addAccountButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), add_accountActivity.class);
                startActivity(intent);
            }
        });

        deleteAccountButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), delete_accountActivity.class);
                startActivity(intent);
            }
        });


    }
}
