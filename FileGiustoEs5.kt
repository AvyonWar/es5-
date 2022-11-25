/**
 * Ho preferito fare un es più completo.
 * _è presente una sotto classe aggiuntiva 
 * _entrambe le classi FIGLIO ereditano la SuperClasse e l'interfacce
 * _ho voluto sperimentare alcune cose lette sul sito di Kotlin
 **/

open class Family(val name: String, var age: Int){                      //classe genitore
    open fun sayHello(){
        println("Hello, my name is $name; ane i'm $age years old")
    }
}

//classe mamma implementa Superclasse
class Mother : Family(name = "Rosy", age = 34){                         //classe aggiuntiva nn richiesta
    override fun sayHello(){
        println("Hello, my name is $name; and i'm the mon of two kids") 
    }                                                                 
}

// interfaccia
interface GoToSchool{
    val schoolYears: String
    val schoolName: String
    fun goToSchool(): String{                                              //metodo costruttore --> per far si che finzioni l'interfaccia
        return "I go to the $schoolYears year of $schoolName school."       //specificare di che tipo è il RETURN
    }
}

//classe figli implemntano Interfaccia e Superclasse
class Son1(name: String, override val schoolYears: String, override val schoolName: String): Family(name = name, age = 12), GoToSchool{     // posso passare ank var di altre i
    override fun sayHello(){
        println("Hello, my name is $name; and i'm $age years old. \nI have a littel sister.")                                               //superclassi
    }
   
}

class Son2(override val schoolYears: String, override val schoolName: String): Family(name = "Mary", age = 6), GoToSchool{
     override fun sayHello(){
        println("Hello, my name is $name; and i'm $age years old. \nI have a big brother.")            
    }
}
  


fun main() {
    
    val mom = Mother()
    val son1 = Son1("Lucas", "Second", "Middle")
    val son2 = Son2("First", "Elementary")
    
    mom.sayHello()
     println("\n")
    son1.sayHello()
    println(son1.goToSchool())
     println("\n")
    son2.sayHello()
    println(son2.goToSchool())
    
}

// madonna che parto per far funziona l'interfaccia  -.-
