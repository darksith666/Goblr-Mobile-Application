package co.gobblr.app;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;


public class ResultActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        final ProgressDialog progressDialog;

        progressDialog = new ProgressDialog(ResultActivity.this);
        progressDialog.setMessage("Please wait...");
        progressDialog.setCancelable(false);
        progressDialog.show();




        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                progressDialog.dismiss();

                ImageView imageView = (ImageView) findViewById(R.id.imageView2);
                imageView.setImageResource(R.drawable.lol);

                TextView name = (TextView) findViewById(R.id.textView3);
                name.setText("{commonAtr: \"banana\"  }"); //Brian Comment: Dummy for presentation

            }
        }, 5500);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_result, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
