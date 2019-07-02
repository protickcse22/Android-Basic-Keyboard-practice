package com.softbd.keyboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    EditText catchDataET;
    Button oneBTN, twoBTN, threeBTN, qBTN, wBTN, commaBT, fullStopBT, spaceBTN, fourBTN, fiveBTN, sixBTN, severBTN, eightBTN,
            nineBTN, zeroBTN, eBTN, rBTN, tBTN, yBTN, uBTN, iBTN, oBTN, pBTN, aBTN, sBTN, dBTN, fBTN, gBTN, hBTN, jBTN, kBTN, lBTN, zBTN, xBTN, cBTN, vBTN, bBTN, nBTN, mBTN;
    ImageButton capsBT, cancelBT, imoBTN, enterBTN;
    private String text = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        catchDataET = findViewById(R.id.catchDataET);
        oneBTN = findViewById(R.id.BT1);
        twoBTN = findViewById(R.id.BT2);
        threeBTN = findViewById(R.id.BT3);
        qBTN = findViewById(R.id.BTq);
        wBTN = findViewById(R.id.BTw);
        commaBT = findViewById(R.id.commaBT);
        fullStopBT = findViewById(R.id.fullStopBT);
        spaceBTN = findViewById(R.id.spaceBT);
        capsBT = findViewById(R.id.capsBT);
        cancelBT = findViewById(R.id.cancelBT);
        imoBTN = findViewById(R.id.imoBT);
        enterBTN = findViewById(R.id.enterBT);
        fourBTN = findViewById(R.id.BT4);
        fiveBTN = findViewById(R.id.BT5);
        sixBTN = findViewById(R.id.BT6);
        severBTN = findViewById(R.id.BT7);
        eightBTN = findViewById(R.id.BT8);
        nineBTN = findViewById(R.id.BT9);
        zeroBTN = findViewById(R.id.BT0);
        eBTN = findViewById(R.id.BTe);
        rBTN = findViewById(R.id.BTr);
        tBTN = findViewById(R.id.BTt);
        yBTN = findViewById(R.id.BTy);
        uBTN = findViewById(R.id.BTu);
        iBTN = findViewById(R.id.BTi);
        oBTN = findViewById(R.id.BTo);
        pBTN = findViewById(R.id.BTp);
        aBTN = findViewById(R.id.BTa);
        sBTN = findViewById(R.id.BTs);
        dBTN = findViewById(R.id.BTd);
        fBTN = findViewById(R.id.BTf);
        gBTN = findViewById(R.id.BTg);
        hBTN = findViewById(R.id.BTh);
        jBTN = findViewById(R.id.BTj);
        kBTN = findViewById(R.id.BTk);
        lBTN = findViewById(R.id.BTl);
        zBTN = findViewById(R.id.BTz);
        xBTN = findViewById(R.id.BTx);
        cBTN = findViewById(R.id.BTc);
        vBTN = findViewById(R.id.BTv);
        bBTN = findViewById(R.id.BTb);
        nBTN = findViewById(R.id.BTn);
        mBTN = findViewById(R.id.BTm);


        oneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += oneBTN.getText();
                catchDataET.setText(text);
            }
        });
        twoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += twoBTN.getText();
                catchDataET.setText(text);
            }
        });
        threeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += threeBTN.getText();
                catchDataET.setText(text);
            }
        });
        fourBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += fourBTN.getText();
                catchDataET.setText(text);
            }
        });
        fiveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += fiveBTN.getText();
                catchDataET.setText(text);
            }
        });
        sixBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += sixBTN.getText();
                catchDataET.setText(text);
            }
        });
        severBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += severBTN.getText();
                catchDataET.setText(text);
            }
        });
        eightBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += eightBTN.getText();
                catchDataET.setText(text);
            }
        });
        nineBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += nineBTN.getText();
                catchDataET.setText(text);
            }
        });

        zeroBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += zeroBTN.getText();
                catchDataET.setText(text);
            }
        });

        qBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += qBTN.getText();
                catchDataET.setText(text);
            }
        });
        wBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += wBTN.getText();
                catchDataET.setText(text);
            }
        });
        eBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += eBTN.getText();
                catchDataET.setText(text);
            }
        });

        rBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += rBTN.getText();
                catchDataET.setText(text);
            }
        });
        tBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += tBTN.getText();
                catchDataET.setText(text);
            }
        });


        yBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += yBTN.getText();
                catchDataET.setText(text);
            }
        });

        uBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += uBTN.getText();
                catchDataET.setText(text);
            }
        });

        iBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += iBTN.getText();
                catchDataET.setText(text);
            }
        });


        oBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += oBTN.getText();
                catchDataET.setText(text);
            }
        });

        pBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += pBTN.getText();
                catchDataET.setText(text);
            }
        });

        aBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += aBTN.getText();
                catchDataET.setText(text);
            }
        });


        sBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += sBTN.getText();
                catchDataET.setText(text);
            }
        });

        dBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += dBTN.getText();
                catchDataET.setText(text);
            }
        });

        fBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += fBTN.getText();
                catchDataET.setText(text);
            }
        });

        gBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += gBTN.getText();
                catchDataET.setText(text);
            }
        });

        hBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += hBTN.getText();
                catchDataET.setText(text);
            }
        });

        jBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += jBTN.getText();
                catchDataET.setText(text);
            }
        });
        kBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += kBTN.getText();
                catchDataET.setText(text);
            }
        });

        lBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += lBTN.getText();
                catchDataET.setText(text);
            }
        });

        zBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += zBTN.getText();
                catchDataET.setText(text);
            }
        });

        xBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += xBTN.getText();
                catchDataET.setText(text);
            }
        });

        cBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += cBTN.getText();
                catchDataET.setText(text);
            }
        });

        vBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += vBTN.getText();
                catchDataET.setText(text);
            }
        });

        bBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += bBTN.getText();
                catchDataET.setText(text);
            }
        });

        nBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += nBTN.getText();
                catchDataET.setText(text);
            }
        });

        mBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += mBTN.getText();
                catchDataET.setText(text);
            }
        });


        cancelBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (text.length() > 0) {
                    text = text.substring(0, text.length() - 1);
                    catchDataET.setText(text);
                } else {
                    catchDataET.setText("");
                }

            }
        });
        capsBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        enterBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += "\n";
                catchDataET.setText(text);
            }
        });
        spaceBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += " ";
                catchDataET.setText(text);
            }
        });


        commaBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += commaBT.getText();
                catchDataET.setText(text);
            }
        });

        fullStopBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += fullStopBT.getText();
                catchDataET.setText(text);
            }
        });


        final Button[] btn = {qBTN, wBTN, eBTN, rBTN, tBTN, yBTN, uBTN, iBTN, oBTN, pBTN,
                aBTN, sBTN, dBTN, fBTN, gBTN, hBTN, jBTN, kBTN, lBTN, zBTN, xBTN, cBTN, vBTN, bBTN, nBTN, mBTN};


        capsBT.setOnClickListener(new View.OnClickListener() {
            int count = 1;

            @Override
            public void onClick(View v) {
                if (count % 2 != 0) {
                    for (int i = 0; i < btn.length; i++) {
                        btn[i].setText(btn[i].getText().toString().toUpperCase());

                    }

                } else {
                    for (int i = 0; i < btn.length; i++) {
                        btn[i].setText(btn[i].getText().toString().toLowerCase());

                    }
                }
                count++;
            }
        });


    }

}
