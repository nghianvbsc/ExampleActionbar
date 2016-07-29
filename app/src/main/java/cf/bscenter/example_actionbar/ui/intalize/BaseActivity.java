package cf.bscenter.example_actionbar.ui.intalize;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by nghianv on 29/07/2016
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected abstract void main();

    protected abstract void initViews();

    protected abstract int getLayout();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        initViews();
        main();
    }
}
