package a2;

import a2.o;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class e<DataT> implements o<Integer, DataT> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f57a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0004e<DataT> f58b;

    /* loaded from: classes.dex */
    public static final class a implements p<Integer, AssetFileDescriptor>, InterfaceC0004e<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f59a;

        public a(Context context) {
            this.f59a = context;
        }

        @Override // a2.e.InterfaceC0004e
        public final Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // a2.e.InterfaceC0004e
        public final void b(AssetFileDescriptor assetFileDescriptor) {
            assetFileDescriptor.close();
        }

        @Override // a2.e.InterfaceC0004e
        public final Object c(Resources resources, int i8, Resources.Theme theme) {
            return resources.openRawResourceFd(i8);
        }

        @Override // a2.p
        public final o<Integer, AssetFileDescriptor> d(s sVar) {
            return new e(this.f59a, this);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements p<Integer, Drawable>, InterfaceC0004e<Drawable> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f60a;

        public b(Context context) {
            this.f60a = context;
        }

        @Override // a2.e.InterfaceC0004e
        public final Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // a2.e.InterfaceC0004e
        public final /* bridge */ /* synthetic */ void b(Drawable drawable) {
        }

        @Override // a2.e.InterfaceC0004e
        public final Object c(Resources resources, int i8, Resources.Theme theme) {
            Context context = this.f60a;
            return f2.b.a(context, context, i8, theme);
        }

        @Override // a2.p
        public final o<Integer, Drawable> d(s sVar) {
            return new e(this.f60a, this);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements p<Integer, InputStream>, InterfaceC0004e<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f61a;

        public c(Context context) {
            this.f61a = context;
        }

        @Override // a2.e.InterfaceC0004e
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // a2.e.InterfaceC0004e
        public final void b(InputStream inputStream) {
            inputStream.close();
        }

        @Override // a2.e.InterfaceC0004e
        public final Object c(Resources resources, int i8, Resources.Theme theme) {
            return resources.openRawResource(i8);
        }

        @Override // a2.p
        public final o<Integer, InputStream> d(s sVar) {
            return new e(this.f61a, this);
        }
    }

    /* loaded from: classes.dex */
    public static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: h  reason: collision with root package name */
        public final Resources.Theme f62h;

        /* renamed from: i  reason: collision with root package name */
        public final Resources f63i;

        /* renamed from: j  reason: collision with root package name */
        public final InterfaceC0004e<DataT> f64j;

        /* renamed from: k  reason: collision with root package name */
        public final int f65k;

        /* renamed from: l  reason: collision with root package name */
        public DataT f66l;

        public d(Resources.Theme theme, Resources resources, InterfaceC0004e<DataT> interfaceC0004e, int i8) {
            this.f62h = theme;
            this.f63i = resources;
            this.f64j = interfaceC0004e;
            this.f65k = i8;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<DataT> a() {
            return this.f64j.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            DataT datat = this.f66l;
            if (datat != null) {
                try {
                    this.f64j.b(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final u1.a e() {
            return u1.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public final void f(com.bumptech.glide.i iVar, d.a<? super DataT> aVar) {
            try {
                ?? r42 = (DataT) this.f64j.c(this.f63i, this.f65k, this.f62h);
                this.f66l = r42;
                aVar.d(r42);
            } catch (Resources.NotFoundException e8) {
                aVar.c(e8);
            }
        }
    }

    /* renamed from: a2.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0004e<DataT> {
        Class<DataT> a();

        void b(DataT datat);

        Object c(Resources resources, int i8, Resources.Theme theme);
    }

    public e(Context context, InterfaceC0004e<DataT> interfaceC0004e) {
        this.f57a = context.getApplicationContext();
        this.f58b = interfaceC0004e;
    }

    @Override // a2.o
    public final /* bridge */ /* synthetic */ boolean a(Integer num) {
        return true;
    }

    @Override // a2.o
    public final o.a b(Integer num, int i8, int i9, u1.h hVar) {
        Integer num2 = num;
        Resources.Theme theme = (Resources.Theme) hVar.c(f2.e.f3515b);
        return new o.a(new o2.b(num2), new d(theme, theme != null ? theme.getResources() : this.f57a.getResources(), this.f58b, num2.intValue()));
    }
}