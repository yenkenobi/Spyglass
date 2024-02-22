package com.linkedin.android.spyglass.mentions;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.ImageSpan;
import androidx.core.graphics.drawable.DrawableKt;

import androidx.annotation.NonNull;

public class MentionAvatarSpan extends ImageSpan {

    public MentionAvatarSpan(@NonNull Context context, @NonNull Bitmap bitmap) {
        super(context, bitmap);
    }

    public MentionAvatarSpan(@NonNull Context context, @NonNull Bitmap bitmap, int verticalAlignment) {
        super(context, bitmap, verticalAlignment);
    }

    public MentionAvatarSpan(@NonNull Drawable drawable) {
        super(drawable);
    }

    public MentionAvatarSpan(@NonNull Drawable drawable, int verticalAlignment) {
        super(drawable, verticalAlignment);
    }

    public MentionAvatarSpan(@NonNull Drawable drawable, @NonNull String source) {
        super(drawable, source);
    }

    public MentionAvatarSpan(@NonNull Drawable drawable, @NonNull String source, int verticalAlignment) {
        super(drawable, source, verticalAlignment);
    }

    public MentionAvatarSpan(@NonNull Context context, @NonNull Uri uri) {
        super(context, uri);
    }

    public MentionAvatarSpan(@NonNull Context context, @NonNull Uri uri, int verticalAlignment) {
        super(context, uri, verticalAlignment);
    }

    public MentionAvatarSpan(@NonNull Context context, int resourceId) {
        super(context, resourceId);
    }

    public MentionAvatarSpan(@NonNull Context context, int resourceId, int verticalAlignment) {
        super(context, resourceId, verticalAlignment);
    }


    public MentionAvatarSpan(Parcel in) {
        super((Bitmap) in.readParcelable(Bitmap.class.getClassLoader()));
    }
}
