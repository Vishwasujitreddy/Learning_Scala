import scala.collection.mutable.ListBuffer
import scala.io.StdIn._



class intermediataryStage{
    var studentDatabase = ListBuffer[Student]()
    def getRequiredDetails()={
        val inputString = readLine("Enter the students ID, Name, Age, If they have graduated or not[true/false] separated by commas:\n")
        val processedString = inputString.split(",").map(_.trim)
        if(processedString.length<4){
            println("you have not entered all the required information try again ")
        }
        else if(processedString.length>4) {
            println("you have entered more information than required ")
        }
        else
            println("Got the right amount of info")


        var id:Int = processedString(0).toInt
        var name:String = processedString(1)
        var age:Int = processedString(2).toInt
        var gradStat:Boolean = processedString(3).toBoolean
        (id,name,age,gradStat) 

    }
    def addElement()={
        var addElement =  getRequiredDetails()      
        studentDatabase.append(new Student(addElement._1 ,addElement._2 ,addElement._3 , addElement._4))
    }
    def alterElement()={
        if(!studentDatabase.isEmpty){
            var alterElement =  getRequiredDetails()
            var indexLogic = studentDatabase.indexOf(studentDatabase.filter(x => (x.getStudentID() == alterElement._1)).headOption)
            println(indexLogic)
            if (indexLogic!= {-1}){
                studentDatabase.update(indexLogic, new Student(alterElement._1 ,alterElement._2 ,alterElement._3 , alterElement._4))
            }
            else {
                if(scala.io.StdIn.readLine("the value you entered wasnt in the list so do you want to append it?\n").toLowerCase()=="yes"){
                    studentDatabase.append(new Student(alterElement._1 ,alterElement._2 ,alterElement._3 , alterElement._4))
                }
                else 
                    println("alright then")   
            }
        }
        else
            println("the list is empty and we cannot update, please enter a value first")  
    }
    def deleteElement()={
        var deleteElement = getRequiredDetails()
        if(!studentDatabase.isEmpty){
            var indexLogic = studentDatabase.indexOf(studentDatabase.filter(x => (x.getStudentID() == deleteElement._1)).head)
            if (indexLogic!= {-1}){
                studentDatabase.remove(indexLogic)                
            }
            else {
                println("the value you entered wasnt in the list. So it wasnt entered or it was deleted previous")                    
            }
        }
        else
            println("there is nothing to delete the list is empty")
    }
    def viewElements()={
        for(i <- studentDatabase)
        println(i.tooString())     
    }
}
    