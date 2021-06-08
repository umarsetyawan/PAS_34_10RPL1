package com.example.pas_34_10rpl1;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;

public interface ItemClickListener {

    void onItemListener(View v, int Position);
    boolean onItemHolde(MenuItem item, int Position);
}
