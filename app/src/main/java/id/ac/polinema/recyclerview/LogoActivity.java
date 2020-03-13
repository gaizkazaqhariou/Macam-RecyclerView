package id.ac.polinema.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapter.LogoAdapter;
import id.ac.polinema.recyclerview.model.Team;

public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<Team> teams = new ArrayList<>();
        teams.add(new Team("@drawable/liverpool.png", "Liverpool"));
        teams.add(new Team("@drawable/manchester_city.png", "Man. City"));
        teams.add(new Team("@drawable/liverpool.png", "Liverpool"));

        LogoAdapter adapter = new LogoAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }
}
