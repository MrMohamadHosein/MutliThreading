package ir.MrMohamadHosein.mutlithreading

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v("testThread" , Thread.currentThread().name)

        // method1  =>
        val thread1 = Thread1()
        thread1.start()


        // method2 =>
        val thread2 = Thread( Thread2() )
        thread2.start()


        // method3 =>
        val thread3 = Thread( object :Runnable {
            override fun run() {
                Log.v("testThread" , Thread.currentThread().name)
            }

        } )
        thread3.start()


        // method4 =>
        val thread4 = Thread {
            Log.v("testThread" , Thread.currentThread().name)
        }.start()



    }
}