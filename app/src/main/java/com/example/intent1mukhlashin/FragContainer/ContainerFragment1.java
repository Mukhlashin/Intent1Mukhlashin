package com.example.intent1mukhlashin.FragContainer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.intent1mukhlashin.R;

public class ContainerFragment1 extends RecyclerView.ViewHolder {

    LinearLayout lnrv1;
    ImageView imgrv1;
    TextView tvrv1;

    public ContainerFragment1(@NonNull View itemView, Context context) {
        super(itemView);

        imgrv1 = itemView.findViewById(R.id.img_rv1);
        tvrv1 = itemView.findViewById(R.id.tv_rv1);
        lnrv1 = itemView.findViewById(R.id.ln_container1);

    }
}
