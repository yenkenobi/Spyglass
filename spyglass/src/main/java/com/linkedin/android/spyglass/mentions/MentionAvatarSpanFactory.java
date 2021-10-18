package com.linkedin.android.spyglass.mentions;

import androidx.annotation.NonNull;

public abstract class MentionAvatarSpanFactory {
    public abstract MentionAvatarSpan createAvatarMentionSpan(@NonNull Mentionable mention);
}
