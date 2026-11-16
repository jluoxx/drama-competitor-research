    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i5;
        o0 o0Var;
        ArrayList arrayList;
        switch (this.b) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                ja jaVar = (ja) this.f3415c;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (jaVar.f45055c) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 1:
                Launcher launcher = (Launcher) this.f3415c;
                if (launcher != null && (i5 = message.what) != 1 && i5 == 2 && (o0Var = launcher.f12301w) != null) {
                    o0Var.startListening();
                }
                return true;
            case 2:
                int i10 = message.what;
                f fVar = (f) this.f3415c;
                if (i10 == 1) {
                    fVar.b((l5.d) message.obj);
                    return true;
                }
                if (i10 == 2) {
                    fVar.d.d((l5.d) message.obj);
                }
                return false;
            case 3:
                int i11 = message.what;
                NotificationListener notificationListener = (NotificationListener) this.f3415c;
                Handler handler = notificationListener.f12667c;
                if (i11 != 1 && i11 != 2) {
                    if (i11 == 3) {
                        if (NotificationListener.f12665k) {
                            try {
                                arrayList = NotificationListener.a(notificationListener, notificationListener.getActiveNotifications());
                            } catch (SecurityException unused) {
                                Log.e("NotificationListener", "SecurityException: failed to fetch notifications");
                                arrayList = new ArrayList();
                            }
                        } else {
                            arrayList = new ArrayList();
                        }
                        handler.obtainMessage(message.what, arrayList).sendToTarget();
                    }
                    break;
                } else {
                    handler.obtainMessage(i11, message.obj).sendToTarget();
                }
                return true;
            default:
                if (message.what != 1) {
                    return false;
                }
                ((InputMethodManager) this.f3415c).hideSoftInputFromWindow((IBinder) message.obj, 0);
                return true;
        }
    }