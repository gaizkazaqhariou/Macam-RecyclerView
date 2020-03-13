package id.ac.polinema.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.adapters.ItemAdapter;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapter.TeamItem;

public class FastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast);
        RecyclerView teamsView = findViewById(R.id.rv_teams);
        ItemAdapter itemAdapter = new ItemAdapter();
        FastAdapter fastAdapter = FastAdapter.with(itemAdapter);

        List teams = new ArrayList<>();
        teams.add(new TeamItem("@drawable/liverpool.png", "Liverpool"));
        teams.add(new TeamItem("@drawable/manchester_city.png", "Man. City"));
        teams.add(new TeamItem("@drawable/liverpool.png", "Liverpool"));

        itemAdapter.add(teams);
        teamsView.setAdapter(fastAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }
}
