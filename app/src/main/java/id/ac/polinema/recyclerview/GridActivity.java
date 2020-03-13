package id.ac.polinema.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapter.GridAdapter;
import id.ac.polinema.recyclerview.model.Team;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<Team> teams = new ArrayList<>();
        teams.add(new Team("@drawable/liverpool.png", "Liverpool"));
        teams.add(new Team("@drawable/manchester_city.png", "Man. City"));
        teams.add(new Team("@drawable/liverpool.png", "Liverpool"));

        GridAdapter adapter = new GridAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}
