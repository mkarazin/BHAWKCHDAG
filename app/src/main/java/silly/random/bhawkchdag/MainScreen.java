package silly.random.bhawkchdag;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainScreen extends Activity {

    MediaPlayer mp;
    static final int offset = 650;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        mp = MediaPlayer.create(this, R.raw.chdag);
        mp.seekTo(offset);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // called when the button is clicked
    public void partyModeGO(View view)
    {
        if (!mp.isPlaying())
        {
            mp.start();
        }
        else
        {
            mp.pause();
            mp.seekTo(offset);
        }
    }
}
