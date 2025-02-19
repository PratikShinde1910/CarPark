package apcoders.in.carpark;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import apcoders.in.carpark.fragments.OwnerParkMap;
import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class HostMainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_host_main);

            bottomNavigationView = findViewById(R.id.bottomNavigationView);
            frameLayout = findViewById(R.id.frame_layout);

            loadFragment(new OwnerHomeFragment(), false);

            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    int itemId = item.getItemId();

                    if (itemId == R.id.home) {
                        loadFragment(new OwnerHomeFragment(), false);}
//                     else if (itemId == R.id.wallet) {
//                        loadFragment(new SearchFragment(), false);
//                    }
//                    else if (itemId == R.id.addlocation) {
//                        loadFragment(new BookingFragment(), false);
//                    } else {
//                        loadFragment(new ProfileFragment(), false);
//                    }
                    return true;
                }
            });



            if (savedInstanceState == null) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_layout, new OwnerHomeFragment()) // Replace with the container ID and initial fragment
                        .commit();
            }



        }

        public BottomNavigationView getBottomNavigationView() {
            return bottomNavigationView;
        }

        private void loadFragment(Fragment fragment, boolean isAppInitialized) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.frame_layout, fragment);

            fragmentTransaction.commit();
        }
}
