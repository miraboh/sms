package com.bayoku.sms


/**
 * Created by Myraboh on 10/3/22.
 */
import android.app.Application
import android.util.Log

class BaseApplication : Application() {

    private val TAG = BaseApplication::class.java.simpleName

    override fun onCreate() {
        super.onCreate()
        // Generate Hash Key >>>>>
        val appSignatureHashHelper = AppSignatureHashHelper(this)
        Log.e(TAG, "HashKey: " + appSignatureHashHelper.appSignatures[0])
    }
}