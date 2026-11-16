        @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
        public void onUpdate(ConfigUpdate configUpdate) {
            Intrinsics.checkNotNullParameter(configUpdate, "configUpdate");
            we3.a("FirebaseConfigModel");
            we3.g("FirebaseConfigModel", "update suc " + configUpdate.getUpdatedKeys());
            tc2.f16917a.z(this.f16918a);
        }