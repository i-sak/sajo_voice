package com.example.voicephishingprevention;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 전화걸기 권한이 허용되어 있는지 체크
         * **/
        /*
        int permissionResult = checkSelfPermission(Manifest.permission.CALL_PHONE);

        // 권한이 없는 경우
        if(permissionResult == PackageManager.PERMISSION_DENIED) {
            // Package는 Android App ID
            // 사용자가 CALL_PHONE 권한을 한번이라도 거부한 적이 있는지
            // 거부한 이력이 한번이라도 있으면, true 거부 이력이 없으면 false
            if (shouldShowRequestPermissionRationale(Manifest))
        }
        */
        requestPermissions(new String[] {Manifest.permission.CALL_PHONE}, 1000);
/*
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "01075777263"));
        startActivity(intent);
 */


    }

}