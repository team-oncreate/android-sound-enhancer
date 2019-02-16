package org.hiresaudio.bettersound;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Button about = (Button) findViewById(R.id.button);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("关于安卓音频优化大师");
                dialog.setMessage("安卓音频优化大师是由 \"onCreate()\" 团队历时数年倾力打造。独家攻克了安卓 SRC 降低音质的难题。辅以德国量子优化技术，带给您全新的安卓聆听体验。");
                dialog.setCancelable(true);
                dialog.setPositiveButton("牛逼", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();
            }
        });
        Switch liangzi = (Switch) findViewById(R.id.switch1);
        Switch srcyouhua = (Switch) findViewById(R.id.switch2);
        liangzi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    final ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                    progressDialog.setTitle("正在启动量子音频优化器");
                    progressDialog.setMessage("请耐心等待...");
                    progressDialog.setCancelable(false);
                    progressDialog.show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            progressDialog.dismiss();
                            AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                            dialog.setTitle("量子音频优化器启动成功");
                            dialog.setMessage("请尽情享受吧～");
                            dialog.setCancelable(true);
                            dialog.setPositiveButton("好的", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                            dialog.show();

                        }
                    },2000); // 延时1秒



                }
            }
        });

        srcyouhua.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    final ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                    progressDialog.setTitle("正在启动SRC优化");
                    progressDialog.setMessage("请耐心等待...");
                    progressDialog.setCancelable(false);
                    progressDialog.show();

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            progressDialog.dismiss();
                            //Thread.sleep(200);
                            AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                            dialog.setTitle("SRC优化启动成功");
                            dialog.setMessage("请尽情享受吧～");
                            dialog.setCancelable(true);
                            dialog.setPositiveButton("好的", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                            dialog.show();

                        }
                    },2000); // 延时1秒




                }
            }
        });
    }
}
