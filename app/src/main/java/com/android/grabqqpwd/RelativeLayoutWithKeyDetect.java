package com.android.grabqqpwd;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.RelativeLayout;

/**
 * Description: #TODO
 *
 * @author zzp(zhao_zepeng@hotmail.com)
 * @since 2016-01-08
 */
public class RelativeLayoutWithKeyDetect extends RelativeLayout{
    private IKeyCodeBackCallback callback;

    public RelativeLayoutWithKeyDetect(Context context) {
        super(context);
    }

    public RelativeLayoutWithKeyDetect(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RelativeLayoutWithKeyDetect(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public RelativeLayoutWithKeyDetect(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_BACK){
            if (callback != null)
                callback.backCallback();
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    public void setCallback(IKeyCodeBackCallback callback){
        this.callback = callback;
    }

    public interface IKeyCodeBackCallback{
        void backCallback();
    }
}
