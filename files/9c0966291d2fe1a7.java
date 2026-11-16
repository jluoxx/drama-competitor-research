    public final void O() {
        xv6 xv6Var = this.o;
        xv6Var.getClass();
        ga7 ga7Var = y08.O.o;
        n08 n08Var = ga7Var != null ? ga7Var.j : null;
        if (n08Var != null && !TextUtils.isEmpty(n08Var.o) && !TextUtils.isEmpty(n08Var.O)) {
            az1.o = n08Var.o;
            az1.O = n08Var.O;
            az1.f465a = n08Var.f11593a;
            az1.b = n08Var.b;
            az1.c = n08Var.c;
        }
        TUSDK.init(qn2.O(), az1.o, az1.O);
        if (in2.O > 0) {
            xv6Var.d();
            xv6Var.c();
            xv6Var.e();
        }
        this.O.getClass();
        in2.f8857a.add(new Consumer() { // from class: f08
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.o.g((Activity) obj);
            }
        });
    }