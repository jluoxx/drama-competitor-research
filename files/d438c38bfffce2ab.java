    @Override // android.app.Activity
    public final void finish() {
        com.freetools.freereels.ad.c cVar = com.freetools.freereels.ad.a.b.f19438a;
        if (!v4.d.X()) {
            super.finish();
            return;
        }
        ShortPlay shortPlay = this.f19592m;
        long j10 = shortPlay != null ? shortPlay.f18717id : 0L;
        final l6.b bVar = new l6.b(this, 0);
        ArrayList arrayList = com.freetools.freereels.data.d.f19465a;
        if (arrayList.isEmpty() || System.currentTimeMillis() - com.freetools.freereels.data.d.b > 3600000) {
            com.freetools.freereels.data.d.a();
        }
        l.h(arrayList, "<this>");
        List listC0 = o.C0(arrayList);
        Collections.shuffle(listC0);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listC0) {
            if (((ShortPlay) obj).f18717id != j10) {
                arrayList2.add(obj);
            }
        }
        List listU0 = o.u0(arrayList2, 5);
        ArrayList arrayList3 = new ArrayList();
        g gVar = null;
        if (!listU0.isEmpty()) {
            while (arrayList3.size() < 100) {
                arrayList3.addAll(listU0);
            }
            final g gVar2 = new g(this);
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.dialog_recommend, (ViewGroup) null, false);
            int i5 = R.id.iv_close;
            ImageView imageView = (ImageView) l4.c.j(R.id.iv_close, viewInflate);
            if (imageView != null) {
                i5 = R.id.iv_recommend;
                if (((TextView) l4.c.j(R.id.iv_recommend, viewInflate)) != null) {
                    i5 = R.id.tv_desc;
                    TextView textView = (TextView) l4.c.j(R.id.tv_desc, viewInflate);
                    if (textView != null) {
                        i5 = R.id.tv_ep;
                        TextView textView2 = (TextView) l4.c.j(R.id.tv_ep, viewInflate);
                        if (textView2 != null) {
                            i5 = R.id.tv_play;
                            TextView textView3 = (TextView) l4.c.j(R.id.tv_play, viewInflate);
                            if (textView3 != null) {
                                i5 = R.id.tv_title;
                                TextView textView4 = (TextView) l4.c.j(R.id.tv_title, viewInflate);
                                if (textView4 != null) {
                                    i5 = R.id.vp;
                                    ViewPager2 viewPager2 = (ViewPager2) l4.c.j(R.id.vp, viewInflate);
                                    if (viewPager2 != null) {
                                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                                        i iVar = new i(frameLayout, imageView, textView, textView2, textView3, textView4, viewPager2);
                                        imageView.setOnClickListener(new n(9, gVar2, bVar));
                                        viewPager2.setAdapter(new s(arrayList3, new u(bVar, arrayList3, iVar, gVar2, 22)));
                                        viewPager2.setOffscreenPageLimit(5);
                                        viewPager2.setPageTransformer(new t(viewPager2, 0));
                                        viewPager2.b(new androidx.viewpager2.widget.b(iVar, arrayList3));
                                        textView3.setOnClickListener(new Z7.t(bVar, arrayList3, iVar, gVar2, 3));
                                        viewPager2.e(50, false);
                                        gVar2.setContentView(frameLayout);
                                        B b = (B) gVar2.c();
                                        b.y();
                                        View viewFindViewById = b.f9799m.findViewById(R.id.design_bottom_sheet);
                                        if (viewFindViewById != null) {
                                            viewFindViewById.setBackgroundResource(android.R.color.transparent);
                                        }
                                        gVar2.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.freetools.freereels.utils.e
                                            @Override // android.content.DialogInterface.OnKeyListener
                                            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                                                if (i10 == 4 && keyEvent.getAction() == 1) {
                                                    gVar2.dismiss();
                                                    bVar.invoke(null);
                                                }
                                                return true;
                                            }
                                        });
                                        gVar2.show();
                                        gVar = gVar2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i5)));
        }
        if (gVar == null) {
            super.finish();
        }
    }