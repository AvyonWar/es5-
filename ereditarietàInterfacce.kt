// Scrivi due diverse implementazioni di 1 classe genitore e 2 figli che sovrascrivono un metodo: 
// uno che utilizza l'ereditarietà e un altro che utilizza le interfacce.

open class Family(val name: String, var age: Int){
    open fun sayHello(){
        println("Hello, my name in $name; ane i'm $age years old")
    }
}
class Mother : Family(name = "Rosy", age = 34){
    override fun sayHello(){
        println("Hello, my name in $name; and i'm the mon of two twins") // per richiamare i nomi dei due figli ho bisogno che la Classe Son sia un Interfaccia
    }                                                                   // così da poterla richiamare su  Classe Mother
}
class Son(name : String): Family(name = name, age = 12){
    override fun sayHello(){
        println("Hello, my name in $name; and i'm $age years old")
    }
}


fun main() {
    
    val mom = Mother()
    val son1 = Son("Lory")
    val son2 = Son("Mary")
    
    mom.sayHello()
    son1.sayHello()
    son2.sayHello()
   
    
  
}
