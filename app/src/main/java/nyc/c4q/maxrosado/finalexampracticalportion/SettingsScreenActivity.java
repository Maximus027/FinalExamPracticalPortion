package nyc.c4q.maxrosado.finalexampracticalportion;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SettingsScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_screen);

        RecyclerView settingsRecyclerView = (RecyclerView) findViewById(R.id.activity_settings_screen);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        settingsRecyclerView.setLayoutManager(linearLayoutManager);
    }

    public class Setting {
        private String setting;

        public Setting (int number) {
            
        }
    }

    public class SettingsViewHolder extends RecyclerView.ViewHolder {
        private TextView tv1;
        private RecyclerView.ViewHolder settingsVH;
        private RecyclerView settingsRV;

        public SettingsViewHolder(View itemView) {
            super(itemView);
            tv1 = (TextView) itemView.findViewById(R.id.settings_tv);
        }

        public void bind() {
        }
    }

    public class SettingsAdapter extends RecyclerView.Adapter<SettingsViewHolder> {
        private Context context;


        @Override
        public SettingsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(SettingsViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }
}
