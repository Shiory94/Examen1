package com.example.corei7.examelp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    public class MainActivity extends AppCompatActivity implements View.OnClickListener {


        TextView txtDisplay;

        String operation;
        double resultado;
        int numero1;
        int numero2;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);


            txtDisplay = (TextView) findViewById(R.id.txtDisplay);

            Button btn01 = (Button) findViewById(R.id.btn01);
            Button btn02 = (Button) findViewById(R.id.btn02);
            Button btn03 = (Button) findViewById(R.id.btn03);
            Button btn04 = (Button) findViewById(R.id.btn04);
            Button btn05 = (Button) findViewById(R.id.btn05);
            Button btn06 = (Button) findViewById(R.id.btn06);
            Button btn07 = (Button) findViewById(R.id.btn07);
            Button btn08 = (Button) findViewById(R.id.btn08);
            Button btn09 = (Button) findViewById(R.id.btn09);
            Button btn00 = (Button) findViewById(R.id.btn00);


            Button btnSum = (Button) findViewById(R.id.btnSum);
            Button btnSub = (Button) findViewById(R.id.btnSub);
            Button btnMult = (Button) findViewById(R.id.btnMult);
            Button btnSplit = (Button) findViewById(R.id.btnSplit);
            Button btnEquals = (Button) findViewById(R.id.btnEquals);
            Button btnClean = (Button) findViewById(R.id.btnClean);
            final Button btnPoint = (Button) findViewById(R.id.btnPoint);


            Button btnSquar = (Button) findViewById(R.id.btnSquar);
            Button btnPerce = (Button) findViewById(R.id.btnPerce);
            Button btnSin = (Button) findViewById(R.id.btnSin);
            Button btnCos = (Button) findViewById(R.id.btnCos);
            Button btnTan = (Button) findViewById(R.id.btnTan);
            Button btnPi = (Button) findViewById(R.id.btnPi);
            Button btnPariz = (Button) findViewById(R.id.btnPariz);
            Button btnParde = (Button) findViewById(R.id.btnParde);
            Button btnDele = (Button) findViewById(R.id.btnDele);


            btnClean.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numero1 = 0;
                    txtDisplay.setText("");
                }
            });

            btnEquals.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numero2 = Integer.parseInt(txtDisplay.getText().toString());
                    if (operation.equals("+")) {
                        resultado = numero1 + numero2;
                        txtDisplay.setText(resultado + "");
                    }
                    if (operation.equals("-")) {
                        resultado = numero2 - numero1;
                        txtDisplay.setText(resultado + "");
                    }
                    if (operation.equals("*")) {
                        resultado = numero1 * numero2;
                        txtDisplay.setText(resultado + "");
                    }

                    if (operation.equals("/")) {
                        resultado = numero1 / numero2;
                        txtDisplay.setText(resultado + "");
                    }
                    if (operation.equals("%")) {
                        resultado = numero1 * (numero2 / 100);
                        txtDisplay.setText(resultado + "");
                    }


                }
            });


            btnSum.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numero1 = Integer.parseInt(txtDisplay.getText().toString());
                    operation = "+";
                    txtDisplay.setText("");
                }
            });

            btnPi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    resultado = Math.PI;
                    txtDisplay.setText(resultado + "");
                }
            });

            btnSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numero1 = Integer.parseInt(txtDisplay.getText().toString());
                    operation = "-";
                    txtDisplay.setText("");
                }
            });

            btnMult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numero1 = Integer.parseInt(txtDisplay.getText().toString());
                    operation = "*";
                    txtDisplay.setText("");
                }
            });

            btnSplit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numero1 = Integer.parseInt(txtDisplay.getText().toString());
                    operation = "/";
                    txtDisplay.setText("");
                }
            });

            btnPerce.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numero1 = Integer.parseInt(txtDisplay.getText().toString());
                    operation = "%";
                    txtDisplay.setText("");
                }
            });

            btnSin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numero1 = Integer.parseInt(txtDisplay.getText().toString());
                    double rd = Math.toRadians(numero1);
                    resultado = Math.sin(rd);
                    txtDisplay.setText(resultado + "");
                }
            });

            btnCos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numero1 = Integer.parseInt(txtDisplay.getText().toString());
                    double rd = Math.toRadians(numero1);
                    resultado = Math.cos(rd);
                    txtDisplay.setText(resultado + "");
                }
            });

            btnTan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numero1 = Integer.parseInt(txtDisplay.getText().toString());
                    double rd = Math.toRadians(numero1);
                    resultado = Math.tan(rd);
                    txtDisplay.setText(resultado + "");
                }
            });

            btnSquar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numero1 = Integer.parseInt(txtDisplay.getText().toString());
                    resultado = Math.sqrt(numero1);
                    txtDisplay.setText(resultado + "");
                }
            });


            btnDele.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtDisplay.setText(txtDisplay.getText().toString().substring(0, txtDisplay.getText().length() - 1));
                }
            });


            btn01.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtDisplay.setText(txtDisplay.getText() + "1");
                }
            });

            btn02.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtDisplay.setText(txtDisplay.getText() + "2");
                }
            });

            btn03.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtDisplay.setText(txtDisplay.getText() + "3");
                }
            });

            btn04.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtDisplay.setText(txtDisplay.getText() + "4");
                }
            });

            btn05.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtDisplay.setText(txtDisplay.getText() + "5");
                }
            });

            btn06.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtDisplay.setText(txtDisplay.getText() + "6");
                }
            });

            btn07.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtDisplay.setText(txtDisplay.getText() + "7");
                }
            });

            btn08.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtDisplay.setText(txtDisplay.getText() + "8");
                }
            });

            btn09.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtDisplay.setText(txtDisplay.getText() + "9");
                }
            });

            btn00.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtDisplay.setText(txtDisplay.getText() + "0");
                }
            });

            btnPoint.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtDisplay.setText(txtDisplay.getText() + ".");
                }
            });

            btnParde.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtDisplay.setText(txtDisplay.getText() + "(");
                }
            });

            btnPariz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtDisplay.setText(txtDisplay.getText() + ")");
                }
            });


        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }

        @Override
        public void onClick(View v) {
//       TextView pantalla= (TextView)findViewById(R.id.txtDisplay);
//        int seleccion=v.getId();
//        String a=pantalla.getText().toString();

        }

    }
    }
