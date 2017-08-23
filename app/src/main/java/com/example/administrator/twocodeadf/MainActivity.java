package com.example.administrator.twocodeadf;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.et_url)
    EditText etUrl;
    @BindView(R.id.btn_create)
    Button btnCreate;
    @BindView(R.id.iv_two_code)
    ImageView ivTwoCode;

    private String imagePath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.btn_create, R.id.iv_two_code})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_create:

                String url = etUrl.getText().toString().trim();
                Bitmap bitmap = ZXingUtils.createQRImage(url, ivTwoCode.getWidth(), ivTwoCode.getHeight());
                ivTwoCode.setImageBitmap(bitmap);
                break;
            case R.id.iv_two_code:

                break;
        }
    }
}
