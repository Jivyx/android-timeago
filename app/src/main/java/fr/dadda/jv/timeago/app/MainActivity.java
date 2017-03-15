package fr.dadda.jv.timeago.app;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

import fr.dadda.jv.timeago.TimeAgo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(fr.dadda.jv.timeago.app.R.layout.activity_main);

        setDate(R.id.tvDate1, R.id.tvTimeAgo1, new Date(System.currentTimeMillis() - 5 * 1000));
        setDate(R.id.tvDate2, R.id.tvTimeAgo2, new Date(System.currentTimeMillis() - 15 * 60 * 1000));
        setDate(R.id.tvDate3, R.id.tvTimeAgo3, new Date(System.currentTimeMillis() - 75 * 60 * 1000));
    }

    private void setDate(@IdRes int tvDateRes, @IdRes int tvTimeAgoRes, Date date) {
        TextView tvDate = (TextView) findViewById(tvDateRes);
        TextView tvTimeAgo = (TextView) findViewById(tvTimeAgoRes);
        tvDate.setText(date.toString());
        tvTimeAgo.setText(TimeAgo.timeAgo(this, date));
    }
}
