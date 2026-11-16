/* JADX INFO: loaded from: classes2.dex */
public class Application extends TZApp {
    @Override // com.kingtar.work.TZApp, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }