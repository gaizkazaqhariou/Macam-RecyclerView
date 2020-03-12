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
        teams.add(new Team("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool"));
        teams.add(new Team("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Man. City"));

        ReversedAdapter adapter = new ReversedAdapter(this, teams);
        teamsView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.HORIZONTAL);
        teamsView.setLayoutManager(layoutManager);
    }
}
