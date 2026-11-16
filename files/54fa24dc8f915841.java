    @Override // com.android.launcher3.BaseDraggingActivity
    public final boolean w(View view, Intent intent, d0 d0Var) {
        boolean zW = super.w(view, intent, d0Var);
        if (zW && (view instanceof BubbleTextView)) {
            BubbleTextView bubbleTextView = (BubbleTextView) view;
            bubbleTextView.setStayPressed(true);
            i0 i0Var = this.f12277F;
            if (i0Var != null) {
                i0Var.b();
            }
            this.f12277F = bubbleTextView;
        }
        return zW;
    }