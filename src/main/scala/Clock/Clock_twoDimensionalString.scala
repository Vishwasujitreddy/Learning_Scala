final case class twoDimensionalString(
    top:String,
    middle:String,
    bottom:String){
        require(
            requirement = doAllRowsHaveSameLength,
            message = "All rows must have same length!"
        )
        private def doAllRowsHaveSameLength:Boolean = {
            top.length == middle.length && middle.length == bottom.length

        } 
        def +(that:twoDimensionalString):twoDimensionalString= {
            twoDimensionalString(
                top = this.top + that.top,
                middle = this.middle + that.middle,
                bottom = this.bottom + that.bottom
                )
        }
        def show():Unit ={
            println(rendered)
    
        }
        private def rendered:String =
            top    + "\n" +
            middle + "\n" +
            bottom       
}
object twoDimensionalString{
    val QuestionMarks: twoDimensionalString = 
        twoDimensionalString(
        top    =  "    ",
        middle =  "  ? ",
        bottom =  "  ? "
        )
    val Empty: twoDimensionalString = 
        twoDimensionalString(
        top    =  "",
        middle =  "",
        bottom =  ""
        )
}