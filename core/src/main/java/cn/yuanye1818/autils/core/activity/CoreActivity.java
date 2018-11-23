package cn.yuanye1818.autils.core.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ViewUtils;
import android.view.View;
import android.view.ViewTreeObserver;

import cn.yuanye1818.autils.core.net.NetBackI;
import cn.yuanye1818.autils.core.net.NetUtils;
import cn.yuanye1818.autils.core.utils.ActFunc;
import cn.yuanye1818.autils.core.utils.ViewFunc;

public class CoreActivity extends AppCompatActivity {

    protected NetBackI net;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        net = NetUtils.bindNet(this);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        final View rootView = ViewFunc.getRootView(getThis());
        rootView.getViewTreeObserver()
                .addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    @Override
                    public void onGlobalLayout() {
                        onViewInitComplete();
                        rootView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                });
    }

    protected void onViewInitComplete() {
    }

    protected Activity getThis() {
        return this;
    }

    /********************************
     *
     * 对finish方法做扩展
     *
     ********************************/
    @Override
    public void finish() {
        beforeFinish();
        super.finish();
        setFinishAnimation();
        afterFinish();
    }

    //finish之后调用
    protected void afterFinish() {
    }

    //设置finish动画
    protected void setFinishAnimation() {
        ActFunc.actRightOut(getThis());
    }

    //finish之前调用
    protected void beforeFinish() {
    }
}