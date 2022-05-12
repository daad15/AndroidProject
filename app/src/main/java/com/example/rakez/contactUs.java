package com.example.rakez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class contactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        final EditText your_name = (EditText) findViewById(R.id.your_name);


        final EditText your_email = (EditText) findViewById(R.id.your_email);


        final EditText your_subject = (EditText) findViewById(R.id.your_subject);


        final EditText your_message = (EditText) findViewById(R.id.your_message);


        Button email = (Button) findViewById(R.id.post_message);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = your_name.getText().toString();


                String email1 = your_email.getText().toString();


                String subject = your_subject.getText().toString();


                String message1 = your_message.getText().toString();

                if (TextUtils.isEmpty(name)) {


                    your_name.setError("ادخل اسمك");


                    your_name.requestFocus();


                    return;


                }


                Boolean onError = false;


                if (!isValidEmail(email1)) {


                    onError = true;


                    your_email.setError("البريد الالكتروني غير صالح");


                    return;


                }


                if (TextUtils.isEmpty(subject)) {


                    your_subject.setError("ضع عنوان للرسالة");


                    your_subject.requestFocus();


                    return;


                }


                if (TextUtils.isEmpty(message1)) {


                    your_message.setError("ادخل رسالتك");


                    your_message.requestFocus();


                    return;


                }


                try {
                    String stringSenderEmail = email1;
                    String stringReceiverEmail = "Rakez.help@gmail.com";
                    String stringPasswordSenderEmail = "112255Rk";

                    String stringHost = "smtp.gmail.com";

                    Properties properties = System.getProperties();

                    properties.put("mail.smtp.host", stringHost);
                    properties.put("mail.smtp.port", "465");
                    properties.put("mail.smtp.ssl.enable", "true");
                    properties.put("mail.smtp.auth", "true");
                    Toast.makeText(getApplicationContext(), "تم الارسال, سيتم التواصل معك في اقرب فرصة", Toast.LENGTH_LONG).show();
                    Session session = Session.getInstance(properties, new Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(stringReceiverEmail, stringPasswordSenderEmail);
                        }
                    });

                    MimeMessage mimeMessage = new MimeMessage(session);
                    mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(stringReceiverEmail));
                    mimeMessage.setText(" From : "+stringSenderEmail+"\r\n Sender name : "+name+"\r\n Subject : "+subject+"\r\n Message : \r\n\r\n\r\n"+message1);
                    mimeMessage.setSubject("استفسار");
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Transport.send(mimeMessage);
                            } catch (MessagingException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    thread.start();

                } catch (AddressException e) {
                    e.printStackTrace();
                } catch (MessagingException e) {
                    e.printStackTrace();
                }

            }

        });
    }

    public void go_menu(View V){
        Intent i = new Intent(this,Menu.class);
        startActivity(i);
        finish();
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            Intent intent = new Intent(this,
                    MainActivity.class);
            startActivity(intent);
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
    @Override


    public void onResume () {


        super.onResume();


        //Get a Tracker (should auto-report)


    }


    @Override


    protected void onStart () {


        super.onStart();


    }


    @Override


    protected void onStop () {


        super.onStop();


    }


    // validating email id


    private boolean isValidEmail (String email1){


        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"


                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";


        Pattern pattern = Pattern.compile(EMAIL_PATTERN);


        Matcher matcher = pattern.matcher(email1);


        return matcher.matches();


    }
}