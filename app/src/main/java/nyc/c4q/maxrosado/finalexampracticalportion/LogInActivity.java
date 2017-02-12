package nyc.c4q.maxrosado.finalexampracticalportion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void setSubmitButton(View view) {
        EditText usernameET = (EditText) findViewById(R.id.username_et);
        EditText passwordET = (EditText) findViewById(R.id.password_et);

        String username = usernameET.getText().toString();
        String password = passwordET.getText().toString();

        if (username == "" || username == null || username.isEmpty() || username.length() == 0) {
            noUsernameToast(view);
        }
        if (password == "" || password == null || username.isEmpty() || username.length() == 0) {
            noPasswordToast(view);
        }
        if (username.length() != 0 && password.length() != 0) {
            goToMainScreenActivity(view);
        }

    }

    public void goToMainScreenActivity(View view) {
        Intent intent = new Intent(this, MainScreenActivity.class);
        startActivity(intent);
    }

    public void noUsernameToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "No Username entered!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void noPasswordToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "No Password entered!", Toast.LENGTH_SHORT);
        toast.show();
    }
}
