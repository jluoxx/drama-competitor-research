    public final void t(String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        if (((CharSequence) get("ab_test_group", "")).length() > 0) {
            return;
        }
        put("ab_test_group", group);
    }