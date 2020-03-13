package id.ac.polinema.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapter.ReversedAdapter;
import id.ac.polinema.recyclerview.model.Team;

public class ViewTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_type);

        RecyclerView teamsView = findViewById(R.id.rv_teams);
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("@drawable/liverpool.png", "Liverpool"));
        teams.add(new Team("@drawable/manchester_city.png", "Man. City"));
        teams.add(new Team("@drawable/liverpool.png", "Liverpool"));

        ReversedAdapter adapter = new ReversedAdapter(this, teams);
        teamsView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.HORIZONTAL);
        teamsView.setLayoutManager(layoutManager);
    }
}
