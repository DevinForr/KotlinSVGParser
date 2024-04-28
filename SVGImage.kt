/*typedef struct {
    char namespace[256];
    char title[256];
    char description[256];

    List* rectangles;
    List* circles;
    List* paths;
    List* groups;  

    List* otherAttributes;
} SVGimage; */

class SVGImage {
    var namespace: String 
    var title: String
    var description: String

    val rectangleList = mutableListOf()
    val circleList = mutableListOf()
    val pathList = mutableListOf()
    val groupList = mutableListOf()
    val otherAttributes = mutableListOf()

    fun createSVGImage(args: xmlDoc):SVGImage {
        if (xmlDoc) {
            
        }
    }
}