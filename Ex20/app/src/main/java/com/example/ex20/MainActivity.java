package com.example.ex20;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button btnStart;
    private ProgressBar progressBar;
    private TextView textView;
    private MyAsyncTask myTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = findViewById(R.id.button1);
        progressBar = findViewById(R.id.progressBar1);
        textView = findViewById(R.id.textView1);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTask();
            }
        });
    }

    private void startTask() {
        myTask = new MyAsyncTask(this);
        myTask.execute();
    }


    public class MyAsyncTask extends AsyncTask<Void, Integer, Void> {

        private Activity context;

        public MyAsyncTask(Activity context) {
            this.context = context;
        }

        @Override
        protected void onPreExecute() {
            Toast.makeText(context, "Bắt đầu tiến trình...", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            for (int i = 0; i <= 100; i++) {
                SystemClock.sleep(100);
                publishProgress(i);
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            int progress = values[0];
            progressBar.setProgress(progress);
            textView.setText(progress + "%");
        }

        @Override
        protected void onPostExecute(Void result) {
            Toast.makeText(context, "Hoàn thành tiến trình!", Toast.LENGTH_LONG).show();
        }
    }
}