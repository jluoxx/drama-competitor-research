.method static constructor <clinit>()V
    .registers 12

    new-instance v0, Lcom/freetools/freereels/data/a;

    const-string v1, "RequestedSystemLauncher"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/freetools/freereels/data/a;-><init>(Ljava/lang/String;IZ)V

    new-instance v1, Lcom/freetools/freereels/data/a;

    const-string v3, "ShowFirstRecommendDialog"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/freetools/freereels/data/a;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lcom/freetools/freereels/data/a;->c:Lcom/freetools/freereels/data/a;

    move v3, v2

    new-instance v2, Lcom/freetools/freereels/data/a;

    const-string v5, "WhiteTheme"

    const/4 v6, 0x2

    invoke-direct {v2, v5, v6, v3}, Lcom/freetools/freereels/data/a;-><init>(Ljava/lang/String;IZ)V

    sput-object v2, Lcom/freetools/freereels/data/a;->d:Lcom/freetools/freereels/data/a;

    move v5, v3

    new-instance v3, Lcom/freetools/freereels/data/a;

    const-string v6, "ShowBackAd"

    const/4 v7, 0x3

    invoke-direct {v3, v6, v7, v4}, Lcom/freetools/freereels/data/a;-><init>(Ljava/lang/String;IZ)V

    sput-object v3, Lcom/freetools/freereels/data/a;->e:Lcom/freetools/freereels/data/a;

    move v6, v4

    new-instance v4, Lcom/freetools/freereels/data/a;

    const-string v7, "IsFirstOpen"

    const/4 v8, 0x4

    invoke-direct {v4, v7, v8, v6}, Lcom/freetools/freereels/data/a;-><init>(Ljava/lang/String;IZ)V

    move v7, v5

    new-instance v5, Lcom/freetools/freereels/data/a;

    const-string v8, "FirstLaunch"

    const/4 v9, 0x5

    invoke-direct {v5, v8, v9, v6}, Lcom/freetools/freereels/data/a;-><init>(Ljava/lang/String;IZ)V

    sput-object v5, Lcom/freetools/freereels/data/a;->f:Lcom/freetools/freereels/data/a;

    move v8, v6

    new-instance v6, Lcom/freetools/freereels/data/a;

    const-string v9, "SplashPopLauncher"

    const/4 v10, 0x6

    invoke-direct {v6, v9, v10, v7}, Lcom/freetools/freereels/data/a;-><init>(Ljava/lang/String;IZ)V

    sput-object v6, Lcom/freetools/freereels/data/a;->g:Lcom/freetools/freereels/data/a;

    move v9, v7

    new-instance v7, Lcom/freetools/freereels/data/a;

    const-string v10, "MainPopLauncher"

    const/4 v11, 0x7

    invoke-direct {v7, v10, v11, v8}, Lcom/freetools/freereels/data/a;-><init>(Ljava/lang/String;IZ)V

    sput-object v7, Lcom/freetools/freereels/data/a;->h:Lcom/freetools/freereels/data/a;

    new-instance v8, Lcom/freetools/freereels/data/a;

    const-string v10, "DetailPopLauncher"

    const/16 v11, 0x8

    invoke-direct {v8, v10, v11, v9}, Lcom/freetools/freereels/data/a;-><init>(Ljava/lang/String;IZ)V

    sput-object v8, Lcom/freetools/freereels/data/a;->i:Lcom/freetools/freereels/data/a;

    filled-new-array/range {v0 .. v8}, [Lcom/freetools/freereels/data/a;

    move-result-object v0

    sput-object v0, Lcom/freetools/freereels/data/a;->j:[Lcom/freetools/freereels/data/a;

    invoke-static {v0}, Lv4/a;->p([Ljava/lang/Enum;)Lff/b;

    return-void
.end method