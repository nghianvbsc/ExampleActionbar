package cf.bscenter.example_actionbar.ui.activities;

import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;

import java.lang.reflect.Method;

import cf.bscenter.example_actionbar.R;
import cf.bscenter.example_actionbar.ui.intalize.BaseActivity;

public class MainActivity extends BaseActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_demo, menu);
        if (menu.getClass().getSimpleName().equals("MenuBuilder")) {
            try {
                Method m = menu.getClass().getDeclaredMethod(
                        "setOptionalIconsVisible", Boolean.TYPE);
                m.setAccessible(true);
                m.invoke(menu, true);
            } catch (NoSuchMethodException e) {
                Log.e("ERROR", "onMenuOpened", e);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void main() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        }
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }
}
