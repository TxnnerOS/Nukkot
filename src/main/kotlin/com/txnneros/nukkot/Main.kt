package com.txnneros.nukkot

import cn.nukkit.plugin.PluginBase

class Main : PluginBase() {

    override fun onEnable() {
        registerListeners()
    }

    private fun registerListeners() {
        server.pluginManager.registerEvents(EventListener(), this)
    }
}
