package com.smartwear.publicwatch.https.params

class DialSystemBean {
    var dialCodes = ""
    var deviceType = ""
    var languageCode = ""
    override fun toString(): String {
        return "DialSystemBean(dialCodes='$dialCodes', deviceType='$deviceType', languageCode='$languageCode')"
    }
}