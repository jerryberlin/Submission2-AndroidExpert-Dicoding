package l4;

import android.content.Context;
import android.util.TypedValue;

/* loaded from: classes.dex */
public final class b {
    public static TypedValue a(Context context, int i8) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i8, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i8, boolean z5) {
        TypedValue a8 = a(context, i8);
        return (a8 == null || a8.type != 18) ? z5 : a8.data != 0;
    }

    public static TypedValue c(Context context, int i8, String str) {
        TypedValue a8 = a(context, i8);
        if (a8 != null) {
            return a8;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i8)));
    }
}