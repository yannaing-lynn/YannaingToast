package com.yannainglynn.toast;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class YannaingToast {
    Context context;
    public YannaingToast(Context context) {
        this.context = context;
    }
    // My custom toast
    public void simpleToast(LayoutInflater layoutInflater,String string) {
        Context context=this.context;
        LayoutInflater inflater=layoutInflater;
        View customToastroot =inflater.inflate(R.layout.mytoast, null);
        TextView textView = customToastroot.findViewById(R.id.simpleToast);
        textView.setText(string);
        Toast customtoast=new Toast(context);
        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }
    // Red toast
    public void redToast(LayoutInflater layoutInflater,String string) {
        Context context=this.context;
        LayoutInflater inflater=layoutInflater;

        View customToastroot =inflater.inflate(R.layout.red_toast, null);
        TextView tvRedToast = customToastroot.findViewById(R.id.tvRedToast);
        tvRedToast.setText(string);
        Toast customtoast=new Toast(context);

        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }
    // Yellow toast
    public void yellowToast(LayoutInflater layoutInflater,String string) {
        Context context=this.context;
        LayoutInflater inflater=layoutInflater;

        View customToastroot =inflater.inflate(R.layout.yellow_toast, null);
        TextView tvYellowToast = customToastroot.findViewById(R.id.tvYellowToast);
        tvYellowToast.setText(string);
        Toast customtoast=new Toast(context);

        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }
    // Blue toast
    public void blueToast(LayoutInflater layoutInflater,String string) {
        Context context=this.context;
        LayoutInflater inflater=layoutInflater;
        View customToastroot =inflater.inflate(R.layout.blue_toast, null);
        TextView tvBlueToast = customToastroot.findViewById(R.id.tvBlueToast);
        tvBlueToast.setText(string);
        Toast customtoast=new Toast(context);

        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }

}
