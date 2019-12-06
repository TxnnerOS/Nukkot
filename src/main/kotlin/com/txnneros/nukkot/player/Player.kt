package com.txnneros.nukkot.player

import cn.nukkit.Player
import cn.nukkit.network.SourceInterface

/*
    This is an example of creating a custom player class with
    Kotlin for Nukkit. It is not recommended to do this, and
    can cause issues with other plugins.
*/

class Player(source: SourceInterface?, clientId: Long?, ip: String?, port: Int) : Player(source, clientId, ip, port) {

    var nickname = ""
}
