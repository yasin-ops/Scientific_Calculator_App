package com.muhammadyaseenfatimamazharsarfarz.scientificcalcultor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bpi,
            bequal,bplus,bmin,bmul,bdiv,binv,bsqrt,bsquare,bfact,bln,blog,btan,bcos,bsin;
    TextView bac,bc,bb1,bb2;
    TextView tvmain,tvsec;
    String pi = "3.14159265";
   private static double x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bpi = findViewById(R.id.bpi);
        bdot = findViewById(R.id.bdot);
        bequal = findViewById(R.id.bequal);
        bplus = findViewById(R.id.bplus);
        bmin = findViewById(R.id.bmin);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        binv = findViewById(R.id.binv);
        bsqrt = findViewById(R.id.bsqrt);
        bsquare = findViewById(R.id.bsquare);
        bfact = findViewById(R.id.bfact);
        bln = findViewById(R.id.bln);
        blog = findViewById(R.id.blog);
        btan = findViewById(R.id.btan);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bc = findViewById(R.id.bc);
        bac = findViewById(R.id.bac);

        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        //onclick listeners
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+".");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("");
                tvsec.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                try {
                    val = val.substring(0, val.length() - 1);
                    tvmain.setText(val);
                }catch (Exception e){
                    Toasty.info(MainActivity.this," All text clear",Toast.LENGTH_SHORT).show();

                }
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"+");
            }
        });
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"-");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"×");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"÷");
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                try {
                    double r = Math.sqrt(Double.parseDouble(val));
                    tvmain.setText(String.valueOf(r));
                }catch (Exception e){
                    Toasty.error(MainActivity.this, "Math Error", Toast.LENGTH_SHORT).show();
                    tvmain.setText("");
                    tvsec.setText("");


                }

            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"(");
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+")");
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsec.setText(bpi.getText());
                tvmain.setText(tvmain.getText()+pi);
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"sin");
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"cos");
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"tan");
            }
        });
        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"^"+"(-1)");
            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double val = Integer.parseInt(tvmain.getText().toString());
                    double fact = factorial(val);
                    tvmain.setText(String.valueOf(fact));
                    tvsec.setText(val+"!");

                }catch (Exception e){
                    Toasty.error(MainActivity.this, "Math Error", Toast.LENGTH_SHORT).show();
                    tvmain.setText("");
                    tvsec.setText("");

                }
                          }
        });
        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double d = Double.parseDouble(tvmain.getText().toString());
                    double square = d*d;
                    tvmain.setText(String.valueOf(square));
                    tvsec.setText(d+"²");
                }catch (Exception e){
                    Toasty.error(MainActivity.this, "Math Error", Toast.LENGTH_SHORT).show();
                    tvmain.setText("");
                    tvsec.setText("");

                }

            }
        });
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"ln");
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"log");
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                String replacedstr = val.replace('÷','/').replace('×','*');
                double result = eval(replacedstr);
                tvmain.setText(String.valueOf(result));
                tvsec.setText(val);
            }
        });

    }
    //factorial function
    int factorial(double n)

    {
        try {
            return (n==1 || n==0) ? 1 : (int) (n * factorial(n - 1));
        }catch (Exception e){
            Toasty.error(this, "Math Error ", Toast.LENGTH_SHORT).show();
            tvmain.setText("");
            tvsec.setText("");

        }
        return 0;
    }


    //eval function
    public  double eval(final String str) {
        try {
            return new Object() {
                int pos = -1, ch;

                void nextChar() {
                    ch = (++pos < str.length()) ? str.charAt(pos) : -1;
                }

                boolean eat(int charToEat) {
                    while (ch == ' ') nextChar();
                    if (ch == charToEat) {
                        nextChar();
                        return true;
                    }
                    return false;
                }

                double parse() {

                    nextChar();
                    double x = parseExpression();
                    if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                    return x;
                }


                double parseExpression() {
                    double x = parseTerm();
                    for (;;) {
                        if      (eat('+')) x += parseTerm(); // addition
                        else if (eat('-')) x -= parseTerm(); // subtraction
                        else return x;
                    }
                }

                double parseTerm() {
                    x = parseFactor();
                    for (;;) {
                        if      (eat('*')) x *= parseFactor(); // multiplication
                        else if (eat('/')) x /= parseFactor(); // division
                        else return x;
                    }
                }

                double parseFactor() {


                    if (eat('+')) return parseFactor(); // unary plus
                    if (eat('-')) return -parseFactor(); // unary minus

                    int startPos = this.pos;
                    if (eat('(')) { // parentheses
                        x = parseExpression();
                        eat(')');
                    } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                        while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                        x = Double.parseDouble(str.substring(startPos, this.pos));
                    } else if (ch >= 'a' && ch <= 'z') { // functions
                        while (ch >= 'a' && ch <= 'z') nextChar();
                        String func = str.substring(startPos, this.pos);
                        x = parseFactor();
                        try {
                            if (func.equals("sqrt")) x = Math.sqrt(x);
                            else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                            else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                            else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                            else if (func.equals("log")) x = Math.log10(x);
                            else if (func.equals("ln")) x = Math.log(x);


                        }catch (Exception e){
                            Toasty.error(MainActivity.this, "Math Error ", Toast.LENGTH_SHORT).show();
                            tvmain.setText("");
                            tvsec.setText("");

                        }
                    }


                    if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                    return x;
                }
            }.parse();
        }catch (Exception e){
            Toasty.info(this, "Math Error", Toast.LENGTH_SHORT).show();
            tvmain.setText("");
            tvsec.setText("");

        }

        return 0;
    }

}