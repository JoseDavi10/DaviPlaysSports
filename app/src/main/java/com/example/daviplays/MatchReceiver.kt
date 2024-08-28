package com.example.daviplays

import android.content.BroadcastReceiver

class MatchReceiver : BroadcastReceiver {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == "MATCH_UPDATE") {
            val notificationManager =
                context?.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            val notification = NotificationCompat.Builder(context, "default")
                .setContentTitle("Atualização de Partida")
                .setContentText("Uma partida favorita foi atualizada!")
                .setSmallIcon(R.drawable.ic_notification)
                .build()

            notificationManager.notify(1, notification)
        }
    }
}
}