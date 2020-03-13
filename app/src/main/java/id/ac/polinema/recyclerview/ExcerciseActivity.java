package id.ac.polinema.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapter.ExcerciseAdapter;
import id.ac.polinema.recyclerview.model.Berita;

public class ExcerciseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excercise);

        RecyclerView berita = findViewById(R.id.rv_teams);

        List<Berita> bt = new ArrayList<>();
        bt.add(new Berita("@drawable/rbc.png", "RBC News", "A City Living Under the Shadow"));
        bt.add(new Berita("@drawable/bbc.png", "BBC World", "The Golden Secret to Better Breakfast"));
        bt.add(new Berita("@drawable/nytimes.png", "NY Times", "One Problem for Democratic Leaders"));
        bt.add(new Berita("@drawable/nbc.png", "NBC Nightly", "How to Plan Your First Ski Vacation"));
        bt.add(new Berita("@drawable/rbc.png", "RBC News", "How Social Isolation Is Killing Us"));
        bt.add(new Berita("@drawable/bbc.png", "BBC World", "Use Labels to Sort Messages in Facebook"));

        ExcerciseAdapter adapter = new ExcerciseAdapter(this, bt);
        berita.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        berita.setLayoutManager(layoutManager);
    }
}
