package com.domikado.bit.utility

import android.app.Activity
import android.widget.Toast

internal fun Activity.makeText(message: String, duration: Int) =
    Toast.makeText(this, message, duration).show()