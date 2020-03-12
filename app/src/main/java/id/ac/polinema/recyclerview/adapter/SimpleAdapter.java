package id.ac.polinema.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.recyclerview.R;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder> {

    private List<String> items;

    public SimpleAdapter(List<String> items) {
        this.items = items;
    }

    @NonNull
    @Override

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String item = items.get(position);
        holder.nameText.setText(item);
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
        //ini if else mode fast
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameText;

        public ViewHolder(View itemView) {
            super(itemView);
            nameText = itemView.findViewById(R.id.tvNameClub);
        }
    }
}
