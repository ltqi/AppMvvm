package com.aos.app2.ex

import android.os.Build

/**
 * Created by:  qiliantao on 2020.08.04
 * email     :  qiliantao@mockuai.com
 * Describe  :
 */

fun fromM() = fromSpecificVersion(Build.VERSION_CODES.M)
fun beforeM() = beforeSpecificVersion(Build.VERSION_CODES.M)
fun fromN() = fromSpecificVersion(Build.VERSION_CODES.N)
fun beforeN() = beforeSpecificVersion(Build.VERSION_CODES.N)
fun fromO() = fromSpecificVersion(Build.VERSION_CODES.O)
fun beforeO() = beforeSpecificVersion(Build.VERSION_CODES.O)
fun fromP() = fromSpecificVersion(Build.VERSION_CODES.P)
fun beforeP() = beforeSpecificVersion(Build.VERSION_CODES.P)
fun fromSpecificVersion(version: Int): Boolean = Build.VERSION.SDK_INT >= version
fun beforeSpecificVersion(version: Int): Boolean = Build.VERSION.SDK_INT < version