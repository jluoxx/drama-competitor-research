/* JADX INFO: loaded from: classes.dex */
public class Application extends FreereelsApp {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }