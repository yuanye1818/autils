package cn.yuanye1818.func4a;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import cn.yuanye1818.func4a.core.ActLuncher;
import cn.yuanye1818.func4a.core.activity.CoreActivity;
import cn.yuanye1818.func4a.core.compiler.annotation.activity.Launcher;
import cn.yuanye1818.func4a.core.compiler.annotation.onactivityresult.OnResult;


@Launcher
public class OneActivity extends CoreActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActLuncher.twoActivity(getThis());
    }

    @OnResult(TwoActivity.class)
    public void twoBack(Intent data) {

    }

}
