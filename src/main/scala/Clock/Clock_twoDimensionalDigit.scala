object twoDimensionalDigit{
    val Zero = twoDimensionalString(
        top    =  "  _ ",
        middle =  " | |",
        bottom =  " |_|"
        )
    val One = twoDimensionalString(
        top    =  "    ",
        middle =  "   |",
        bottom =  "   |"
        )
    val Two = twoDimensionalString(
        top    =  "  _ ",
        middle =  "  _|",
        bottom =  " |_ "
    )
    val Three = twoDimensionalString(
        top    =  "  _ ",
        middle =  "  _|",
        bottom =  "  _|"
    )
    val Four = twoDimensionalString(
        top    =  "    ",
        middle =  " |_|",
        bottom =  "   |"
    )
    val Five = twoDimensionalString(
        top    =  "  _ ",
        middle =  " |_ ",
        bottom =  "  _|"
    )
    val Six = twoDimensionalString(
        top    =  "  _ ",
        middle =  " |_ ",
        bottom =  " |_|"
    )
    val Seven = twoDimensionalString(
        top    =  "  _ ",
        middle =  "   |",
        bottom =  "   |"
    )
    val Eight = twoDimensionalString(
        top    =  "  _ ",
        middle =  " |_|",
        bottom =  " |_|"
    )
    val Nine = twoDimensionalString(
        top    =  "  _ ",
        middle =  " |_|",
        bottom =  "  _|"
    )
    def apply(digit:Int):twoDimensionalString = {
        digit match{
            case 0 => Zero
            case 1 => One
            case 2 => Two
            case 3 => Three
            case 4 => Four
            case 5 => Five
            case 6 => Six
            case 7 => Seven
            case 8 => Eight
            case 9 => Nine
            case _ => twoDimensionalString.QuestionMarks

        }
    }

}
