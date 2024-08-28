package com.example.daviplays

import android.app.Service

class MatchService : Service {

    private val timer = Timer()

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        timer.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                // Simula a atualização das partidas favoritas
                val broadcastIntent = Intent("MATCH_UPDATE")
                sendBroadcast(broadcastIntent)
            }
        }, 0, 10000) // 10 segundos de intervalo

        return START_STICKY
    }

    override fun onDestroy() {
        timer.cancel()
        super.onDestroy()
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}
}