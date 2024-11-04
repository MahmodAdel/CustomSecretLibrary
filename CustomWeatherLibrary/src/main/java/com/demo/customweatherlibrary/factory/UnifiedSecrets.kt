package com.demo.customweatherlibrary.factory

import com.demo.customweatherlibrary.Constants
import com.demo.customweatherlibrary.Secrets

object UnifiedSecrets {

    fun getSecretUrl():String{
       return Secrets().getbaseUrl(Constants.packageName)
    }

    fun getSecretApiKey():String{
        return Secrets().getapiKey(Constants.packageName)
    }
}