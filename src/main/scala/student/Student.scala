class Student(private  var studentID:Int ,private  var studentName:String, private  var studentAge:Int, private  var studentGraduationStatus:Boolean){

    def getStudentID():Int  = {
        return studentID
    }
    def getStudentName():String  = {
        return studentName
    }
    def getStudentAge():Int  = {
        return studentAge
    }
    def getStudentGraduationStatus():Boolean  = {
        return studentGraduationStatus
    }
    def setStudentID(studentIDinput:Int)  = {
        studentID = studentIDinput
    }
    def setStudentName(studentNameinput:String) = {
       studentName = studentNameinput
    }
    def setStudentAge(studentAgeinput:Int)  = {
        studentAge = studentAgeinput
    }
    def setStudentGraduationStatus(studentGraduationStatusinput:Boolean)  = {
        studentGraduationStatus = studentGraduationStatusinput
    }
     def tooString(): String = {
        return s"Student Details:${studentID}, ${studentName}, ${studentAge}, ${studentGraduationStatus}"
    }

}
