package br.com.local.mercadosa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    public Context context;
    public List<Mercadoria> lstMercadorias;

    public MyAdapter(Context context, List<Mercadoria> lstMercadorias) {
        this.context = context;
        this.lstMercadorias = lstMercadorias;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_produtos, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nomeMercadoria.setText(lstMercadorias.get(position).getNome());
        holder.imagemMercadoria.setImageResource(lstMercadorias.get(position).getImagem());

        //clicando no cardMercadoria
        holder.cardMercadoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

    }

    @Override
    public int getItemCount() {
        return lstMercadorias.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nomeMercadoria;
        ImageView imagemMercadoria;
        CardView cardMercadoria;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nomeMercadoria = itemView.findViewById(R.id.idTituloMercadorias);
            imagemMercadoria = itemView.findViewById(R.id.idImgMercadorias);
            cardMercadoria = itemView.findViewById(R.id.idCardMercadorias);
        }
    }
}
