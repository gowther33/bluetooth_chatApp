package com.example.bluetooth_chatapp.domain.chat

typealias BluetoothDeviceDomain = BluetoothDevice
data class BluetoothDevice(
    val name:String?,
    val address:String,
)
