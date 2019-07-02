package com.softbd.keyboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.catchDataET)
    EditText catchDataET;
    @BindView(R.id.BT1)
    Button BT1;
    @BindView(R.id.BT2)
    Button BT2;
    @BindView(R.id.BT3)
    Button BT3;
    @BindView(R.id.BT4)
    Button BT4;
    @BindView(R.id.BT5)
    Button BT5;
    @BindView(R.id.BT6)
    Button BT6;
    @BindView(R.id.BT7)
    Button BT7;
    @BindView(R.id.BT8)
    Button BT8;
    @BindView(R.id.BT9)
    Button BT9;
    @BindView(R.id.BT0)
    Button BT0;
    @BindView(R.id.BTq)
    Button BTq;
    @BindView(R.id.BTw)
    Button BTw;
    @BindView(R.id.BTe)
    Button BTe;
    @BindView(R.id.BTr)
    Button BTr;
    @BindView(R.id.BTt)
    Button BTt;
    @BindView(R.id.BTy)
    Button BTy;
    @BindView(R.id.BTu)
    Button BTu;
    @BindView(R.id.BTi)
    Button BTi;
    @BindView(R.id.BTo)
    Button BTo;
    @BindView(R.id.BTp)
    Button BTp;
    @BindView(R.id.BTa)
    Button BTa;
    @BindView(R.id.BTs)
    Button BTs;
    @BindView(R.id.BTd)
    Button BTd;
    @BindView(R.id.BTf)
    Button BTf;
    @BindView(R.id.BTg)
    Button BTg;
    @BindView(R.id.BTh)
    Button BTh;
    @BindView(R.id.BTj)
    Button BTj;
    @BindView(R.id.BTk)
    Button BTk;
    @BindView(R.id.BTl)
    Button BTl;
    @BindView(R.id.capsBT)
    ImageButton capsBT;
    @BindView(R.id.BTz)
    Button BTz;
    @BindView(R.id.BTx)
    Button BTx;
    @BindView(R.id.BTc)
    Button BTc;
    @BindView(R.id.BTv)
    Button BTv;
    @BindView(R.id.BTb)
    Button BTb;
    @BindView(R.id.BTn)
    Button BTn;
    @BindView(R.id.BTm)
    Button BTm;
    @BindView(R.id.cancelBT)
    ImageButton cancelBT;
    @BindView(R.id.commaBT)
    Button commaBT;
    @BindView(R.id.imoBT)
    ImageButton imoBT;
    @BindView(R.id.spaceBT)
    Button spaceBT;
    @BindView(R.id.fullStopBT)
    Button fullStopBT;
    @BindView(R.id.enterBT)
    ImageButton enterBT;
    @BindView(R.id.linearLayout)
    LinearLayout linearLayout;
    private String text = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        final Button[] btn = {BTq, BTw, BTe, BTr, BTt, BTy, BTu, BTi, BTo, BTp, BTa, BTs, BTd, BTf, BTg, BTh,
                BTj, BTk, BTl, BTz, BTx, BTc, BTv, BTb, BTn, BTm};

        capsBT.setOnClickListener(new View.OnClickListener() {
            int count = 1;

            @Override
            public void onClick(View v) {
                if (count % 2 != 0) {
                    for (Button button : btn) {
                        button.setText(button.getText().toString().toUpperCase());
                    }

                } else {
                    for (Button button : btn) {
                        button.setText(button.getText().toString().toLowerCase());

                    }
                }
                count++;
            }
        });

        cancelBT.setOnLongClickListener(v -> {
            if (text.length() > 0 && text.contains(" ")) {
                int spacePos = text.lastIndexOf(" ");
                text = text.substring(0, spacePos - 1);
                catchDataET.setText(text);
                Log.e("Text Length: ", String.valueOf(text.length()));
            } else {

                catchDataET.setText("");
            }

            return true;
        });

    }

    @OnClick({R.id.catchDataET, R.id.BT1, R.id.BT2, R.id.BT3, R.id.BT4, R.id.BT5, R.id.BT6, R.id.BT7, R.id.BT8, R.id.BT9, R.id.BT0, R.id.BTq, R.id.BTw, R.id.BTe, R.id.BTr, R.id.BTt, R.id.BTy, R.id.BTu, R.id.BTi, R.id.BTo, R.id.BTp, R.id.BTa, R.id.BTs, R.id.BTd, R.id.BTf, R.id.BTg, R.id.BTh, R.id.BTj, R.id.BTk, R.id.BTl, R.id.capsBT, R.id.BTz, R.id.BTx, R.id.BTc, R.id.BTv, R.id.BTb, R.id.BTn, R.id.BTm, R.id.cancelBT, R.id.commaBT, R.id.imoBT, R.id.spaceBT, R.id.fullStopBT, R.id.enterBT})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.BT1:
                apt(view);
                break;
            case R.id.BT2:
                apt(view);
                break;
            case R.id.BT3:
                apt(view);
                break;
            case R.id.BT4:
                apt(view);
                break;
            case R.id.BT5:
                apt(view);
                break;
            case R.id.BT6:
                apt(view);
                break;
            case R.id.BT7:
                apt(view);
                break;
            case R.id.BT8:
                apt(view);
                break;
            case R.id.BT9:
                apt(view);
                break;
            case R.id.BT0:
                apt(view);
                break;
            case R.id.BTq:
                apt(view);
                break;
            case R.id.BTw:
                apt(view);
                break;
            case R.id.BTe:
                apt(view);
                break;
            case R.id.BTr:
                apt(view);
                break;
            case R.id.BTt:
                apt(view);
                break;
            case R.id.BTy:
                apt(view);
                break;
            case R.id.BTu:
                apt(view);
                break;
            case R.id.BTi:
                apt(view);
                break;
            case R.id.BTo:
                apt(view);
                break;
            case R.id.BTp:
                apt(view);
                break;
            case R.id.BTa:
                apt(view);
                break;
            case R.id.BTs:
                apt(view);
                break;
            case R.id.BTd:
                apt(view);
                break;
            case R.id.BTf:
                apt(view);
                break;
            case R.id.BTg:
                apt(view);
                break;
            case R.id.BTh:
                apt(view);
                break;
            case R.id.BTj:
                apt(view);
                break;
            case R.id.BTk:
                apt(view);
                break;
            case R.id.BTl:
                apt(view);
                break;
            case R.id.capsBT:
                apt(view);
                break;
            case R.id.BTz:
                apt(view);
                break;
            case R.id.BTx:
                apt(view);
                break;
            case R.id.BTc:
                apt(view);
                break;
            case R.id.BTv:
                apt(view);
                break;
            case R.id.BTb:
                apt(view);
                break;
            case R.id.BTn:
                apt(view);
                break;
            case R.id.BTm:
                apt(view);
                break;
            case R.id.cancelBT:
                if (text.length() > 0) {
                    text = text.substring(0, text.length() - 1);
                    catchDataET.setText(text);
                } else {
                    catchDataET.setText("");
                }
                break;
            case R.id.commaBT:
                apt(view);
                break;
            case R.id.imoBT:
                text = "";
                catchDataET.setText(text);
                break;
            case R.id.spaceBT:
                text += " ";
                catchDataET.setText(text);
                break;
            case R.id.fullStopBT:
                apt(view);
                break;
            case R.id.enterBT:
                text += "\n";
                catchDataET.setText(text);
                break;
        }
    }

    private void apt(View view) {
        Button b = (Button) view;
        this.text += b.getText();
        catchDataET.setText(this.text);
    }
}
