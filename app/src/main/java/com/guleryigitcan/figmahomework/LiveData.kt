package com.guleryigitcan.figmahomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class LiveData : AppCompatActivity() {

    val editText by lazy {findViewById<EditText>(R.id.liveDataEditText)}
    val textView by lazy {findViewById<TextView>(R.id.liveDataText)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)


        var username= arrayOf("yigitcan","umut","batuhan","hasan")


        editText.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                // textView.text=p0.toString()
                val str=p0.toString()
                var anan=" "
                for(item in username.indices){
                    anan=username[item]
                    if(str==username[item] ){
                        textView.text="Bu kullanıcı adı kullanılıyor"
                        break
                    }
                    else{
                        textView.text="${str} Kullanılabilir"
                    }
                }

            }

        })
    }
}