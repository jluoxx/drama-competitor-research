        @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
        public void onUpdate(ConfigUpdate configUpdate) {
            Intrinsics.checkNotNullParameter(configUpdate, "configUpdate");
            pe3.o("FirebaseConfigModel");
            pe3.e("FirebaseConfigModel", "update suc " + configUpdate.getUpdatedKeys());
            hb2.o.z(this.o);
        }