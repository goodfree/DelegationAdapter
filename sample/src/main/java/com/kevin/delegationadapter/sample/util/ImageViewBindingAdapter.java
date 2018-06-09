package com.kevin.delegationadapter.sample.util;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * ImageViewBindingAdapter
 *
 * @author zhouwenkai@baidu.com, Created on 2018-06-09 12:58:23
 *         Major Function：<b></b>
 *         <p/>
 *         注:如果您修改了本类请填写以下内容作为记录，如非本人操作劳烦通知，谢谢！！！
 * @author mender，Modified Date Modify Content:
 */

public class ImageViewBindingAdapter {

    @BindingAdapter({"avatarUrl", "error"})
    public static void loadAvatarImage(ImageView view, String url, Drawable error) {
        Glide.with(view.getContext()).load(url).error(error).into(view);
    }

    @BindingAdapter({"imageUrl", "error"})
    public static void loadImage(ImageView view, String url, Drawable error) {
        Glide.with(view.getContext()).load(url).asBitmap().override(600, 600).into(view);
    }
}
