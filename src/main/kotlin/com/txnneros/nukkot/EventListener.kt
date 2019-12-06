package com.txnneros.nukkot

import cn.nukkit.Player
import cn.nukkit.event.EventHandler
import cn.nukkit.event.Listener
import cn.nukkit.event.player.PlayerJoinEvent
import cn.nukkit.event.player.PlayerQuitEvent
import cn.nukkit.lang.TextContainer

class EventListener : Listener {

    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        val player: Player = event.player as Player
        val name: String = player.name
        player.sendMessage("Hello there, ${name}!")

        event.joinMessage = TextContainer("")
    }

    @EventHandler
    fun onQuit(event: PlayerQuitEvent) {
        event.quitMessage = TextContainer("")
    }
}
