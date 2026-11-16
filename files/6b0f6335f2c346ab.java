    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                g.g(this.f72025c);
                this.d.dismiss();
                p.b("guideDialogTryNow", null);
                break;
            default:
                p.b("recheckDialogSet", null);
                g.g(this.f72025c);
                this.d.dismiss();
                break;
        }
    }