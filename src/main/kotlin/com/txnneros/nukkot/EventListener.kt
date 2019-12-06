package com.txnneros.nukkot

import cn.nukkit.event.EventHandler
import cn.nukkit.event.Listener
import cn.nukkit.event.player.PlayerCreationEvent
import cn.nukkit.event.player.PlayerJoinEvent
import cn.nukkit.event.player.PlayerQuitEvent
import cn.nukkit.lang.TextContainer

import com.txnneros.nukkot.player.Player

class EventListener : Listener {

    @EventHandler
    fun onCreation(event: PlayerCreationEvent) {
        event.playerClass = Player::class.java
    }

    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        val player: Player = event.player as Player
        val name: String = player.name
        player.sendMessage("Hello there, ${name}!")
        player.nickname = "Nickname_${name}"
        player.nameTag = player.nickname
        player.displayName = player.nickname
        player.sendMessage("Your nickname set to: ${player.nickname}!")

        event.joinMessage = TextContainer("")
    }

    @EventHandler
    fun onQuit(event: PlayerQuitEvent) {
        event.quitMessage = TextContainer("")
    }
}
