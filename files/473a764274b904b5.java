.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/thinkup/core/common/dm/dq0;->dd:Ljava/lang/String;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/thinkup/core/common/dm/dq0;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/thinkup/core/common/dm/dq0;->dn:Lorg/json/JSONObject;

    iput-object v0, p0, Lcom/thinkup/core/common/dm/dq0;->do:Lcom/thinkup/core/common/dm/ddm;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    iput-object v0, p0, Lcom/thinkup/core/common/dm/dq0;->q:Ljava/util/Map;

    return-void
.end method