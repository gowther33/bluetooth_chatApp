package com.example.bluetooth_chatapp.domain.chat

import kotlinx.coroutines.flow.StateFlow

interface BluetoothController {
    val scannedDevices:StateFlow<List<BluetoothDevice>>
    val pairedDevices:StateFlow<List<BluetoothDevice>>

    fun startDiscovery()

    fun stopDiscovery()

    fun release()
}