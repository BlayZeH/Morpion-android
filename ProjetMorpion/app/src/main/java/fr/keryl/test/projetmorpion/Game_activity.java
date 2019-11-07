package fr.keryl.test.projetmorpion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Game_activity extends AppCompatActivity {

    private TextView title;
    private TextView restart;
    private Button buttonGame1;
    private Button buttonGame2;
    private Button buttonGame3;
    private Button buttonGame4;
    private Button buttonGame5;
    private Button buttonGame6;
    private Button buttonGame7;
    private Button buttonGame8;
    private Button buttonGame9;
    private static String currentPlayer = "Player1";
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_activity);

        this.title = findViewById(R.id.textView3);
        this.restart = findViewById(R.id.textView10);
        this.buttonGame1 = findViewById(R.id.buttonGame1);
        this.buttonGame2 = findViewById(R.id.buttonGame2);
        this.buttonGame3 = findViewById(R.id.buttonGame3);
        this.buttonGame4 = findViewById(R.id.buttonGame4);
        this.buttonGame5 = findViewById(R.id.buttonGame5);
        this.buttonGame6 = findViewById(R.id.buttonGame6);
        this.buttonGame7 = findViewById(R.id.buttonGame7);
        this.buttonGame8 = findViewById(R.id.buttonGame8);
        this.buttonGame9 = findViewById(R.id.buttonGame9);
        this.textView2 = findViewById(R.id.textView2);

        buttonGame1.setText(" ");
        buttonGame2.setText(" ");
        buttonGame3.setText(" ");
        buttonGame4.setText(" ");
        buttonGame5.setText(" ");
        buttonGame6.setText(" ");
        buttonGame7.setText(" ");
        buttonGame8.setText(" ");
        buttonGame9.setText(" ");


        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainActivity);
                finish();
            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart();
            }
        });

        buttonGame1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentPlayer.equals("Player1")) {
                    if (buttonGame1.getText().equals(" ")) {
                        buttonGame1.setText("X");
                        currentPlayer = "Player2";
                        textView2.setText("Au tour de Player 2");
                    }

                } else if (currentPlayer.equals("Player2")) {
                    if (buttonGame1.getText().equals(" ")) {
                        buttonGame1.setText("O");
                        currentPlayer = "Player1";
                        textView2.setText("Au tour de Player 1");
                    }

                }

                if (verif().equals("Player1")) {
                    textView2.setText("Victoire de Player1");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    restart();
                } else if (verif().equals("Player2")) {
                    textView2.setText(("Victoire de Player2"));
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    restart();
                }
            }
        });

        buttonGame2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentPlayer.equals("Player1")) {
                    if (buttonGame2.getText().equals(" ")) {
                        buttonGame2.setText("X");
                        currentPlayer = "Player2";
                        textView2.setText("Au tour de Player 2");
                    }

                } else if (currentPlayer.equals("Player2")) {
                    if (buttonGame2.getText().equals(" ")) {
                        buttonGame2.setText("O");
                        currentPlayer = "Player1";
                        textView2.setText("Au tour de Player 1");
                    }

                }

                if (verif().equals("Player1")) {
                    textView2.setText("Victoire de Player1");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    restart();

                } else if (verif().equals("Player2")) {
                    textView2.setText(("Victoire de Player2"));
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    restart();
                }
            }
        });

        buttonGame3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentPlayer.equals("Player1")) {
                    if (buttonGame3.getText().equals(" ")) {
                        buttonGame3.setText("X");
                        currentPlayer = "Player2";
                        textView2.setText("Au tour de Player 2");
                    }

                } else if (currentPlayer.equals("Player2")) {
                    if (buttonGame3.getText().equals(" ")) {
                        buttonGame3.setText("O");
                        currentPlayer = "Player1";
                        textView2.setText("Au tour de Player 1");
                    }

                }

                if (verif().equals("Player1")) {
                    textView2.setText("Victoire de Player1");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    restart();
                } else if (verif().equals("Player2")) {
                    textView2.setText(("Victoire de Player2"));
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    restart();
                }
            }
        });

        buttonGame4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentPlayer.equals("Player1")) {
                    if (buttonGame4.getText().equals(" ")) {
                        buttonGame4.setText("X");
                        currentPlayer = "Player2";
                        textView2.setText("Au tour de Player 2");
                    }

                } else if (currentPlayer.equals("Player2")) {
                    if (buttonGame4.getText().equals(" ")) {
                        buttonGame4.setText("O");
                        currentPlayer = "Player1";
                        textView2.setText("Au tour de Player 1");
                    }

                }

                if (verif().equals("Player1")) {
                    textView2.setText("Victoire de Player1");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    restart();
                } else if (verif().equals("Player2")) {
                    textView2.setText(("Victoire de Player2"));
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    restart();
                }
            }
        });

        buttonGame5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentPlayer.equals("Player1")) {
                    if (buttonGame5.getText().equals(" ")) {
                        buttonGame5.setText("X");
                        currentPlayer = "Player2";
                        textView2.setText("Au tour de Player 2");
                    }

                } else if (currentPlayer.equals("Player2")) {
                    if (buttonGame5.getText().equals(" ")) {
                        buttonGame5.setText("O");
                        currentPlayer = "Player1";
                        textView2.setText("Au tour de Player 1");
                    }

                }

                if (verif().equals("Player1")) {
                    textView2.setText("Victoire de Player1");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    restart();
                } else if (verif().equals("Player2")) {
                    textView2.setText(("Victoire de Player2"));
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    restart();
                }
            }
        });

        buttonGame6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentPlayer.equals("Player1")) {
                    if (buttonGame6.getText().equals(" ")) {
                        buttonGame6.setText("X");
                        currentPlayer = "Player2";
                        textView2.setText("Au tour de Player 2");
                    }

                } else if (currentPlayer.equals("Player2")) {
                    if (buttonGame6.getText().equals(" ")) {
                        buttonGame6.setText("O");
                        currentPlayer = "Player1";
                        textView2.setText("Au tour de Player 1");
                    }

                }

                if (verif().equals("Player1")) {
                    textView2.setText("Victoire de Player1");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    restart();
                } else if (verif().equals("Player2")) {
                    textView2.setText(("Victoire de Player2"));
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    restart();
                }
            }
        });

        buttonGame7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentPlayer.equals("Player1")) {
                    if (buttonGame7.getText().equals(" ")) {
                        buttonGame7.setText("X");
                        currentPlayer = "Player2";
                        textView2.setText("Au tour de Player 2");
                    }

                } else if (currentPlayer.equals("Player2")) {
                    if (buttonGame7.getText().equals(" ")) {
                        buttonGame7.setText("O");
                        currentPlayer = "Player1";
                        textView2.setText("Au tour de Player 1");
                    }

                }

                if (verif().equals("Player1")) {
                    textView2.setText("Victoire de Player1");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    restart();
                } else if (verif().equals("Player2")) {
                    textView2.setText(("Victoire de Player2"));
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    restart();
                }
            }
        });

        buttonGame8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentPlayer.equals("Player1")) {
                    if (buttonGame8.getText().equals(" ")) {
                        buttonGame8.setText("X");
                        currentPlayer = "Player2";
                        textView2.setText("Au tour de Player 2");
                    }

                } else if (currentPlayer.equals("Player2")) {
                    if (buttonGame8.getText().equals(" ")) {
                        buttonGame8.setText("O");
                        currentPlayer = "Player1";
                        textView2.setText("Au tour de Player 1");
                    }

                }


                if (verif().equals("Player1")) {
                    textView2.setText("Victoire de Player1");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    restart();
                } else if (verif().equals("Player2")) {
                    textView2.setText(("Victoire de Player2"));
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    restart();
                }
            }
        });

        buttonGame9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentPlayer.equals("Player1")) {
                    if (buttonGame9.getText().equals(" ")) {
                        buttonGame9.setText("X");
                        currentPlayer = "Player2";
                        textView2.setText("Au tour de Player 2");
                    }

                } else if (currentPlayer.equals("Player2")) {
                    if (buttonGame9.getText().equals(" ")) {
                        buttonGame9.setText("O");
                        currentPlayer = "Player1";
                        textView2.setText("Au tour de Player 1");
                    }

                }

                if (verif().equals("Player1")) {
                    textView2.setText("Victoire de Player1");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    restart();
                } else if (verif().equals("Player2")) {
                    textView2.setText(("Victoire de Player2"));
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    restart();
                }
            }
        });

    }

    public void restart() {
        currentPlayer = "Player1";
        if(textView2.getText().equals("Victoire de Player1") || textView2.getText().equals("Victoire de Player2")){
            //do nothing
        }else{
            textView2.setText("Au tour de Player 1");
        }
        buttonGame1.setText(" ");
        buttonGame2.setText(" ");
        buttonGame3.setText(" ");
        buttonGame4.setText(" ");
        buttonGame5.setText(" ");
        buttonGame6.setText(" ");
        buttonGame7.setText(" ");
        buttonGame8.setText(" ");
        buttonGame9.setText(" ");
    }

    public String verif() {
        String res = " ";
        if (buttonGame1.getText().equals("X") && buttonGame2.getText().equals("X") && buttonGame3.getText().equals("X")) {
            res = "Player1";
        } else if (buttonGame4.getText().equals("X") && buttonGame5.getText().equals("X") && buttonGame6.getText().equals("X")) {
            res = "Player1";
        } else if (buttonGame7.getText().equals("X") && buttonGame8.getText().equals("X") && buttonGame9.getText().equals("X")) {
            res = "Player1";
        } else if (buttonGame1.getText().equals("X") && buttonGame4.getText().equals("X") && buttonGame7.getText().equals("X")) {
            res = "Player1";
        } else if (buttonGame2.getText().equals("X") && buttonGame5.getText().equals("X") && buttonGame8.getText().equals("X")) {
            res = "Player1";
        } else if (buttonGame3.getText().equals("X") && buttonGame6.getText().equals("X") && buttonGame9.getText().equals("X")) {
            res = "Player1";
        } else if (buttonGame1.getText().equals("X") && buttonGame5.getText().equals("X") && buttonGame9.getText().equals("X")) {
            res = "Player1";
        } else if (buttonGame3.getText().equals("X") && buttonGame5.getText().equals("X") && buttonGame9.getText().equals("X")) {
            res = "Player1";
        } else if (buttonGame1.getText().equals("O") && buttonGame2.getText().equals("O") && buttonGame3.getText().equals("O")) {
            res = "Player2";
        } else if (buttonGame4.getText().equals("O") && buttonGame5.getText().equals("O") && buttonGame6.getText().equals("O")) {
            res = "Player2";
        } else if (buttonGame7.getText().equals("O") && buttonGame8.getText().equals("O") && buttonGame9.getText().equals("O")) {
            res = "Player2";
        } else if (buttonGame1.getText().equals("O") && buttonGame4.getText().equals("O") && buttonGame7.getText().equals("O")) {
            res = "Player2";
        } else if (buttonGame2.getText().equals("O") && buttonGame5.getText().equals("O") && buttonGame8.getText().equals("O")) {
            res = "Player2";
        } else if (buttonGame3.getText().equals("O") && buttonGame6.getText().equals("O") && buttonGame9.getText().equals("O")) {
            res = "Player2";
        } else if (buttonGame1.getText().equals("O") && buttonGame5.getText().equals("O") && buttonGame9.getText().equals("O")) {
            res = "Player2";
        } else if (buttonGame3.getText().equals("O") && buttonGame5.getText().equals("O") && buttonGame7.getText().equals("O")) {
            res = "Player2";
        }
        return res;
    }
}
//implementer la verification de victoire et defaite