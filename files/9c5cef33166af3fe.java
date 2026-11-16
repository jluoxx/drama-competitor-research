.method static constructor <clinit>()V
    .registers 16

    new-instance v0, Lcom/freetools/freereels/data/b;

    const-string v1, "LastNotificationTime"

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/freetools/freereels/data/b;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/freetools/freereels/data/b;->c:Lcom/freetools/freereels/data/b;

    new-instance v1, Lcom/freetools/freereels/data/b;

    const-string v2, "WatchedVideo"

    const/4 v5, 0x1

    const-wide/16 v6, 0x1

    invoke-direct {v1, v2, v5, v6, v7}, Lcom/freetools/freereels/data/b;-><init>(Ljava/lang/String;IJ)V

    new-instance v2, Lcom/freetools/freereels/data/b;

    const-string v5, "LastShowHistoryTime"

    const/4 v8, 0x2

    invoke-direct {v2, v5, v8, v3, v4}, Lcom/freetools/freereels/data/b;-><init>(Ljava/lang/String;IJ)V

    sput-object v2, Lcom/freetools/freereels/data/b;->d:Lcom/freetools/freereels/data/b;

    new-instance v5, Lcom/freetools/freereels/data/b;

    const-string v8, "DetailAdInterval"

    const/4 v9, 0x3

    const-wide/16 v10, 0x3

    invoke-direct {v5, v8, v9, v10, v11}, Lcom/freetools/freereels/data/b;-><init>(Ljava/lang/String;IJ)V

    sput-object v5, Lcom/freetools/freereels/data/b;->e:Lcom/freetools/freereels/data/b;

    new-instance v8, Lcom/freetools/freereels/data/b;

    const-string v9, "DiscoverAdInterval"

    const/4 v12, 0x4

    invoke-direct {v8, v9, v12, v10, v11}, Lcom/freetools/freereels/data/b;-><init>(Ljava/lang/String;IJ)V

    sput-object v8, Lcom/freetools/freereels/data/b;->f:Lcom/freetools/freereels/data/b;

    move-object v9, v5

    new-instance v5, Lcom/freetools/freereels/data/b;

    const-wide/16 v12, 0xf

    const-string v14, "CountDownSec"

    const/4 v15, 0x5

    invoke-direct {v5, v14, v15, v12, v13}, Lcom/freetools/freereels/data/b;-><init>(Ljava/lang/String;IJ)V

    sput-object v5, Lcom/freetools/freereels/data/b;->g:Lcom/freetools/freereels/data/b;

    new-instance v12, Lcom/freetools/freereels/data/b;

    const-string v13, "CountDownMaxRound"

    const/4 v14, 0x6

    invoke-direct {v12, v13, v14, v10, v11}, Lcom/freetools/freereels/data/b;-><init>(Ljava/lang/String;IJ)V

    sput-object v12, Lcom/freetools/freereels/data/b;->h:Lcom/freetools/freereels/data/b;

    new-instance v10, Lcom/freetools/freereels/data/b;

    const-string v11, "RewardDialogInterval"

    const/4 v13, 0x7

    invoke-direct {v10, v11, v13, v6, v7}, Lcom/freetools/freereels/data/b;-><init>(Ljava/lang/String;IJ)V

    sput-object v10, Lcom/freetools/freereels/data/b;->i:Lcom/freetools/freereels/data/b;

    move-object v6, v8

    new-instance v8, Lcom/freetools/freereels/data/b;

    const-wide/16 v13, 0x2

    const-string v7, "CurrentResolution"

    const/16 v11, 0x8

    invoke-direct {v8, v7, v11, v13, v14}, Lcom/freetools/freereels/data/b;-><init>(Ljava/lang/String;IJ)V

    sput-object v8, Lcom/freetools/freereels/data/b;->j:Lcom/freetools/freereels/data/b;

    move-object v7, v9

    new-instance v9, Lcom/freetools/freereels/data/b;

    const-string v11, "DetailNativeAdInterval"

    const/16 v13, 0x9

    const-wide/16 v14, 0x3e8

    invoke-direct {v9, v11, v13, v14, v15}, Lcom/freetools/freereels/data/b;-><init>(Ljava/lang/String;IJ)V

    sput-object v9, Lcom/freetools/freereels/data/b;->k:Lcom/freetools/freereels/data/b;

    move-object v11, v7

    move-object v7, v10

    new-instance v10, Lcom/freetools/freereels/data/b;

    const-string v13, "DiscoverNativeAdInterval"

    const/16 v3, 0xa

    invoke-direct {v10, v13, v3, v14, v15}, Lcom/freetools/freereels/data/b;-><init>(Ljava/lang/String;IJ)V

    sput-object v10, Lcom/freetools/freereels/data/b;->l:Lcom/freetools/freereels/data/b;

    move-object v3, v11

    new-instance v11, Lcom/freetools/freereels/data/b;

    const-string v4, "LastActiveTime"

    const/16 v13, 0xb

    const-wide/16 v14, 0x0

    invoke-direct {v11, v4, v13, v14, v15}, Lcom/freetools/freereels/data/b;-><init>(Ljava/lang/String;IJ)V

    sput-object v11, Lcom/freetools/freereels/data/b;->m:Lcom/freetools/freereels/data/b;

    move-object v4, v6

    move-object v6, v12

    filled-new-array/range {v0 .. v11}, [Lcom/freetools/freereels/data/b;

    move-result-object v0

    sput-object v0, Lcom/freetools/freereels/data/b;->n:[Lcom/freetools/freereels/data/b;

    invoke-static {v0}, Lv4/a;->p([Ljava/lang/Enum;)Lff/b;

    return-void
.end method