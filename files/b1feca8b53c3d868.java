.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/thinkup/core/common/dm/dq0;->dd:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/thinkup/core/common/dm/dq0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lcom/thinkup/core/common/dm/dq0;->dn:Lorg/json/JSONObject;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/thinkup/core/common/dm/dq0;->do:Lcom/thinkup/core/common/dm/ddm;

    .line 19
    .line 20
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/thinkup/core/common/dm/dq0;->q:Ljava/util/Map;

    .line 27
    .line 28
    return-void
.end method