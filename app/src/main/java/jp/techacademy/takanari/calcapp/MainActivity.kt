package jp.techacademy.takanari.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import kotlinx.android.synthetic.main.activity_second.*
import android.util.Log

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }
    override fun onClick(v: View) {

        try  {
            if (v.id == R.id.button1) {

                val value1 = editText1.text.toString().toDouble()
                val value2 = editText2.text.toString().toDouble()

                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", (value1 + value2))
                startActivity(intent)

            } else if (v.id == R.id.button2) {
                val value1 = editText1.text.toString().toDouble()
                val value2 = editText2.text.toString().toDouble()

                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", (value1 - value2))
                startActivity(intent)

            } else if (v.id == R.id.button3) {
                val value1 = editText1.text.toString().toDouble()
                val value2 = editText2.text.toString().toDouble()

                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", (value1 * value2))
                startActivity(intent)

            } else if (v.id == R.id.button4) {
                val value1 = editText1.text.toString().toDouble()
                val value2 = editText2.text.toString().toDouble()

                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", (value1 / value2))
                startActivity(intent)

            }
        }catch (e: Exception) {
            Log.d("kotlintest", "何か数値を入力してください")
          }
    }

}
