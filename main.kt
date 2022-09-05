/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
interface Obra {
    fun cadastrar()
    val nome:String
}

class Livro:Obra{
    val titulo:String = "Nome do livro"
    override val nome: String = "$titulo"
    
    override fun cadastrar(){
        
    }

    fun Buscar (nome:String){
      println(nome)
    }
}

class Midia:Obra{
    val classificacao:String = "Codigo"
    override val nome:String = "$classificacao"
    override fun cadastrar(){
        
    }
}

fun main() {
    
    println("Hello, world!!!")
}