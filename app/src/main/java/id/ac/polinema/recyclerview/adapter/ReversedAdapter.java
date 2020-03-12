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
import id.ac.polinema.recyclerview.model.Team;

public class ReversedAdapter extends RecyclerView.Adapter<ReversedAdapter.ViewHolder> {

    private static final int LOGO_LEFT = 1;
    private static final int LOGO_RIGHT = 2;
    private Context context;
    private List<Team> items;

    public ReversedAdapter(Context context, List<Team> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        if (viewType == LOGO_LEFT) {
            view = LayoutInflater.from(context)
                    .inflate(R.layout.item_logo, parent, false);
        } else if (viewType == LOGO_RIGHT) {
            view = LayoutInflater.from(context).inflate(R.layout.item_logo_reversed, parent, false);
        }
        return new ReversedAdapter.ViewHolder(view);
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_logo, parent, false);
//        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Team item = items.get(position);
        Picasso.get().load(item.getImage()).into(holder.logoTeam);
        holder.nameTeam.setText(item.getNama());
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    @Override
    public int getItemViewType(int position) {
        return (position % 2 == 0) ? LOGO_RIGHT : LOGO_LEFT;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoTeam;
        TextView nameTeam;

        public ViewHolder(View itemView) {
            super(itemView);
            logoTeam = itemView.findViewById(R.id.image_logo);
            nameTeam = itemView.findViewById(R.id.tvNameClub);
        }
    }
}
