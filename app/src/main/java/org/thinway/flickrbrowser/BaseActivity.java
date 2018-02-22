package org.thinway.flickrbrowser;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class BaseActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    protected Toolbar activateToolbar(){
        if ( mToolbar == null ){
            mToolbar = findViewById(R.id.app_bar);
            if( mToolbar != null ) {
                setSupportActionBar(mToolbar);
            }
        }

        return mToolbar;
    }
}
