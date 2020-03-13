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
        bt.add(new Berita("https://upload.wikimedia.org/wikipedia/en/thumb/7/7f/RBC_Royal_Bank.svg/1200px-RBC_Royal_Bank.svg.png", "RBC News", "A City Living Under the Shadow"));
        bt.add(new Berita("https://vignette.wikia.nocookie.net/tvfanon6528/images/0/0e/BBC_World_News_%282019-.n.v.%29.png/revision/latest?cb=20190715171938", "BBC World", "The Golden Secret to Better Breakfast"));
        bt.add(new Berita("https://images.squarespace-cdn.com/content/v1/5436a303e4b03395a9c75ebc/1525311215317-QA6HMPP97IBSUFV3RR8N/ke17ZwdGBToddI8pDm48kDGihCofVLFFQ3A_62QlDaF7gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z5QPOohDIaIeljMHgDF5CVlOqpeNLcJ80NK65_fV7S1UdKJhKFH3AuJnhryvAnjP5ItMcsXfXrRYcAvHbZOeqcY3WUfc_ZsVm9Mi1E6FasEnQ/Appealing-Nytimes-Logo-43-On-Free-Logo-Design-with-Nytimes-Logo-945x1221.jpg.png", "NY Times", "One Problem for Democratic Leaders"));
        bt.add(new Berita("https://www.freepnglogos.com/uploads/nbc-png-logo/play-games-nbc-png-logo-16.png", "NBC Nightly", "How to Plan Your First Ski Vacation"));
        bt.add(new Berita("https://upload.wikimedia.org/wikipedia/en/thumb/7/7f/RBC_Royal_Bank.svg/1200px-RBC_Royal_Bank.svg.png", "RBC News", "How Social Isolation Is Killing Us"));
        bt.add(new Berita("https://vignette.wikia.nocookie.net/tvfanon6528/images/0/0e/BBC_World_News_%282019-.n.v.%29.png/revision/latest?cb=20190715171938", "BBC World", "Use Labels to Sort Messages in Facebook"));

        ExcerciseAdapter adapter = new ExcerciseAdapter(this, bt);
        berita.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        berita.setLayoutManager(layoutManager);
    }
}
