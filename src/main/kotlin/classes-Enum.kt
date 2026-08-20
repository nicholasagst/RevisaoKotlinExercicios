fun calculaBonus(cargo: Cargo) {

    if (cargo == Cargo.DIRETOR){
        5000f
    } else if (cargo == Cargo.GERENTE){
        3000f
    } else {
        2000f
    }
}


fun main() {
    calculaBonus(Cargo.DIRETOR)
}