package com.app.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;

public class CustomDialog extends FrameLayout {

    TextView headingText, descriptionText;
    ImageView imageView;
    LottieAnimationView lottieAnimationView;
    FrameLayout button;

    String heading, description;
    Drawable image;
    String imageUrl;
    boolean useAnimation;
    Context context;
    String lottieAnimation;

    public CustomDialog(@NonNull Context context, boolean useAnimation) {
        super(context);
        init(context, useAnimation);
    }

    public void init(Context context, boolean useAnimation) {
        this.context = context;
        this.useAnimation = useAnimation;
    }

    public void createDialog() {
        Dialog dialog = new Dialog(context, R.style.Theme_AppCompat);
        dialog.setContentView(R.layout.custom_dialog_layout);
        headingText = dialog.findViewById(R.id.heading);
        descriptionText = dialog.findViewById(R.id.description);
        imageView = dialog.findViewById(R.id.imageView);
        lottieAnimationView = dialog.findViewById(R.id.lottieAnimationView);
        button = dialog.findViewById(R.id.close);

        headingText.setText(getHeading());
        descriptionText.setText(getDescription());
        button.setOnClickListener(view -> dialog.dismiss());
        Glide.with(context).load(imageUrl.equalsIgnoreCase("") ? image : imageUrl).into(imageView);
        if(getLottieAnimation() != null)
        lottieAnimationView.setAnimationFromUrl(getLottieAnimation());
        lottieAnimationView.playAnimation();
        lottieAnimationView.loop(true);
        imageView.setVisibility(!useAnimation ? VISIBLE : GONE);
        lottieAnimationView.setVisibility(useAnimation ? VISIBLE : GONE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.show();
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLottieAnimation() {
        return lottieAnimation;
    }

    public void setLottieAnimation(String lottieAnimation) {
        this.lottieAnimation = lottieAnimation;
    }
}
