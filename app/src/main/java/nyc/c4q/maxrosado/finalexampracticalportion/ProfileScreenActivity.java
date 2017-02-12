package nyc.c4q.maxrosado.finalexampracticalportion;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ProfileScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_screen);
        NavigationView navigationMenu = (NavigationView) findViewById(R.id.profile_nav_drawer);
        setupDrawerContent(navigationMenu);

    }

    public void setHeartButton(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Selected Heart Activity", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void setMessageButton(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Selected Message Activity", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void setSettingsButton (View view) {
        Intent intent = new Intent(this, SettingsScreenActivity.class);
        startActivity(intent);
    }

    public void setLogOffButton (View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Selected Logout Activity", Toast.LENGTH_SHORT);
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        toast.show();
        startActivity(intent);
    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        selectDrawerItem(menuItem);
                        return true;
                    }
                });
    }

    private void selectDrawerItem(MenuItem menuItem) {
        switch(menuItem.getItemId()) {
            case R.id.heart_nav_button:
                Toast toast1 = Toast.makeText(getApplicationContext(), "Selected Heart Activity", Toast.LENGTH_SHORT);
                toast1.show();
                break;
            case R.id.message_nav_button:
                Toast toast2 = Toast.makeText(getApplicationContext(), "Selected Message Activity", Toast.LENGTH_SHORT);
                toast2.show();
                break;
            case R.id.settings_nav_button:
                Intent intent1 = new Intent(this, SettingsScreenActivity.class);
                startActivity(intent1);
                break;
            case R.id.log_out_nav_button:
                Toast toast = Toast.makeText(getApplicationContext(), "Selected Logout Activity", Toast.LENGTH_SHORT);
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                toast.show();
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
