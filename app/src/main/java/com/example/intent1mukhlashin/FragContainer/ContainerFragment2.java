package com.example.intent1mukhlashin.FragContainer;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.intent1mukhlashin.R;

public class ContainerFragment2 extends RecyclerView.ViewHolder {

    LinearLayout lnrv2;
    ImageView imgrv2;
    TextView tvrv2;

    public ContainerFragment2(@NonNull View itemView) {
        super(itemView);

        imgrv2 = itemView.findViewById(R.id.img_rv2);
        tvrv2 = itemView.findViewById(R.id.tv_rv2);
        lnrv2 = itemView.findViewById(R.id.ln_container2);
    }
}
