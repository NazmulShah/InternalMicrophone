package com.example.user.internalmicrophone;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity  {


        private Button modeBtn;
        private Button increaseBtn;
        private Button decreaseBtn;
        private RadioButton mute;
        private RadioButton unmute;
        private RadioGroup ringGroup;
        private TextView status;
        private AudioManager myAudioManager;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mute = (RadioButton) findViewById(R.id.radioNormal);
        unmute = (RadioButton) findViewById(R.id.radioSilent);
        status = (TextView) findViewById(R.id.text);
        ringGroup = (RadioGroup) findViewById(R.id.radioRinger);

        modeBtn = (Button)findViewById(R.id.mode);
        modeBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                int selectedId = ringGroup.getCheckedRadioButtonId();

                // find which radioButton is checked by id
                if(selectedId == mute.getId()) {
                    muteEnable(v);
                } else if(selectedId == unmute.getId()) {
                   unmuteEnable(v);
                }
            }
        });


        // get the instance of AudioManager class
        myAudioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);

    }


    public void unmuteEnable(View view){
        // set the ring mode to loud
        /*myAudioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
        status.setText("Current Status: Ring Mode");*/

        //if(!myAudioManager.isMicrophoneMute())
        //{
          /*  myAudioManager.isMicrophoneMute();*/


            myAudioManager.setMicrophoneMute(false);

            //myAudioManager.setSpeakerphoneOn(false);
           // myAudioManager.setStreamVolume(AudioManager.STREAM_DTMF,0,AudioManager.FLAG_SHOW_UI);
            //myAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC,AudioManager.FLAG_SHOW_UI);


            status.setText("Current Status: unmute");

     //   }



    }


    public void muteEnable(View view){


         //myAudioManager.setMicrophoneMute(true);


     //   if(myAudioManager.isMicrophoneMute())
      //  {
          /*  myAudioManager.isMicrophoneMute();*/

      /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {

           String micSupportString = myAudioManager.getProperty(
                   AudioManager.PROPERTY_SUPPORT_MIC_NEAR_ULTRASOUND);


           status.setText("Current Status:  micro phone mute" + " "+ micSupportString);


        }*/






      //  Log.d(TAG, "PROPERTY_SUPPORT_MIC_NEAR_ULTRASOUND = " + micSupportString);

       /* if (micSupportString == null) {
            micSupportString = "null";
        }*/

        //myAudioManager.setMicrophoneMute(true);
           // //myAudioManager.setSpeakerphoneOn(false);
            // myAudioManager.setStreamVolume(AudioManager.STREAM_DTMF,0,AudioManager.FLAG_SHOW_UI);
            //myAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC,AudioManager.FLAG_SHOW_UI);




      //  }






    }



}