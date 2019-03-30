package oncreate.projects.hostelessentials.rspg;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        The below code is made by Meenal Shah.
        It includes code for the appbar.
        Here we have created onOptionsItemSelected to listen for tapping of the various buttons on the app bar.
        There are two buttons on the appbar, one for navigation drawer and other for sos button.
        There is already a button for navigation drawer which opens the side navigation drawer.
        For now, the buttons will show text toasted.
         */
        Toolbar AppBar = findViewById(R.id.appbar);
        setSupportActionBar(AppBar);
        AppBar.setTitle(R.string.app_name);
        AppBar.setTitleTextColor(getResources().getColor(R.color.White));

        final ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.appbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.home:
            {
                //link navigation drawer over here
                //drawerLayout.openDrawer=(GravityCompat.START);
                //return true;
                Toast.makeText(getApplicationContext(), "Navigation Drawer", Toast.LENGTH_LONG).show();
                break;
            }
            default:
            {
                Toast.makeText(getApplicationContext(), "Unknown Error", Toast.LENGTH_LONG).show();
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
