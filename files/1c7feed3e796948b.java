    public final void d() {
        gl7 gl7Var = this.f14523a;
        gl7Var.getClass();
        gv6 gv6Var = jg8.b.f14127a;
        yf8 yf8Var = gv6Var != null ? gv6Var.l : null;
        if (yf8Var != null && !TextUtils.isEmpty(yf8Var.f19660a) && !TextUtils.isEmpty(yf8Var.b)) {
            nk2.f14683a = yf8Var.f19660a;
            nk2.b = yf8Var.b;
            nk2.c = yf8Var.c;
            nk2.d = yf8Var.d;
            nk2.e = yf8Var.e;
        }
        TUSDK.init(bg8.b(), nk2.f14683a, nk2.b);
        if (nj7.b > 0) {
            gl7Var.e();
            gl7Var.f();
            gl7Var.g();
        }
        this.b.getClass();
        nj7.c.add(new Consumer() { // from class: kf8
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.b.e((Activity) obj);
            }
        });
    }