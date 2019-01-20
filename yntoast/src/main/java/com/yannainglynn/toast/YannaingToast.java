package com.yannainglynn.toast;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class YannaingToast {
    Context context;
    LayoutInflater layoutInflater;

    public YannaingToast(Context context, LayoutInflater layoutInflater) {
        this.context = context;
        this.layoutInflater = layoutInflater;
    }

    // My custom toast
    public void btntoast(View view) {
        Context context=this.context;
        LayoutInflater inflater=layoutInflater;

        View customToastroot =inflater.inflate(R.layout.mytoast, null);

        Toast customtoast=new Toast(context);

        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }
    // Red toast
    public void btnRed(View view) {
        Context context=this.context;
        LayoutInflater inflater=layoutInflater;

        View customToastroot =inflater.inflate(R.layout.red_toast, null);

        Toast customtoast=new Toast(context);

        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }
    // Yellow toast
    public void btnYellow(View view) {
        Context context=this.context;
        LayoutInflater inflater=layoutInflater;

        View customToastroot =inflater.inflate(R.layout.yellow_toast, null);

        Toast customtoast=new Toast(context);

        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }
    // Blue toast
    public void btnBlue(View view) {
        Context context=this.context;
        LayoutInflater inflater=layoutInflater;

        View customToastroot =inflater.inflate(R.layout.blue_toast, null);

        Toast customtoast=new Toast(context);

        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }

}
