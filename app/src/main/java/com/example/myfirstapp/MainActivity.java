package com.example.myfirstapp;

import android.graphics.Color;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout rel = new RelativeLayout(this);

        // Button
        Button button = new Button(this);
        button.setText("Click me");
        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        // TextView
        TextView txt = new TextView(this);
        txt.setTextColor(Color.argb(255,22,33,250));
        txt.setText(R.string.hello_world);
        txt.setId(42);

        RelativeLayout.LayoutParams txtDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        txtDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        txtDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        buttonDetails.addRule(RelativeLayout.ABOVE, 42);
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);

        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 500, this.getResources().getDisplayMetrics());
        button.setWidth(px);

        rel.addView(txt, txtDetails);
        rel.addView(button, buttonDetails);
        setContentView(rel);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //if (id == R.id.action_settings) {
        //    return true;
        //}

        return super.onOptionsItemSelected(item);
    }
}
