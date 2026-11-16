0000: const-string v0, "LicenseClient"
0002: if-nez v2, :000a
0004: const-string v2, "Cannot check license with null context."
0006: invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
0009: goto :0020
000a: invoke-static {}, Lcom/pairip/licensecheck/LicenseClient;->isIsolatedProcess()Z
000d: move-result v1
000e: if-eqz v1, :0016
0010: const-string v2, "Skipping license check in isolated process."
0012: invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
0015: goto :0020
0016: sget-object v0, Lcom/pairip/licensecheck/LicenseClient;->mainThreadRunner:Lcom/pairip/licensecheck/LicenseClient$ImmediateTaskExecutor;
0018: new-instance v1, Lcom/pairip/licensecheck/LicenseClient$$ExternalSyntheticLambda7;
001a: invoke-direct {v1, v2}, Lcom/pairip/licensecheck/LicenseClient$$ExternalSyntheticLambda7;-><init>(Landroid/content/Context;)V
001d: invoke-interface {v0, v1}, Lcom/pairip/licensecheck/LicenseClient$ImmediateTaskExecutor;->run(Ljava/lang/Runnable;)V
0020: return-void