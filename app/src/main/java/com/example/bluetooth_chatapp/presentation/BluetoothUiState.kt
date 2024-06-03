package com.example.bluetooth_chatapp.presentation

import com.example.bluetooth_chatapp.domain.chat.BluetoothDevice

data class BluetoothUiState(
    val scannedDevices:List<BluetoothDevice> = emptyList(),
    val pairedDevices : List<BluetoothDevice>  = emptyList()
)