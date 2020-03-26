def concat(name: String) (age : String) (profession: String) : String = {
  name + " is " + age + " years old and is a " + profession
}

val addCurry1 : (String) => (String) => String = concat("Alfred")
val addCurry2 : (String) => String = addCurry1("21")

addCurry2("programmer")