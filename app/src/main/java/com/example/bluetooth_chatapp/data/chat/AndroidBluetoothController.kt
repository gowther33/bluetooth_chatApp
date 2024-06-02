package com.example.bluetooth_chatapp.data.chat

import android.content.Context
import com.example.bluetooth_chatapp.domain.chat.BluetoothController
import com.example.bluetooth_chatapp.domain.chat.BluetoothDevice
import kotlinx.coroutines.flow.StateFlow

class AndroidBluetoothController(
    val context:Context
): BluetoothController {

    override val scannedDevices: StateFlow<List<BluetoothDevice>>
        get() = TODO("Not yet implemented")
    override val pairedDevices: StateFlow<List<BluetoothDevice>>
        get() = TODO("Not yet implemented")

    override fun startDiscovery() {
        TODO("Not yet implemented")
    }

    override fun stopDiscovery() {
        TODO("Not yet implemented")
    }

    override fun release() {
        TODO("Not yet implemented")
    }
}