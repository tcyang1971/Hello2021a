package tw.edu.pu.csim.tcyang.hello2021a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txv: TextView = findViewById<TextView>(R.id.txv)
        //txv.text = "Hello tcyang"
        //TestMaster()
        //TestDEV()
        txv.text = "嗨，我是楊子青"
    }

        fun TestMaster() {
            var txv: TextView = findViewById<TextView>(R.id.txv)
            txv.text = "Master分支"

        }

        fun TestDEV() {
            var txv: TextView = findViewById<TextView>(R.id.txv)
            txv.text = "Dev分支"
        }
    }