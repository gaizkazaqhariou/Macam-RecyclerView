package id.ac.polinema.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.polinema.recyclerview.R;
import id.ac.polinema.recyclerview.model.Berita;

public class ExcerciseAdapter extends RecyclerView.Adapter<ExcerciseAdapter.ViewHolder> {
    private static final int LOGO_LEFT = 1;
    private static final int LOGO_RIGHT = 2;
    private Context context;
    private List<Berita> items;

    public ExcerciseAdapter(Context context, List<Berita> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        if (viewType == LOGO_LEFT) {
            view = LayoutInflater.from(context).inflate(R.layout.item_excercise, parent, false);
        } else if (viewType == LOGO_RIGHT) {
            view = LayoutInflater.from(context).inflate(R.layout.item_excercise_grey, parent, false);
        }
        return new ExcerciseAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Berita item = items.get(position);
        Picasso.get().load(item.getImage()).into(holder.ivLogo);
        holder.tvNama.setText(item.getNama());
        holder.tvJudul.setText(item.getJudul());
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    @Override
    public int getItemViewType(int position) {
        return (position % 4 == 0 || position % 4 == 3) ? LOGO_RIGHT : LOGO_LEFT;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivLogo;
        TextView tvNama, tvJudul;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivLogo = itemView.findViewById(R.id.ivLogo);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvJudul = itemView.findViewById(R.id.tvJudul);
        }
    }
}
