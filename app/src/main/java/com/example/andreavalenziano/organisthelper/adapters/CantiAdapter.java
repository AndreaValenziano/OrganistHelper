package com.example.andreavalenziano.organisthelper.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.andreavalenziano.organisthelper.R;
import com.example.andreavalenziano.organisthelper.models.Canto;

import java.util.ArrayList;

/**
 * Created by AndreaValenziano on 01/03/17.
 */
public class CantiAdapter extends RecyclerView.Adapter<CantiAdapter.CantiVH>{

    public Context context;
    private ArrayList<Canto> dataSet=new ArrayList<>();

    public CantiAdapter(Context context){
       this.context=context;
    }

    @Override
    public CantiAdapter.CantiVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_canto,parent,false);
        return new CantiVH(view);
    }

    @Override
    public void onBindViewHolder(CantiAdapter.CantiVH holder, int position) {
        Canto canto=dataSet.get(position);
        holder.titleCantoTV.setText(canto.getTitle());
        holder.catCantoTV.setText(canto.getCategoria());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public ArrayList<Canto> getDataSet() {
        return dataSet;
    }

    public void setDataSet(ArrayList<Canto> dataSet) {
        this.dataSet = dataSet;
        notifyDataSetChanged();
    }

    public void addCanto(Canto canto){
        dataSet.add(0,canto);
        notifyItemInserted(0);
    }
    public void updateCanto(int index,Canto canto){
        dataSet.set(index, canto);
        notifyDataSetChanged();
    }
    public void deleteCanto(int index){
        dataSet.remove(index);
        notifyDataSetChanged();
    }

    public class CantiVH extends RecyclerView.ViewHolder {

        TextView titleCantoTV, catCantoTV;

        public CantiVH(View itemView) {
            super(itemView);
            titleCantoTV=(TextView) itemView.findViewById(R.id.title_canto);
            catCantoTV=(TextView)itemView.findViewById(R.id.categoria_canto_item);
        }
    }
}
