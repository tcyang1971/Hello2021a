package tw.edu.pu.csim.tcyang.hello2021a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txv: TextView = findViewById<TextView>(R.id.txv)
        //txv.text = "Hello tcyang"
        //TestMaster()
        //TestDEV()
        txv.text = "嗨，我是楊子青(研究室修改)"
    }

        fun TestMaster() {
            var txv: TextView = findViewById<TextView>(R.id.txv)
            txv.text = "Master分支"

        }

        fun TestDEV() {
            var txv: TextView = findViewById<TextView>(R.id.txv)
            txv.text = "Dev分支"
        }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "tcyangpu修改螢幕觸控youchen0711"
        return true
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "tcyangpu修改螢幕觸控"
        return true
    }

}