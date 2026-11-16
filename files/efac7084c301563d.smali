0000: sget-object v0, Lcom/pairip/licensecheck/LicenseClient;->licenseCheckState:Lcom/pairip/licensecheck/LicenseClient$LicenseCheckState;
0002: invoke-virtual {v0}, Lcom/pairip/licensecheck/LicenseClient$LicenseCheckState;->ordinal()I
0005: move-result v0
0006: const/4 v1, 0
0007: if-eqz v0, :0020
0009: const/4 v2, 1
000a: if-eq v0, v2, :0013
000c: const/4 v2, 4
000d: if-ne v0, v2, :0036
000f: invoke-direct {v3, v1}, Lcom/pairip/licensecheck/LicenseClient;->initiateFreshLicensingServiceConnection(Z)V
0012: goto :0036
0013: sget-object v0, Lcom/pairip/licensecheck/LicenseClient;->responsePayload:Landroid/os/Bundle;
0015: sget-object v1, Lcom/pairip/licensecheck/LicenseClient;->packageName:Ljava/lang/String;
0017: invoke-static {v0, v1}, Lcom/pairip/licensecheck/LicenseResponseHelper;->validateResponse(Landroid/os/Bundle;Ljava/lang/String;)V
001a: goto :0036
001b: move-exception v0
001c: invoke-direct {v3, v0}, Lcom/pairip/licensecheck/LicenseClient;->handleError(Lcom/pairip/licensecheck/LicenseCheckException;)V
001f: goto :0036
0020: sget-boolean v0, Lcom/pairip/licensecheck/LicenseClient;->localCheckEnabled:Z
0022: if-eqz v0, :0033
0024: sget-boolean v0, Lcom/pairip/licensecheck/LicenseClient;->customTrialEndTriggered:Z
0026: if-nez v0, :0033
0028: sget-object v0, Lcom/pairip/licensecheck/LicenseClient;->backgroundRunner:Lcom/pairip/licensecheck/LicenseClient$ImmediateTaskExecutor;
002a: new-instance v1, Lcom/pairip/licensecheck/LicenseClient$$ExternalSyntheticLambda8;
002c: invoke-direct {v1, v3}, Lcom/pairip/licensecheck/LicenseClient$$ExternalSyntheticLambda8;-><init>(Lcom/pairip/licensecheck/LicenseClient;)V
002f: invoke-interface {v0, v1}, Lcom/pairip/licensecheck/LicenseClient$ImmediateTaskExecutor;->run(Ljava/lang/Runnable;)V
0032: goto :0036
0033: invoke-direct {v3, v1}, Lcom/pairip/licensecheck/LicenseClient;->initiateFreshLicensingServiceConnection(Z)V
0036: return-void