class Tablero {
    private val N : Int = 3
    private var tablero : Array<CharArray> = Array(N){ CharArray(N) }
    private var jugador : String = ""
    private var empiezaJugador: Boolean = false // true = empieza jugador | false = empieza pc
    private var eleccion : Int = 0
    private var tirada : Char = ' '

    fun setJugador(Jugador:String){
        this.jugador=Jugador
    }
    fun getJugador():String{
        return jugador
    }
    fun setTablero(Tablero : Array<CharArray>){
        this.tablero = Tablero
    }
    fun getTablero():Array<CharArray>{
        return tablero
    }

    fun elegirOrden(){
        var eleccion:String=""
        while (eleccion.isEmpty()||eleccion!="si" && eleccion!="no"){
            println("Quieres empezar primero? /n Si /n No")
            eleccion= readln().lowercase()
            if (eleccion!="si"||eleccion!="no"){

            }else{
                println("La respuesto no es correcta vuelve a escribirlo")
            }
            if (eleccion=="si"){
               this.empiezaJugador=true
            }else{
                println("Va a empezar la máquina")
                this.empiezaJugador=false
            }
        }

    }

    fun comprobarTirada() {
        var tablero: Array<CharArray> = this.tablero
    }
    fun tiradajug(){
        if(this.empiezaJugador){
            this.tirada='X'
        }else{
            this.tirada='O'
        }
    }
    fun empezarTurno() {
        if (this.empiezaJugador) {
            this.eleccion = readln().toInt()
            when (this.eleccion) {
                1 -> tablero[0][0] = tirada
                2 -> tablero[0][1] = tirada
                3 -> tablero[0][2] = tirada
                4 -> tablero[1][0] = tirada
                5 -> tablero[1][1] = tirada
                6 -> tablero[1][2] = tirada
                7 -> tablero[2][0] = tirada
                8 -> tablero[2][1] = tirada
                9 -> tablero[2][2] = tirada
            }
        }
    }
    fun tiradaOrdenador(){
            var i: Int = 0
            var j: Int = 0
        while (tablero.isNotEmpty()){
            i = (0..2).random()
            j = (0..2).random()
            if (this.empiezaJugador) {
                this.tablero[i][j] = 'O'
            } else {
                this.tablero[i][j] = 'X'
            }
        }
    }
    fun jugar(){
        while (comprobarvictoria())
    }

    fun comprobarvictoria(){

    }
}