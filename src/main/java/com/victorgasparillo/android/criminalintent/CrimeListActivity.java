package com.victorgasparillo.android.criminalintent;
import android.support.v4.app.Fragment;

/**
 * Created by VICTOR MANUEL on 2018-04-24.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
