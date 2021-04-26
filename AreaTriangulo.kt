fun main(args: Array<String>){
  var b : Int
  var h : Int
  print("Ingrese base: ")
  b = readLine()!!.toInt()
  print("Ingrese altura: ")
  h = readLine()!!.toInt()
  var area : Int
  area = b*h/2
  println("El área del triangulo es: $area")
}java –jar AreaTK.jar