package plot

import kotlin.native.concurrent.*
import platform.posix.sleep
import kotlinx.cinterop.*
import kotlin.text.*
import libxslt.*

class SVGParser {
 
    fun parseFile(xmlFile: String):SVGImage {
        var xmlDoc = xmlReadDoc(xmlFile, null, null, 0)
        if xmlDoc {
            image = SVGImage()
            return image.createSVGImage(xmlDoc)          
        } else {
            return null
        }
    }
}